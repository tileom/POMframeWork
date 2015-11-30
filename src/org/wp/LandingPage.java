package org.wp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractPage {

	public LandingPage(WebDriver driver) {
		
		super(driver);
		PageFactory.initElements(driver, this);	 //Activate the page elements to access through @FindBy 
	}

	
	
	
public LoginPage goToLoginPage(){
	
	return new LoginPage(driver);
}
}
