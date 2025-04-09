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
		
		//admin.clickonSaveButton();
		//WebElement manageUserElement=driver.findElement(By.xpath("//p[text()='Manage Users']"));
		//manageUserElement.click();
		//home4.clickonNewButton();
		//home4.clickonSearchButton();
		//home4.clickonResetButton();
		//home4.clickonAdminUserSearchButton();
		
		//WebElement adminUserInformationusernamElement=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		//adminUserInformationusernamElement.sendKeys("arya");
		//WebElement adminUserInformationpasswordElement=driver.findElement(By.xpath("//input[@type='password']"));
		//adminUserInformationpasswordElement.sendKeys("arjun");
		//WebElement adminUserInformationUserTypElement=driver.findElement(By.xpath("//select[@name='user_type']"));
		//adminUserInformationUserTypElement.click();
		//Select select=new Select(adminUserInformationUserTypElement);
		//select.selectByIndex(1);
		//WebElement savElement=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//savElement.click();
		
	}
	@Test(description="Whether user can search new Admin",priority=2,groups= {"smoke"})
	public void searchAdminUserTestCategory() throws IOException
	{
		String username = ExcelUtility.getStringdata(0, 0, "SignPage");
		String password = ExcelUtility.getStringdata(0, 1, "SignPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUserNameField(username).enterPasswordonPasswordField(password);
		homepage=loginpage.clickonSignInButton();
		
		
		AdminUserPage home4=new AdminUserPage(driver);
		home4.clickonAdminUser();
		home4.clickonManageUserElement();
		home4.clickonSearchButton();
		//String input1=ExcelUtility.getStringdata(0, 0, "NewAdmin");
		//String input1=ExcelUtility.getStringdata(0, 1, "NewAdmin");
		home4.clickonAdminUser();
		home4.clickonAdminUseTypeElement();
		home4.clickonSearchElement();
		

}
	@Test
	public void resetAdminUserTest() throws IOException
	{
		String username = ExcelUtility.getStringdata(0, 0, "SignPage");
		String password = ExcelUtility.getStringdata(0, 1, "SignPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUserNameField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickonSignInButton();
		
		AdminUserPage home4=new AdminUserPage(driver);
		home4.clickonAdminUser();
		home4.clickonManageUserElement();
		

		home4.clickonResetButton();
	}
	
} 

//package testScript;

//import java.io.IOException;

//import org.testng.Assert;
//import org.testng.annotations.Test;

//import automationCore.Base;
//import constants.Messages;
//import pages.AdminUsersPage;
//import pages.HomePage;
//import pages.LoginPage;
//import utilities.ExcelUtility;
//import utilities.RandomDataUtility;

//public class AdminUsersTest extends Base {
	//AdminUsersPage adminusers;
	//HomePage homepage;
	
	//@Test(description="Whether user can create new Admin user",priority=1,groups= {"smoke"})
	//public void verifyUsercanCreateAdminUser() throws IOException {
		//String usernamevalue=ExcelUtility.getStringData(0,0,"LoginPage");
		//String passwordValue=ExcelUtility.getStringData(0,1,"LoginPage");
		//LoginPage login=new LoginPage(driver);
		//login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordValue);
		//homepage=login.clickOnClick();
		
		//homepage.clickonAdminUser();
		//adminusers=homepage.clickonManageUser();
		//adminusers.clickonNewAdminUser();
		//RandomDataUtility random=new RandomDataUtility();
		//String newuserName=random.createRandomUsername();
		//String newpassWord=random.createRandomPassword();
		//adminusers.enterNewUserName(newuserName).enterNewPassword(newpassWord).selectNewUserType();
		//adminusers.clickonSaveButton();
		//boolean isAlertWindowPresent=adminusers.isAlertWindowPresent();
		//Assert.assertTrue(isAlertWindowPresent,Messages.ALERTWINDOWMESSAGE);
	//}
	//@Test(description="Whether user can search new Admin",priority=2,groups= {"smoke"})
	//public void searchCreatedAdminUser() throws IOException {
		//String usernamevalue=ExcelUtility.getStringData(0,0,"LoginPage");
		//String passwordValue=ExcelUtility.getStringData(0,1,"LoginPage");
		//LoginPage login=new LoginPage(driver);
		//login.enterUsernameOnUsernameField(usernamevalue).enterPasswordOnPasswordField(passwordValue);
		//homepage=login.clickOnClick();
		//adminusers=homepage.clickonAdminUser().clickonManageUser();
		//adminusers.clickonSearch();
		//String newusername=ExcelUtility.getStringData(0, 0, "NewAdmin");
		//adminusers.enterSearchUserName(newusername);
		//adminusers.clickonSearchButtonUserType();
		//String actual=adminusers.verifyActiveSearchisWorking();
		//String expected=("Active");
		//Assert.assertEquals(actual, expected,Messages.NEWADMINPRESENT);
	//}
	

//}


