package org.googleSearchTest;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestSuite {
	
	WebDriver driver; //Initializing Web driver 
	
	
		@Before  // setingUp test environment 
		public void testSetup(){
			System.setProperty("webdriver.firefox.bin",
					"C:\\Users\\cterefe\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			
			driver=new FirefoxDriver();
			driver.close();
			driver.quit();
			driver=new FirefoxDriver();
		}
		
		@After // killing the driver  instance after test 
		public void tearDown(){
		//driver.close();
		//driver.quit();
		}
		
		
		
		@Test
		public void uspsAddressSearch() throws InterruptedException{
			LandingPage landingPageObj=new LandingPage(driver);
			LandingPage onlandingPage=landingPageObj.goToLandingPage();
			LookupZipPage onlookupZipPage=onlandingPage.goToLookupPage();
			onlookupZipPage.fillAddressDetail();
			Thread.sleep(3000);
			ResultLookupPage onResultLookupPage=onlookupZipPage.findAddress();
			onResultLookupPage.testAddress();
			
		}	
}
		
	


