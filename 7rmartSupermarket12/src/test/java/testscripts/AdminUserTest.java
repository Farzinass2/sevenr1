package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;


public class AdminUserTest extends Base{
	
	HomePage homepage;
	private LoginPage loginpage;
	

	
	@Test(description="Whether user can create new Admin user",priority=1,groups= {"smoke"})
	public void addAdminUserTestNewCategory() throws IOException
	{
		String username = ExcelUtility.getStringdata(0, 0, "SignPage");
		String password = ExcelUtility.getStringdata(0, 1, "SignPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUserNameField(username).enterPasswordonPasswordField(password);
		homepage=loginpage.clickonSignInButton();
		
	    AdminUserPage admin=new AdminUserPage(driver);
		admin.clickonAdminUser();
		admin.clickonManageUsers1();
		homepage.clickonNewButton();
		
		//admin.clickonadminUserInformationusernamElement();
		//admin.clickonadminUserInformationpasswordElement();
		
		RandomDataUtility random=new RandomDataUtility();
		String username1=random.createRandomUsername();
		String password1=random.createRandomPassword();
	admin.enterUsernameonUserNameField(username1);
		admin.enterPasswordonPasswordField(password1);
		admin.clickonAdminUseTypeElement();
		admin.clickonSaveButton1();
		boolean isAlertWindowPresent=admin.isAlertWindow() ;
		Assert.assertTrue(isAlertWindowPresent,Messages.ALERTWINDOW);
	}
		
		
@Test(description="Whether user can search new Admin",priority=2,groups= {"smoke"})
	public void searchCreatedAdminUser1() throws IOException
	{
		String username=ExcelUtility.getStringdata(0,0,"SignPage");
		String password=ExcelUtility.getStringdata(0,1,"SignPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameonUserNameField(username).enterPasswordonPasswordField(password);
		homepage=loginpage.clickonSignInButton();
		
		AdminUserPage admin=new AdminUserPage(driver);
		admin.clickonAdminUser();
		admin.clickonManageUsers1();
		homepage.clickonSearchButton();
		String newusername=ExcelUtility.getStringdata(0, 0, "NewAdmin");
		
		admin.enterSearchuserName(newusername);
		//admin.clickonSearchButtonUserType();
		admin.clickonSearchButton();
		String isSearchUserHeaderisDisplayed=admin.isActiveSearchwork();
		Assert.assertEquals(isSearchUserHeaderisDisplayed,Messages.NEWADMINPRESENT23);
		
	
}
@Test(description="Whether user can able to perform reset",priority=3,groups= {"smoke"})
public void verfysuserisabletoreset() throws IOException
{
	String username=ExcelUtility.getStringdata(0,0,"SignPage");
	String password=ExcelUtility.getStringdata(0,1,"SignPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameonUserNameField(username).enterPasswordonPasswordField(password);
	homepage=loginpage.clickonSignInButton();
	
	AdminUserPage admin=new AdminUserPage(driver);
	admin.clickonAdminUser();
	admin.clickonManageUsers1();
homepage.clickonResetButton();


}
}