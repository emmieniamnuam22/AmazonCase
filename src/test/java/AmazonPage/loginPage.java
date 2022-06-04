package AmazonPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Emmie_BaseClass;

public class loginPage {

	
	public loginPage() {
		PageFactory.initElements(Emmie_BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id='nav-link-accountList']")
	public WebElement signInBtn;
	
	@FindBy(xpath = "//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	public WebElement emailField;
	
	
	
	
	
	public void signInClick() {
		signInBtn.click();
	}
	
	
	public void emailInput() {
		
		emailField.sendKeys(Emmie_BaseClass.getProperty("email"));
	}
	
	
}

