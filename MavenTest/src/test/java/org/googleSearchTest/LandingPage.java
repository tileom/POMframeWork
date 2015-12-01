package org.googleSearchTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LandingPage extends AbstractImplementingPage {
	
	public LandingPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText=Util.quickTools)
	public WebElement quickTools;

	@FindBy (linkText=Util.LookupZipCode)
	public WebElement lookupZipCode;
	
	@FindBy(xpath=Util.clickPrintShip)
	public WebElement clickPrintShip;
	
	
	public LookupZipPage goToLookupPage() throws InterruptedException{
		
		lookupZipCode.click();
		Thread.sleep(5000);
		//lookupZipCode.click();
		return new LookupZipPage(driver);
		
	}
	
	
	}
	
	
	
	
	

