package org.wp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;


public class NavigationTest {

	WebDriver driver;
	@DataProvider(name="wpData")
	public Object[][] dataInput(){
//Get Excel sheet path		
		ExcelConfig xlConfig=new ExcelConfig("/Users/capiwega/gitHubRepo/PoiSelenium/SeleniumPoiforGetHub/testData/inputData.xlsx");
//Get RowCount
		int rowCounts=xlConfig.rowCount(1);
		
		Object [][] excelData= new Object[rowCounts][2];
		for(int i=0;i<rowCounts;i++){
			excelData[i][0]=xlConfig.getData(1, i, 0);
			excelData[i][1]=xlConfig.getData(1, i, 1);
		}
		 
		return excelData;
	}
	
	
	
	
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
		LandingPage page1=new LandingPage(driver);
		LandingPage onlandingPage=page1.goToLandingPage();
		LoginPage onloginPage=onlandingPage.goToLoginPage();
		HomePage onHomePage=onloginPage.loginToAccount();
		
		
		
	}
	
	
	
	
}
