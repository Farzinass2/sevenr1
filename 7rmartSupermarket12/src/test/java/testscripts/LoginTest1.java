package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest1 extends Base {
	public HomePage home;
	public LoginPage loginpage;
	
	@Test(description="Verify user is able to successfully login with valid credentials",priority=1,retryAnalyzer=retry.Retry.class)
	public void verifyWetherUserCanLoginwithValidCredentials() throws IOException 
	{
		String userNameValue=ExcelUtility.getStringdata(0,0,"SignPage");
		String passwordValue=ExcelUtility.getStringdata(0,1,"SignPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameonUserNameField(userNameValue).enterPasswordonPasswordField(passwordValue);
		home=loginpage.clickonSignInButton();
		boolean isDashboardDisplayed=loginpage.isDashboardEnabled();
		Assert.assertTrue(isDashboardDisplayed, Messages.VALIDCREDENTIALERROR);
		

			}
	
	@Test(description="verify whether user is successfully login with invalid username and valid password a credentials",priority=2,groups={"smoke"})
	public void verifyWetherUserCanLoginwithInvalidUsernameandValidpasswordCredentials1() throws IOException {
		String usernamevalue=ExcelUtility.getStringdata(1,0,"LoginPage");
		String passwordValue=ExcelUtility.getStringdata(1,1,"LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameonUserNameField(usernamevalue).enterPasswordonPasswordField(passwordValue);
		home=loginpage.clickonSignInButton();
		
		boolean alertmessage=login.alertmessage();
		Assert.assertTrue(alertmessage,Messages.VALIDCREDENTIALERROR1);
		//Assert.assertTrue(isInvalidCredentialMessageDisplayed, "User was unable to Login with invalid credentials");
		
	}
	@Test(description="verify whether user is successfully login with valid username and invalid password a credentials",priority=3,retryAnalyzer=retry.Retry.class)
	public void verifyWetherUserCanLoginwithValidalidUsernameandInvalidpasswordCredentials1() throws IOException {
		String usernamevalue=ExcelUtility.getStringdata(2,0,"LoginPage");
		String passwordValue=ExcelUtility.getStringdata(2,1,"LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameonUserNameField(usernamevalue).enterPasswordonPasswordField(passwordValue);
		home=loginpage.clickonSignInButton();
		boolean alertmessage=login.alertmessage();
		Assert.assertTrue(alertmessage,Messages.VALIDCREDENTIALERROR1);
		
		}
	@Test(description="verify whether user is successfully login with invalid username and invalid password a credentials",priority=1,dataProvider="loginProvider")
	public void verifyWetherUserCanLoginwithInValidalidUsernameandInvalidpasswordCredentials1(String usernamevalue,String passwordValue) throws IOException {
		//String usernamevalue=ExcelUtility.getStringData(3,0,"LoginPage");
		//String passwordValue=ExcelUtility.getStringData(3,1,"LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameonUserNameField(usernamevalue).enterPasswordonPasswordField(passwordValue);
		home=loginpage.clickonSignInButton();
		boolean alertmessage=login.alertmessage();
		Assert.assertTrue(alertmessage,Messages.VALIDCREDENTIALERROR1);
		
	}
	@DataProvider(name="loginProvider")

	public Object[][] getDataFromDataProvider() throws IOException

	{

		return new Object[][] { new Object[] {"admin","admin12"},

			new Object[] {"123","123"},

			//new Object[] {ExcelUtility.getStringData(3, 0,"Login"),ExcelUtility.getStringData(3,1 ,"Login")}

		};

	}
}

