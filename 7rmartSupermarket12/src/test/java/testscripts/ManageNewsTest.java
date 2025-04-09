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
		
		//ManageNewsPage home1=new ManageNewsPage(driver);
		manageNewsPage.clickonManageNews();
		manageNewsPage.clickonManageUserNewButton();
		String input=ExcelUtility.getStringdata(0, 0, "News");
		manageNewsPage.clickonEnterNewsElement(input);
		boolean isManageNewsDisplayed=manageNewsPage.isManageNewsIsEnabled();
		Assert.assertTrue(isManageNewsDisplayed,Messages.VALIDCREDENTIALERROR3);
		//WebElement enterthenewsElement=driver.findElement(By.xpath("//textarea[@id='news']"));
		//enterthenewsElement.sendKeys("hello");
		manageNewsPage.clickonSaveButton();
		
	}
	@Test(description="Verify user can search the entered news on Manage_News",priority=1,groups= {"smoke"})
	public void searchManageNewsCategory() throws IOException
	{
		String username = ExcelUtility.getStringdata(0, 0, "SignPage");
		String password = ExcelUtility.getStringdata(0, 1, "SignPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUserNameField(username).enterPasswordonPasswordField(password);
		home=loginpage.clickonSignInButton();
	
		//ManageNewsPage home1=new ManageNewsPage(driver);
	manageNewsPage.clickonManageNews();
		String input=ExcelUtility.getStringdata(0, 1, "News");
		manageNewsPage.clickonManageNewsSearchButton();
		manageNewsPage.entertheNewsTitle(input);
		boolean isManageNewsDisplayed=manageNewsPage.isManageNewsIsEnabled();
		Assert.assertTrue(isManageNewsDisplayed,Messages.VALIDCREDENTIALERROR3);
		//home1.clickonManageNewsSearchButton();

}

}
//
//package testScript;

//import java.io.IOException;

//import org.testng.Assert;
//import org.testng.annotations.Test;

//import automationCore.Base;
//import constants.Messages;
//import pages.HomePage;
//import pages.LoginPage;
//import pages.ManageNewsPage;
//import utilities.ExcelUtility;

//public class ManageNewsTest extends Base {
	//ManageNewsPage manageNews;
	//HomePage homepage;
   //@Test(description="Verify user can enter new news on Manage_News",priority=1,groups= {"smoke"})
   //public void clickonManageNews() throws IOException, InterruptedException {
	//String usernamevalue=ExcelUtility.getStringData(0,0,"LoginPage");
	//String passwordValue=ExcelUtility.getStringData(0,1,"LoginPage");
	//LoginPage login=new LoginPage(driver);
	//homepage=login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordValue).clickOnClick();
	//ManageNewsPage manageNews=new ManageNewsPage(driver);
	//manageNews=homepage.clickonManageNews();
	//manageNews.clickonNewManageNews();
	//String newstoenter=ExcelUtility.getStringData(0, 0, "News");
	//manageNews.textonEnternews(newstoenter).saveNewsText();
	//manageNews.saveNewsText();
	//boolean verifyNewsSuccessWindow=manageNews.verifyNewsSuccessWindow();
	//Assert.assertTrue(verifyNewsSuccessWindow,Messages.NEWNEWSADDED);
//}
   //@Test(description="Verify user can search the entered news on Manage_News",priority=2,groups= {"smoke"})
   //public void clickonSearchManageNews() throws IOException {
	  // String usernamevalue=ExcelUtility.getStringData(0,0,"LoginPage");
		//String passwordValue=ExcelUtility.getStringData(0,1,"LoginPage");
		//LoginPage login=new LoginPage(driver);
		//homepage=login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordValue).clickOnClick();
		//ManageNewsPage manageNews=new ManageNewsPage(driver);
		//manageNews=homepage.clickonManageNews();
		//manageNews.clickonSearchNews();
		//String newstoenter=ExcelUtility.getStringData(0, 0, "News");
		//manageNews.textonTitleSearchNews(newstoenter).clickonsearchButton();
		//boolean verifySearchedNewsPresent=manageNews.verifySearchedNewsPresent();
		//Assert.assertTrue(verifySearchedNewsPresent,Messages.NEWSSEARCH);
   //}
//}
