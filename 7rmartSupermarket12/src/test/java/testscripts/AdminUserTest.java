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
	AdminUserPage adminusers;
	HomePage homepage;
	private AdminUserPage admin;

	
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
		admin.clickonManageUserElement();
		admin.clickonNewButton();
		
		//admin.clickonadminUserInformationusernamElement();
		//admin.clickonadminUserInformationpasswordElement();
		String input1=ExcelUtility.getStringdata(0, 0, "NewAdmin");
		admin.clickonadminUserInformationUserTypElement(input1);
		admin.clickonSaveButton();
		RandomDataUtility random=new RandomDataUtility();
		String username1=random.createRandomUsername();
		String password1=random.createRandomPassword();
	admin.enterUsernameonUserNameField(username1);
		admin.enterPasswordonPasswordField(password1);
		boolean clickonAdmin1=admin.clickonAdmin1();
		Assert.assertTrue(clickonAdmin1,Messages.ALERTWINDOWMESSAGE);
	}
}
		
		