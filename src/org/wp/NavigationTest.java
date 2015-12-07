package org.wp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NavigationTest {

	WebDriver driver;
	
	@Before
	public void testSetup(){
		
		driver=new FirefoxDriver();
		
		
	}
	
	
	@After
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	
	
	
	@Test
	public void sanityTest(){
		
	}
	
	
	
	
}
