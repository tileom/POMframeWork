package org.wp;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	
	
	WebDriver driver;
	
	public AbstractPage(WebDriver driver){
		this.driver=driver;
	}

	
	
	
	public LandingPage goToLandingPage(){
		driver.navigate().to("http://www.wordpress.com");
		
		return new LandingPage(driver);
	}
}
