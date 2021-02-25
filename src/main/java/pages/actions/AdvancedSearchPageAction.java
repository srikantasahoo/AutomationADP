package pages.actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locations.AdvancedSearchPageLocators;
import utils.SeleniumDriver;

public class AdvancedSearchPageAction {

	AdvancedSearchPageLocators advancedSearchPageLocators = null;
	public AdvancedSearchPageAction() {
		this.advancedSearchPageLocators = new AdvancedSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), advancedSearchPageLocators);
	}
	
	public String verifyCurrentURL() {
		String url = SeleniumDriver.getDriver().getCurrentUrl();
		return url;
	}

	
	/*
	 * public String verifyAdvancedSearchPage_Title() { String mainWindow =
	 * SeleniumDriver.getDriver().getWindowHandle(); String pageTitle = null; // It
	 * returns no. of windows opened by WebDriver and will return Set of Strings
	 * Set<String> set = SeleniumDriver.getDriver().getWindowHandles(); // Using
	 * Iterator to iterate with in windows Iterator<String> itr = set.iterator();
	 * while (itr.hasNext()) { String childWindow = itr.next(); // Compare whether
	 * the main windows is not equal to child window. If not equal, // we will
	 * close. if (!mainWindow.equals(childWindow)) {
	 * SeleniumDriver.getDriver().switchTo().window(childWindow); pageTitle =
	 * SeleniumDriver.getDriver().switchTo().window(childWindow).getTitle();
	 * System.out.println(pageTitle);
	 * 
	 * } } return pageTitle; }
	 */
	 
	
	public void zipCode() {
		advancedSearchPageLocators.zipCode.sendKeys("30004");      	
		}
	
	public void certifiedCheckBox(){
		advancedSearchPageLocators.certifiedCheckBox.click();      	
		}
	
	public void convertibleCheckBox() {
		advancedSearchPageLocators.convertibleCheckBox.click();      	
		}
	
	public void fromYearDropDown(String yearFrom){
		Select select = new Select(advancedSearchPageLocators.fromYearDropDown);
		select.selectByVisibleText(yearFrom);      	
		}
	
	public void toYearDropBox(String yearTo)  {
		Select select = new Select(advancedSearchPageLocators.toYearDropBox);
		select.selectByVisibleText(yearTo);      	
		}
	
	public void anyMakeDropBox() {
		Select select = new Select(advancedSearchPageLocators.anyMakeDropBox);
		select.selectByVisibleText("BMW");      	
		}
	
	public String searchBtn() {
		String clickonLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		advancedSearchPageLocators.searchBtn.sendKeys(clickonLink);
		String mainWindow = SeleniumDriver.getDriver().getWindowHandle();
		String pageTitle = null;
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set = SeleniumDriver.getDriver().getWindowHandles();
		// Using Iterator to iterate with in windows
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			// Compare whether the main windows is not equal to child window. If not equal,
			// we will close.
			if (!mainWindow.equals(childWindow)) {
				SeleniumDriver.getDriver().switchTo().window(childWindow);
				pageTitle = SeleniumDriver.getDriver().switchTo().window(childWindow).getTitle();
				System.out.println(pageTitle);

			}
		}
		return pageTitle;
	}
}
