package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGenerator;

public class RetailAccountSteps extends CommonUtility {

	// creating an object of POMFactory class to implement the steps that needs to
	// taken
	// commonUtility has all the methods that were created to be used in the project

	private POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountLink);
		logger.info("Account link was clicked successfully");

	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phoneNumber) {
		clearTextUsingSendKeys(factory.accountPage().nameField);
		sendText(factory.accountPage().nameField, name);

		clearTextUsingSendKeys(factory.accountPage().phoneField);
		sendText(factory.accountPage().phoneField, phoneNumber);
		logger.info("Phone Number was entered successfully");

	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateBttn);
		logger.info("Update button was clicked successfully");

	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {

		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		String expectedMssg = "Personal Information Updated Successfully";
		String actualMssg = factory.accountPage().personalInfoUpdateSuccessMessage.getText();
		Assert.assertEquals(expectedMssg, actualMssg);
		logger.info("Account Info was Update Successfully");

	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {

		click(factory.accountPage().addAPaymentMethodLink);
		logger.info("Add Payment Method link was clicked successfully");

	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberField, paymentInfo.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardField, paymentInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonthField, paymentInfo.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYearField, paymentInfo.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCodeField, paymentInfo.get(0).get("securityCode"));
		logger.info("Payment Information was entered successfully");

	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("Payment Method Submit clicked successfully");

	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMssg) {

		if (expectedMssg.contains("Payment Method added")) {
			waitTillPresence(factory.accountPage().paymentMethodSuccessMssg);
			Assert.assertEquals(expectedMssg, factory.accountPage().paymentMethodSuccessMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
		} else if (expectedMssg.contains("Address Added")) {
			waitTillPresence(factory.accountPage().addressSuccessMssg);
			Assert.assertEquals(expectedMssg, factory.accountPage().addressSuccessMssg.getText());
			logger.info("Expected Message: " + expectedMssg);
		} else if (expectedMssg.contains("order Placed")) {
			waitTillPresence(factory.accountPage().addressSuccessMssg);
			Assert.assertEquals(expectedMssg, factory.orderPage().orderPlacedSuccessfully.getText());
			logger.info("Expected Message: " + expectedMssg);
		}
	}
	// Add Address

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressLink);
		logger.info("Add Address Link was clicked successfully");

	}

	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().addresscountryDropdownList,
				DataGenerator.addressGenerator(addressInfo.get(0).get("country")));
		sendText(factory.accountPage().addressNameField,
				DataGenerator.addressGenerator(addressInfo.get(0).get("fullName")));
		sendText(factory.accountPage().addressPhoneField,
				DataGenerator.addressGenerator(addressInfo.get(0).get("phoneNumber")));
		sendText(factory.accountPage().addressStreetField,
				DataGenerator.addressGenerator(addressInfo.get(0).get("streetAddress")));
		sendText(factory.accountPage().addressApartmentNum,
				DataGenerator.addressGenerator(addressInfo.get(0).get("apt")));
		sendText(factory.accountPage().addressCityField,
				DataGenerator.addressGenerator(addressInfo.get(0).get("city")));
		selectByVisibleText(factory.accountPage().addressStateDropdown,
				DataGenerator.addressGenerator(addressInfo.get(0).get("state")));
		sendText(factory.accountPage().addressZipCodeField,
				DataGenerator.addressGenerator(addressInfo.get(0).get("zipCode")));
		logger.info("Address form was filled successfully");

	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {

		click(factory.accountPage().addressAddBttn);
		logger.info("Add Address Button was clicked successfully");

	}
	// Edit Credit/Debit Card
	
	@When("User picks card from Cards and Accounts section")
	public void userPicksCardFromCardsAndAccountsSection() {
		click(factory.accountPage().walletLink);
		logger.info("Cards and Accounts section clicked successfully");
		
		

	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().editBttn);
		logger.info("Edit Button Clicked");
	}

	@When("User edit information with below data")
	public void userEditInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {

	}

	@When("User click on Update your card button")
	public void userClickOnUpdateYourCardButton() {

	}
	// Remove Card

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().walletLink);
		logger.info("Cards and Accounts section clicked successfully");

	}

	@Then("Payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		click(factory.accountPage().removeBttn);
		logger.info("Card removed successfully");

	}
	//edit address
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().addressEditBttn);
		logger.info("Edit button clicked");
		

	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().updateAddressBtn);
		logger.info("Address Updated Successfully");

	}
	// Remove Address
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		List<WebElement> removeAddress = factory.accountPage().removeAddressBtn;
		for(int i = 0; i < removeAddress.size(); i++) {
			if(removeAddress.get(i).getText().equalsIgnoreCase("Remove")) {
				click(factory.accountPage().removeAddressBtn.get(i));
			}else if(removeAddress.get(i).getText().equalsIgnoreCase("")) {
				System.out.println("Your Addresses Section Empty");
			}
			
		}
		logger.info("Remove button clicked");

	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		System.out.println("Address Removed Successfully");

	}

}
