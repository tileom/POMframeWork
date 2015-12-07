package org.googleSearchTest;

import org.openqa.selenium.WebDriver;

public class AbstractImplementingPage {
	WebDriver driver;
	public AbstractImplementingPage(WebDriver driver) {
		
		//this constractor will initialize the driver whenever called by 
		//class which inherit this super class 
		this.driver=driver;
	}

	
	
	//intialize Landing page 
	public LandingPage goToLandingPage(){
		driver.navigate().to("http://www.usps.com");
		return new LandingPage(driver);
		
	}

	
	
}
