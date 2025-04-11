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
	
	HomePage home1;
		@Test(description="Verify whether user is able to logout successfully",retryAnalyzer=retry.Retry.class)
		

		public void verifyuserisabletologout() throws IOException {
			String username = ExcelUtility.getStringdata(0, 0, "SignPage");
			String password = ExcelUtility.getStringdata(0, 1, "SignPage");
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterUsernameonUserNameField(username).enterPasswordonPasswordField(password);
			home1=loginpage.clickonSignInButton();
			
			home1.clickonAdminButton();
			loginpage=home1.clickonLogOutButton();
			String actual=home1.getTextFromTitle();
			String expected="7rmart supermarket";
			Assert.assertEquals(actual,expected,Messages.USERLOGOUT);
		}
	}
