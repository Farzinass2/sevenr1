package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	
		 HomePage home;
		public LoginPage loginpage;
		@Test(description="Verify whether user is able to logout successfully",retryAnalyzer=retry.Retry.class)
		

		public void verifyuserisabletologout() throws IOException {
			String username = ExcelUtility.getStringdata(0, 0, "SignPage");
			String password = ExcelUtility.getStringdata(0, 1, "SignPage");
			LoginPage loginpage = new LoginPage(driver);
			loginpage.enterUsernameonUserNameField(username).enterPasswordonPasswordField(password);
			home=loginpage.clickonSignInButton();
			home.clickonAdminButton();
			loginpage=home.clickonLogOutButton();
			String actual=home.getTextFromTitle();
			String expected="7rmart supermarket";
			Assert.assertEquals(actual,expected,Messages.VALIDCREDENTIALERROR2);
		}
	}
//package testScript;

//import java.io.IOException;

//import org.apache.logging.log4j.message.Message;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;

//import automationCore.Base;
//import constants.Messages;
//import pages.HomePage;
//import pages.LoginPage;
//import utilities.ExcelUtility;

//public class HomeTest extends Base{
	//HomePage homepage;
	
	//@Test(description="verify whether logout",retryAnalyzer=retry.Retry.class)
	//public void whetherUserisAbletoLogout() throws IOException {
		//String usernamevalue=ExcelUtility.getStringData(0,0,"LoginPage");
		//String passwordValue=ExcelUtility.getStringData(0,1,"LoginPage");
		//LoginPage loginpage=new LoginPage(driver);
		//loginpage.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordValue);
		//HomePage home=new HomePage(driver);
		//homepage=loginpage.clickOnClick();
		//homepage.clickonadmin();
		//loginpage=homepage.logoutclick();
		//String actual=homepage.getTextFromTitle();
		//String expected="7rmart supermarket";
		//Assert.assertEquals(actual, expected,Messages.LOGOUTMESSAGE);
	//}

//}


