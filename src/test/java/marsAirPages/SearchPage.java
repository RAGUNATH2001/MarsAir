package marsAirPages;

import static org.testng.Assert.assertEquals;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import BaseTest.Setup;
import utility.readconfig;

public class SearchPage extends Setup  {
	
	

	public SearchPage() {
		PageFactory.initElements(driverobj, this);
	}
	
	//locator 
	
	@FindBy(xpath = "//h2[.=\"Welcome to MarsAir!\"]" )
	WebElement formheadertitle;
	
	@FindBy(xpath = "//h3[.=\"Book a ticket to the red planet now!\"]")
	WebElement formsubtitle;
	
	//label 
	
	@FindBy(xpath = "//label[.='Departing']")
	WebElement labeldepture;
	
	@FindBy(xpath = "//label[.='Returning']")
	WebElement labelreturning;
	
	@FindBy(xpath="//label[.='Promotional Code']")
	WebElement labelpromocode;
	
	//DropDown
	
	@FindBy(xpath = "//select[@id=\"departing\"]")
	WebElement dropdowndepture;
	
	@FindBy(xpath = "//select[@id=\"returning\"]")
	WebElement dropdownreturning;
	
	@FindBy(xpath = "//input[@id=\"promotional_code\"]")
	WebElement inputpromocode;
	
	@FindBy(xpath = "//input[@value=\"Search\" and @type=\"submit\"]")
	WebElement buttonSearch;
	
	
	//Action 
	
	public void validateDeptureValue(String departure) {
		softAssert.assertEquals( labeldepture.getText(), departure);
	}
	
	public void validateReturingValue(String returning) {
		softAssert.assertEquals(labelreturning.getText(),returning );
	}
	
	public void validatePromoCodeValue(String promocode) {
		softAssert.assertEquals(labelpromocode.getText(), promocode);
	}
	
	
	
	

}
