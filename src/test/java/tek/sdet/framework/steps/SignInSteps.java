package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		Assert.assertTrue(factory.signInPage().tekschoolLogo.isDisplayed());
	}
	
	@When("User click on Sign in option")
	public void UserclickonSigninoption() {
		click(factory.signInPage().signinlink);
		logger.info("Login link was clicked successfully");
		
	}
	
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("User successfully entered email" + email + " and password" + password);
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginBtn);
		logger.info("user clicked login button");
	}
	@Then("User Should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().acctLink));
		logger.info("Account button is displayed");
	}
	
	//register account section
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createAcctBttn);
		logger.info("User cliked Create New Acct Button");
		
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> signUpInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().signUpNameField,signUpInformation.get(0).get("name"));
		sendText(factory.signInPage().signUpEmailField,signUpInformation.get(0).get("email"));
		sendText(factory.signInPage().signUpPassField,signUpInformation.get(0).get("password"));
		sendText(factory.signInPage().signUpConfirmPassField,signUpInformation.get(0).get("confirmPassword"));
	
		
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUpbttn);
		logger.info("User clicked Sign Up Button Successfully");
		
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().yourProfileText));
		
	}



}