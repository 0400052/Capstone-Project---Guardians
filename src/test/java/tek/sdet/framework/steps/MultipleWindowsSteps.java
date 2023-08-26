package tek.sdet.framework.steps;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class MultipleWindowsSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	

	@Then("User click on Test Selenium link")
	public void userClickOnTestSeleniumLink() {
		click(factory.multiPage().testSeleniumLink);
		logger.info("Test Selenium link was clicked successfully");

	}
	@Then("User verify {string} page")
	public void userVerifyPage(String string) {
		
		Set<String> allWindows = getDriver().getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		while(itr.hasNext()) {
			String childWin = itr.next();
			getDriver().switchTo().window(childWin);
		}
		Assert.assertEquals(string, factory.multiPage().addOrRemoveElements.getText());
		logger.info("Add or Remove Element text was verified successfully");

	}
	@Then("User click on the Add Element button")
	public void userClickOnTheAddElementButton() {
		click(factory.multiPage().addNewElementBttn);
		logger.info("Add New Element button was clicked successfully");

	}
	@Then("User verify Remove element is added to the page")
	public void userVerifyRemoveElementIsAddedToThePage() {
		String expected = "";
		String actual = factory.multiPage().removeElement.getText();
		Assert.assertEquals(expected, actual);
		logger.info("Remove element was verified successfully");
		

	}

}
