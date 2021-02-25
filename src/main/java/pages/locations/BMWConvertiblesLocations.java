package pages.locations;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BMWConvertiblesLocations {

	@FindBy(how=How.XPATH,using="//h1[contains(text(),'Certified BMW Convertibles for Sale in Alpharetta,')]")
	public WebElement bmwHeading;
	
	@FindBy(how=How.XPATH,using="//*[@data-cmp='inventoryListing']")
	public List<WebElement> listOfBMW;
	
}
