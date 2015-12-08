package org.wp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {

	public LoginPage(WebDriver driver) {
		super(driver);
	PageFactory.initElements(driver, this);	 //Activate the page elements to access through @FindBy 
		
	}
	
	//create your webElements here using the annotation findBy 
	

	public HomePage loginToAccount(){
		//Enter Credentials and click login 
		
		return new HomePage(driver);
		
	}
}
