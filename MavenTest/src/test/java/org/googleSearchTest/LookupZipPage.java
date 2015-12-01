package org.googleSearchTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LookupZipPage extends AbstractImplementingPage{

	public LookupZipPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
		@FindBy (id=Util.streetAddress)
		public WebElement streetAddress;
		
		@FindBy (id=Util.apt)
		public WebElement apt;
				
		@FindBy (id=Util.city)
		public WebElement city;
		
		@FindBy (xpath=Util.State)
		public WebElement State;
				
		@FindBy (id=Util.zip)
		public WebElement zip;
		
		@FindBy (id=Util.find)
		public WebElement find;
		
		@FindBy (xpath=Util.State)
		public WebElement statSelect;
		
		
		
		
		
		//fill the detail address
		
		public LookupZipPage fillAddressDetail(){
			streetAddress.sendKeys("2145 Forge Ridge CIR");
			apt.sendKeys("0");
			city.sendKeys("Nashville");
			zip.sendKeys("37217");
			
			Select stateObj	=new Select( statSelect);
			stateObj.selectByVisibleText("AK - Alaska");
			return this;
		}
		
		
		//Navigate to the result page 
		public ResultLookupPage findAddress(){
			find.click();
			return new ResultLookupPage(driver);
		}
		
		
		
	}
	
	

