package org.wp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

	public HomePage(WebDriver driver) {
		super(driver);
		
		PageFactory.initElements(driver, this);	 //Activate the page elements to access through @FindBy 
	}
	
	
	
	
	

}
