package tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import pages.BaseTest;
import pages.LoginPage;

import utilities.ExcelUtility;
import utilities.ItestListenerClass;


@Listeners(ItestListenerClass.class)
public class Logintest extends BaseTest{


		// TODO Auto-generated method stub
	LoginPage lp;

		@BeforeTest
		public void openApp()
		{
			openBrowser();
			
		}
		
		

		@Test(dataProvider="testdata")
		public void testLoginPage(String Username, String Password, String Status) throws InterruptedException 
		{
			lp = new LoginPage(driver);
			Thread.sleep(3000);
			lp.Login_details(Username, Password);
			Thread.sleep(1000);
			if(Status.equals("pass")){
			lp.logout_button.click();
			}
		}
		
		@DataProvider(name="testdata")
		public Object[][] datasupplier() throws EncryptedDocumentException, IOException
		{
			
			Object[] [] input =ExcelUtility.getTestData("Sheet1");
			return input;
			
		}
		
		@AfterTest
		public void closeApp()
		{
			closeBrowser();
		}
	}


