package BaseTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import utility.readconfig;

public class Setup {
	
	public static  WebDriver driverobj ;
	protected SoftAssert softAssert = new SoftAssert();
	

	public static  void driversetup()  {
		
		String browsertype = readconfig.readconfigfile().getProperty("browsertype");
		String url = readconfig.readconfigfile().getProperty("url");
		
		switch (browsertype) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driverobj = new ChromeDriver();
			
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driverobj = new EdgeDriver();

		default:
			System.out.println("Driver not Defined");
			break;
		}
	
		driverobj.get(url);
		driverobj.manage().window().maximize();
		
		
		
		
	}

}
