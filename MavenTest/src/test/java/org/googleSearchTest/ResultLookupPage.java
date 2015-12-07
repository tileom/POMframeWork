package org.googleSearchTest;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultLookupPage extends AbstractImplementingPage {

	public ResultLookupPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath=Util.hereIsFullAddress)
	
	public WebElement fullAddress;
	
	
	public void testAddress(){
		System.out.println(fullAddress.isDisplayed());
	}
	
	

}
