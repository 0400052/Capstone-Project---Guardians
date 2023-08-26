package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	// creating the constructor here to initialize the elements 
	
	public RetailOrderPage()	{
		PageFactory.initElements(getDriver(), this);
		
	}
	
	@FindBy(id = "search")
	public WebElement allDepartmentDropdown;
	
	@FindBy(id = "searchInput")
	public WebElement searchInputField;
	
	@FindBy(id = "searchBtn")
	public WebElement searchBttn;
	
	@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement itemKasaoutdoorsmartplug;
	
	@FindBy(xpath = "//select[starts-with(@class,'product')]")
	public WebElement qtyDropdown;
	
	@FindBy(id = "addToCartBtn")
	public WebElement addToCartBttn;
	
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartQty;
	
	@FindBy(id = "cartBtn")
	public WebElement cartBttn;
	
	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckoutBttn;
	
	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBttn;
	
	@FindBy(xpath = "//div[text()='Order Placed Successfully']")
	public WebElement orderPlacedSuccessfully;
	
	@FindBy(xpath = "//img[starts-with(@alt,'Apex Legends')]")
	public WebElement apexLegendsItem;
	
	//cancelorder scenario page elements
	
	@FindBy(id = "orderLink")
	public WebElement orderLink;
	
	@FindBy(xpath = "//div[@class='order']//descendant::p[7]")
	public List<WebElement> listOfOrders; // two orders so need to use list of webelements
	
	@FindBy(xpath = "//button[text() = 'Cancel The Order']")
	public List<WebElement> cancelOrderBttn;
	
	@FindBy(id = "reasonInput")
	public WebElement reasonForCancelation;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelationSubmitBttn;
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement orderCancelSuccessMssg;
	
	// User can return order
	
	@FindBy(id = "returnBtn")
	public WebElement returnBttn;
	
	@FindBy(id = "reasonInput")
	public WebElement returnReason;
	
	@FindBy(id = "dropOffInput")
	public WebElement returnCarrier;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement returnOrderBttn;
	
	@FindBy(xpath = "//p[text() ='Return was successfull']")
	public WebElement returnSuccessMessg;
	
	// User write review 
	
	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineInput;
	
	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement addReviewBttn;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewSuccessMssg;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
