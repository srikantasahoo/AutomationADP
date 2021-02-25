package pages.actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import pages.locations.AutoTradingHomePageLocators;
import utils.SeleniumDriver;

public class AutoTradingHomePageAction {

	AutoTradingHomePageLocators autoTradingHomePageLocators = null; 
	
	public AutoTradingHomePageAction() {
		this.autoTradingHomePageLocators = new AutoTradingHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), autoTradingHomePageLocators);
	}
	
	public void browsebyMakeLink(){
		System.out.println("Browse By make Link is Present :"+autoTradingHomePageLocators.browsebyMakeLink.isEnabled());
	            	
		}
	
	public void browsebyStyleLink() {
		
            	System.out.println("Browse By Style Link is Present :"+autoTradingHomePageLocators.browsebyStyleLink.isEnabled());            	
		
	}
	
	public void advanceSearchLink() {
            	System.out.println("Advanced Search Link is Present :"+autoTradingHomePageLocators.advanceSearchLink.isEnabled());            	
	}
	
	public void searchButton() {
		System.out.println("Search Button is Present :"+autoTradingHomePageLocators.searchBtn.isEnabled());
	}
	
	public void anymakeDropdown() {
		System.out.println(" And Drop down is present:"+autoTradingHomePageLocators.anymakeDropdown.isEnabled());
	}
	
	public void anyModelDropdown() {
		System.out.println(" AndDrop down is present:"+autoTradingHomePageLocators.anyModelDropDown.isEnabled());
	}
	
	public String advancedSearchLinkClick() {
		String clickonLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		autoTradingHomePageLocators.advanceSearchLink.sendKeys(clickonLink);
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
