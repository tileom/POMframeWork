package org.wp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractPage {

	public LandingPage(WebDriver driver) {
		
		super(driver);
		PageFactory.initElements(driver, this);	 //Activate the page elements to access through @FindBy 
	}

	//create your webElements here using the annotation findBy 
	
	
public LoginPage goToLoginPage(){
	//click on login link 
	
	
	
	
	return new LoginPage(driver);
}
}
