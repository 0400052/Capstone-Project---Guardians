package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);

	}
	
	@FindBy(xpath = "//*[contains(text(),'TEKSCHOOL')]")
	public WebElement tekschoolLogo;
	
	@FindBy(xpath = "//a[@id='signinLink']")
	public WebElement signinlink;
	
	@FindBy(xpath = "//input[@id ='email']")
	public WebElement emailField;
	
	@FindBy(xpath = "//input[@id ='password']")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[@type ='submit']")
	public WebElement loginBtn;
	
	@FindBy(id = "accountLink")
	public WebElement acctLink;
	
	@FindBy(linkText = "Create New Account")
	public WebElement createAcctBttn;
	
	@FindBy(id = "nameInput")
	public WebElement signUpNameField;
	
	@FindBy(id = "emailInput")
	public WebElement signUpEmailField;
	
	@FindBy(xpath = "//input[@id='passwordInput']")
	public WebElement signUpPassField;
	
	@FindBy(xpath = "//input[@id='confirmPasswordInput']")
	public WebElement signUpConfirmPassField;
	
	@FindBy(xpath = "//button[@id= 'signupBtn']")
	public WebElement signUpbttn;
	
	@FindBy(xpath = "//h1[text()='Your Profile']")
	public WebElement yourProfileText;
	
	
	



}
