package pages;

import java.security.PrivateKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage {
	public WebDriver driver;
	public AdminUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='nav-icon fas fa-users']")private WebElement adminuserElement;
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]")private WebElement newElement;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchElement;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")private WebElement resetElement;
	
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[2]")private WebElement adminusersaerchElement;
	
	@FindBy(xpath="//input[@id='un']")private WebElement searchadminusernamElement1;
	@FindBy(xpath="//select[@id='ut']")private WebElement searchadminUseTypElement1;
	
	@FindBy(xpath="//button[@name='Search']")private  WebElement searchElement1;
    @FindBy(xpath="//p[text()='Manage Users']")private WebElement manageUserElement;
    
    
	@FindBy(xpath="//input[@name='username']")private	WebElement username;
	//adminUserInformationusernamElement.sendKeys("arya");
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	//adminUserInformationpasswordElement.sendKeys("arjun");
	@FindBy(xpath="//select[@name='user_type']")private WebElement adminUserInformationUserTypElement; 
	//adminUserInformationUserTypElement.click();
	//Select select=new Select(adminUserInformationUserTypElement);
	//select.selectByIndex(1);
	@FindBy(xpath="//button[@type='submit'])[2]") private WebElement savElement;
	@FindBy(xpath="//p[text()='Admin Users']")private WebElement adminElement;
	//savElement.click();
	
	
	
	//WebElement searchadminuserusernamElement=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	//searchadminuserusernamElement.sendKeys("rahul");
	//WebElement adminUserInformationUserTypElement=driver.findElement(By.xpath("//select[@name='user_type']"));
	//adminUserInformationUserTypElement.click();
	//Select select=new Select(adminUserInformationUserTypElement);
	//select.selectByIndex(1);
	//WebElement searchElement=driver.findElement(By.xpath("//button[@name='Search']"));
	
	public AdminUserPage clickonAdminUser()
	{
		adminuserElement.click();
	    return this;
	}
	public AdminUserPage clickonNewButton()
	{
		newElement.click();
		return this ;
	}
	public void clickonSearchButton()
	{
		searchElement.click();
		return ;
	}
	public void clickonResetButton()
	{
		resetElement.click();
		return ;
	}

	public AdminUserPage enterUsernameonUserNameField(String username1)
	{
		
	username.sendKeys(username1);
		return this;
	}
	public AdminUserPage enterPasswordonPasswordField(String password1)
	{
		password.sendKeys("arjun");	
		return this;
	}
	public AdminUserPage clickonAdminUseTypeElement()
	{
		searchadminUseTypElement1.click();
		Select select=new Select(searchadminUseTypElement1);
		select.selectByIndex(1);
		return this;
	}
	public void clickonSearchElement()
	{
		searchElement1.click();
		return;
	}
	public void clickonManageUserElement()
	{
		manageUserElement.click();
		return;
		
	}

	public void clickonadminUserInformationUserTypElement(String input1)
	{
		adminUserInformationUserTypElement.sendKeys(input1);
		Select select=new Select(adminUserInformationUserTypElement);
		select.selectByIndex(1);
		return;
	}
	public void clickonSaveButton()
	{
		savElement.click();
		
	}
	public boolean clickonAdmin1()
	{
	return adminElement.isDisplayed();
	
			
	}
	
	

}
//package pages;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

//import utilities.WaitUtility;

//public class AdminUsersPage {
	
	//WaitUtility wait=new WaitUtility();
	//public WebDriver driver1;
	//public AdminUsersPage(WebDriver driver)
	//{
		//this.driver1=driver;
		//PageFactory.initElements(driver,this);
	//}
	//@FindBy(xpath="//i[@class=\"nav-icon fas fa-users\"]")private WebElement adminUserSelect;
	//@FindBy(xpath="//p[text()='Manage Users']")private WebElement manageUser;
	//@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newAdminUser;
	//@FindBy(xpath="//input[@name='username']")private WebElement newUserName;
	//@FindBy(xpath="//input[@id='password']")private WebElement newPassWord;
	//@FindBy(xpath="//select[@name='user_type']")private WebElement newUserType;
	//@FindBy(xpath="//button[@name=\"Create\"]")private WebElement saveButton;
	//@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement search;
	//@FindBy(xpath="//input[@id='un']")private WebElement searchUserName;
	//@FindBy(xpath="//button[@class=\"btn btn-block-sm btn-danger\"]")private WebElement searchButtonUserName;
	//@FindBy(xpath="//button[@aria-hidden=\"true\"]")private WebElement alertAdminUser;
	//@FindBy(xpath ="//span[@class='badge bg-success']")private WebElement activebutton;
	
	
	//public AdminUsersPage clickonNewAdminUser() {

		//newAdminUser.click();
		//return this;
	//}
	//public AdminUsersPage enterNewUserName(String newuserName) {
		//newUserName.clear();
		//newUserName.click();
		//newUserName.sendKeys(newuserName);
		//return this;
	//}
	//public AdminUsersPage enterNewPassword(String newpassword) {
		//newPassWord.sendKeys(newpassword);
		//return this;
	//}
	//public AdminUsersPage selectNewUserType() {
		//Select select=new Select(newUserType);
		//select.selectByIndex(1);
		//return this;

	//}
	//public AdminUsersPage clickonAdminUser() {

		//adminUserSelect.click();
		//return this;
	//}
	//public AdminUsersPage clickonSaveButton() {
		//wait.waitUntilElementtobeSelected(driver1, adminUserSelect);
		//saveButton.click();
		//return this;
	//}
	//public AdminUsersPage clickonSearch() {
		//search.click();
		//return this;
	//}
	//public AdminUsersPage enterSearchUserName(String newuserName) {
		//searchUserName.sendKeys(newuserName);
		//return this;
	//}
	//public AdminUsersPage clickonSearchButtonUserType() {
		//searchButtonUserName.click();
		//return this;
	//}
	//public boolean isAlertWindowPresent() {
		//return alertAdminUser.isDisplayed();
	//}
	//public String verifyActiveSearchisWorking() {
		//return activebutton.getText();
	//}
//}
