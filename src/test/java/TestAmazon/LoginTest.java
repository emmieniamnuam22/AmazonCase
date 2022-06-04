package TestAmazon;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmazonPage.loginPage;
import Utilities.Emmie_BaseClass;

public class LoginTest {
	
	
	loginPage lP = new loginPage();
	
	
	@BeforeMethod
	public void setUp() {
		
		Emmie_BaseClass.getDriver();
	}

	@Test 
	public void navigateToSigninButton() {
		lP.signInClick();
		
	}
	
	@Test
	public void emailInput() {
		lP.emailInput();
	}
	
	
	@AfterClass
	public void tearDown() {
		Emmie_BaseClass.tearDown();
	}
}
