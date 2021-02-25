package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locations.BMWConvertiblesLocations;
import utils.SeleniumDriver;

public class BMWConvertiblesLocationsAction {

	BMWConvertiblesLocations bMWConvertiblesLocations = null;
	public BMWConvertiblesLocationsAction() {
		this.bMWConvertiblesLocations = new BMWConvertiblesLocations();
		PageFactory.initElements(SeleniumDriver.getDriver(), bMWConvertiblesLocations);
	}
	
	public String verifyCurrentURL() {
		String url = SeleniumDriver.getDriver().getCurrentUrl();
		return url;
	}
	
	public String bmwHeading() {
		String heading =bMWConvertiblesLocations.bmwHeading.getText();
		return heading;
	}
	
	public void listOfBMW() {
		
		for(int i=0;i<bMWConvertiblesLocations.listOfBMW.size();i++) {
			int numberOfBMW = 0;
			String name = bMWConvertiblesLocations.listOfBMW.get(i).getText();
			if(name.equalsIgnoreCase("Certified 2017 BMW")) {
				numberOfBMW++;
			}
			System.out.println("Total Number Of BMW Listed: "+numberOfBMW);
		}
	}
}
