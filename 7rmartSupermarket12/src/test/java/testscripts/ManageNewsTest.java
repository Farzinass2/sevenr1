package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest  extends Base{
	public HomePage home;
	ManageNewsPage manageNewsPage;
	@Test(description="Verify user can enter new news on Manage_News",priority=1,groups= {"smoke"})
	public void addManageNewsNewCategory() throws IOException
	{
		String username = ExcelUtility.getStringdata(0, 0, "SignPage");
		String password = ExcelUtility.getStringdata(0, 1, "SignPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUserNameField(username).enterPasswordonPasswordField(password);
		home=loginpage.clickonSignInButton();
		
		ManageNewsPage home1=new ManageNewsPage(driver);
		home1.clickonManageNews();
		home1.clickonManageUserNewButton();
		String input=ExcelUtility.getStringdata(0, 0, "News");
		home1.clickonEnterNewsElement(input);
		boolean isManageNewsDisplayed=home1.isManageNewsIsEnabled();
		Assert.assertTrue(isManageNewsDisplayed,Messages.VALIDCREDENTIALERROR3);
		home1.clickonSaveButton();
		
	}
	@Test(description="Verify user can search the entered news on Manage_News",priority=1,groups= {"smoke"})
	public void searchManageNewsCategory() throws IOException
	{
		String username = ExcelUtility.getStringdata(0, 0, "SignPage");
		String password = ExcelUtility.getStringdata(0, 1, "SignPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUserNameField(username).enterPasswordonPasswordField(password);
		home=loginpage.clickonSignInButton();
	
		ManageNewsPage home1=new ManageNewsPage(driver);
	home1.clickonManageNews();
		String input=ExcelUtility.getStringdata(0, 1, "News");
		home1.clickonManageNewsSearchButton();
		home1.entertheNewsTitle(input);
		boolean isManageNewsDisplayed=home1.isManageNewsIsEnabled();
		Assert.assertTrue(isManageNewsDisplayed,Messages.VALIDCREDENTIALERROR3);
		//home1.clickonManageNewsSearchButton();

}

}
