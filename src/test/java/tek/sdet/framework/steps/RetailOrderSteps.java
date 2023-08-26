package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	
	// POMFactory to access the locators 
	POMFactory factory = new POMFactory();
	
	@Then("User change the category to {string}")
	public void userChangeTheCategoryTo(String category) {
		selectByVisibleText(factory.orderPage().allDepartmentDropdown, category);
		logger.info("Category was selected successfully from dropdown");

	}
	@Then("User search for an item {string}")
	public void userSearchForAnItem(String kasaOutdoorSmartPlug) {
		sendText(factory.orderPage().searchInputField, kasaOutdoorSmartPlug);
		logger.info("Item name was entered successfully");

	}
	@Then("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.orderPage().searchBttn);
		logger.info("Search button was clicked successfully");
		

	}
	@Then("User click on item")
	public void userClickOnItem() {
		click(factory.orderPage().itemKasaoutdoorsmartplug);
		logger.info("Item was added successfully");

	}
	@Then("User select quantity {string}")
	public void userSelectQuantity(String itemQty) {
		selectByVisibleText(factory.orderPage().qtyDropdown, itemQty);
		logger.info("item quantity was selected successfully");

	}
	@Then("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.orderPage().addToCartBttn);
		logger.info("Cart button was clicked successfully");

	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String itemQtyInTheCart) {
		Assert.assertEquals(itemQtyInTheCart, factory.orderPage().cartQty.getText());
		logger.info("Item qty in the cart was validated successfully");

	}
	// add item to the cart and place your order
	
	@Then("User change the category to {string} Apex Legends")
	public void userChangeTheCategoryToApexLegends(String electronics) {
		selectByVisibleText(factory.orderPage().allDepartmentDropdown, electronics);
		logger.info("Category changed to electronics successfully");

	}
	@Then("User search for an item {string} Apex Legends")
	public void userSearchForAnItemApexLegends(String apexLegends) {
		sendText(factory.orderPage().searchInputField, apexLegends);
		logger.info("Item name was entered successfully");

	}
	@Then("User click on item Apex Legends")
	public void userClickOnItemApexLegends() {
		click(factory.orderPage().apexLegendsItem);
		logger.info("Item Apex Legends was clicked successfully");

	}
	@Then("User select quantity {string} for Apex Legends")
	public void userSelectQuantityForApexLegends(String apexLegendsQty) {
		selectByVisibleText(factory.orderPage().qtyDropdown, apexLegendsQty);
		logger.info("Apex Legends Quantity selected successfully");

	}
	@Then("the cart icon quantity should change to {string} Apex Legends")
	public void theCartIconQuantityShouldChangeToApexLegends(String itemsQtyInTheCart) {
		Assert.assertEquals(itemsQtyInTheCart, factory.orderPage().cartQty.getText());
		logger.info("Item qty in the cart was validated successfully");

	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.orderPage().cartBttn);
		logger.info("Cart Button was clicked successfully");

	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.orderPage().proceedToCheckoutBttn);
		logger.info("proceed to checkout button was clicked successfully");

	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.orderPage().placeOrderBttn);
		logger.info("Placed the order successfully");

	}
	//cancel order steps
	
	@Then("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderLink);
		logger.info("order link was clicked successfully");

	}
	@Then("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> listOfOrder = factory.orderPage().listOfOrders;
		for(int i = 0; i < listOfOrder.size(); i++) {
			if(listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
				
			}else if(listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(factory.orderPage().listOfOrders.get(i));
			}
			
		}
		logger.info("First order in the list clicked");

	}
	@Then("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		List<WebElement> cancelBttns = factory.orderPage().cancelOrderBttn;

			click(cancelBttns.get(0));
			// to cancel all orders  use for loop
//			for(int i = 0; i < cancelBttns.size(); i++) {
//				click(cancelBttns.get(i));
//			}

		logger.info("Order cancel button was clicked");

	}
	@Then("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancelationReason) {
		selectByVisibleText(factory.orderPage().reasonForCancelation, cancelationReason);
		logger.info("cancelation reason was selected");

	}
	@Then("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelationSubmitBttn);
		logger.info("Cancel Button was clicked successfully");

	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String CancelationSuccessMssg) {
		Assert.assertEquals(CancelationSuccessMssg, factory.orderPage().orderCancelSuccessMssg.getText());
		logger.info("Cancelation success message was verified successfully");

	}
	
	//User can return order
	
	@Then("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnBttn);
		logger.info("Return Button clicked");

	}
	@Then("User select the Return Reason {string}")
	public void userSelectTheReturnReasonItemDamaged(String returnReasonType) {
		selectByVisibleText(factory.orderPage().returnReason, returnReasonType);
		logger.info("Return Reason clicked");

	}
	@Then("User select the drop off service {string}")
	public void userSelectTheDropOffServiceFedEx(String carrier) {
		selectByVisibleText(factory.orderPage().returnCarrier, carrier);
		logger.info("Carrier Selected");

	}
	@Then("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderBttn);
		logger.info("Return order button clicked");

	}
	@Then("a return message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful(String ReturnSuccessMssg) {
		Assert.assertEquals(ReturnSuccessMssg, factory.orderPage().returnSuccessMessg.getText());
		logger.info("Item Returned Successfully");

	}
	
	// User write review 
	
	@Then("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewBtn);
		logger.info("Review button clicked");

	}
	@Then("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText(String Subject, String Body) {
		sendText(factory.orderPage().headlineInput, Subject);
		sendText(factory.orderPage().descriptionInput, Body);
		logger.info("Subject line filled out successfully" + Subject + "description filled out successfully" + Body);

	}
	@Then("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addReviewBttn);
		logger.info("Review Added Successfully");

	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully(String reviewAddedSuccess) {
	//	if (reviewAddedSuccess.contains("Your review was added successfully")) {
			waitTillPresence(factory.orderPage().reviewSuccessMssg);
		
		Assert.assertEquals(reviewAddedSuccess, factory.orderPage().reviewSuccessMssg.getText());
		logger.info("Reviewed Message Displayed Successfully");

	}
	
	
	

}
