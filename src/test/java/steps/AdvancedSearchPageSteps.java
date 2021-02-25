package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.AdvancedSearchPageAction;
import pages.actions.AutoTradingHomePageAction;
import utils.SeleniumDriver;

public class AdvancedSearchPageSteps {

	AutoTradingHomePageAction autoTradingHomePageAction = new AutoTradingHomePageAction();
	AdvancedSearchPageAction advancedSearchPageAction = new AdvancedSearchPageAction();

	@When("^Click on the Advanced Search Button link and page navigate to \"([^\"]*)\"$")
	public void click_on_the_Advanced_Search_Button_link_and_page_navigate_to(String expectedTitle) throws Throwable {
	
		String actualTitle = autoTradingHomePageAction.advancedSearchLinkClick();
		 SeleniumDriver.waitForPageToLoad();
		 System.out.println("*****************Page Navigate to Advanced Search Page******");
		 //String actualTitle = advancedSearchPageAction.verifyAdvancedSearchPage_Title();
			System.out.println(actualTitle);
	}

	@Then("^Enter the ZipCode in text box$")
	public void enter_the_ZipCode_in_text_box() throws Throwable {
		advancedSearchPageAction.zipCode();
	}

	@Then("^Select the Certified Check Box under Condition$")
	public void select_the_Certified_Check_Box_under_Condition() throws Throwable {
		advancedSearchPageAction.certifiedCheckBox();
	}

	@Then("^Select the Convertible check box under Style$")
	public void select_the_Convertible_check_box_under_Style() throws Throwable {
		advancedSearchPageAction.convertibleCheckBox();
	}

	@Then("^Update the Year drop down menus as follows: select \"([^\"]*)\" as From year and select \"([^\"]*)\" as To year$")
	public void update_the_Year_drop_down_menus_as_follows_select_as_From_year_and_select_as_To_year(String arg1, String arg2) throws Throwable {
		advancedSearchPageAction.fromYearDropDown(arg1);
		advancedSearchPageAction.toYearDropBox(arg2);
	}

	@Then("^Select Make as BMW under Make, Model & Trim section$")
	public void select_Make_as_BMW_under_Make_Model_Trim_section() throws Throwable {
		advancedSearchPageAction.anyMakeDropBox();
	}

	@Then("^Click on the Search button$")
	public void click_on_the_Search_button() throws Throwable {
		advancedSearchPageAction.searchBtn();
	}
	

}
