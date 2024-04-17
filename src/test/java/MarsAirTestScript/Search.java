package MarsAirTestScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.Setup;
import marsAirPages.SearchPage;

public class Search extends Setup {
	
	SearchPage searchobj ;
	
	
	@BeforeTest
	public void setup() {
		Setup.driversetup();
	}
	
	@AfterTest
	public void tearDown() {
		
	//	softAssert.assertAll();
		
	}

	
	@Test
	public void ToValidateSearchLabelValue() {
		
		searchobj = new SearchPage();
		searchobj.validateDeptureValue("departure");
		searchobj.validateReturingValue("return");
		searchobj.validatePromoCodeValue("Promotional Code");
		softAssert.assertAll();
		
		
		
	}
	
	

}
