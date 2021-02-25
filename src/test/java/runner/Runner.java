package runner;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;

import org.testng.annotations.BeforeClass;

import com.vimalselvam.cucumber.listener.ExtentProperties;

import io.cucumber.java.it.Date;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src/test/resources/features/"},
		glue = "steps",
		plugin = {"json:target/Runner/cucumber.json","pretty","html:target/Runner/cuccmber.html"
				},
		monochrome = true,
		dryRun = false
		//tags = {"@HomePage"}
		
		)
public class Runner extends AbstractTestNGCucumberTests {
	/*
	 * @BeforeClass public static void setup() { // Initiates the extent report and
	 * //generates the output in the output/Run_<unique timestamp>/report.html file
	 * by //default. SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
	 * Date curDate = new Date(); String strDate = sdf.format(curDate); // String
	 * fileName
	 * System.getProperty("user.dir")+"\\target\\Extent_Reports\\" + strDate+".html"
	 * ; //File newFile = new File(fileName);
	 * 
	 * ExtentProperties extentProperties = ExtentProperties.INSTANCE;
	 * extentProperties.setReportPath(System.getProperty("user.dir")
	 * +"\\target\\Extent_Reports\\" + strDate+".html"); // File newFile = new
	 * File(fileName);
	 * //ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
	 * //static report name
	 * //ExtentCucumberFormatter.initiateExtentCucumberFormatter(new
	 * File("F:\\cucumber-testing-master\\ExtenReports\\extentreports.html"),false);
	 * // Loads the extent config xml to customize on the report.
	 * //ExtentCucumberFormatter.loadConfig(new
	 * File("src/test/resources/extent-config.xml"));
	 * 
	 * // User can add the system information as follows
	 * //com.cucumber.listener.ExtentCucumberFormatter.addSystemInfo("Browser Name",
	 * "Chrome"); //
	 * com.cucumber.listener.ExtentCucumberFormatter.addSystemInfo("Browser version"
	 * , "v31.0"); // com.cucumber.listener.ExtentCucumberFormatter.
	 * addSystemInfo("Selenium version", "v2.53.0");
	 * 
	 * // Also you can add system information using a hash map //Map systemInfo =
	 * new HashMap(); //systemInfo.put("Cucumber version", "v1.2.5");
	 * //systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
	 * //com.cucumber.listener.ExtentCucumberFormatter.addSystemInfo(systemInfo); }
	 */	 
}
