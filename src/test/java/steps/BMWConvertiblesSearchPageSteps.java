package steps;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pages.actions.AdvancedSearchPageAction;
import pages.actions.BMWConvertiblesLocationsAction;
import utils.SeleniumDriver;

public class BMWConvertiblesSearchPageSteps {

	AdvancedSearchPageAction advancedSearchPageAction = new AdvancedSearchPageAction();
	BMWConvertiblesLocationsAction bMWConvertiblesLocationsAction = new BMWConvertiblesLocationsAction();
	@Then("^Page Navigate to \"([^\"]*)\" Page$")
	public void page_Navigate_to_Page(String expectedTitle) throws Throwable {
		String actualTitle = advancedSearchPageAction.searchBtn();
		//String actualTitle = bMWConvertiblesLocationsAction.verifyBMWPage_Title();
		 SeleniumDriver.waitForPageToLoad();
		 System.out.println("*****************Page Navigate to BMW Search Page******");
		 System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Then("^Assert that you see only BMW cars in the results page$")
	public void assert_that_you_see_only_BMW_cars_in_the_results_page() throws Throwable {
		String heading = bMWConvertiblesLocationsAction.bmwHeading();
		System.out.println("Heading of the page is :"+heading);
		bMWConvertiblesLocationsAction.listOfBMW();
	}
	
}
