package pages;

import java.security.PrivateKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUserPage {
	WaitUtility wait=new WaitUtility();
	public WebDriver driver;
	public AdminUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='nav-icon fas fa-users']")private WebElement adminuserElement;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newAdminuser;
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[1]/div/a")private WebElement adminuserElement2;
	
@FindBy(xpath="//*[@id=\"username\"]")private	WebElement username1;
	
	@FindBy(xpath="//*[@id=\"password\"]")private WebElement password1;
	
	@FindBy(xpath="//p[text()='Manage Users']")private WebElement manageuserElement;
	@FindBy(xpath="//select[@name='user_type']")private WebElement adminUserInformationUserTypElement; 
	//@FindBy(xpath="//*[@id='ut']")private WebElement usertypElement;
	
	@FindBy(xpath="//button[@name=\"Create\"]")private WebElement savElement;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchElement;
	
	@FindBy(xpath="//input[@id='un']")private WebElement searchadminusernamElement1;
	
	@FindBy(xpath="//input[@id='un']")private WebElement searchadminpasswordElement1;
	
	
	@FindBy(xpath="//button[@class=\"btn btn-block-sm btn-danger\"]")private WebElement searchButtonUserName;
	@FindBy(xpath="//button[@aria-hidden=\"true\"]")private WebElement alertAdminUser123;
	@FindBy(xpath ="//span[@class='badge bg-success']")private WebElement activebutton;
	
	
	
	
	public AdminUserPage clickonNewAdminUser()
	{
		newAdminuser.click();
	    return this;
	}
	public AdminUserPage clickonAdminUser()
	{
		adminuserElement.click();
		return null;
		
	}
	public AdminUserPage clickonAdminUserNavigationLink()
	{
		adminuserElement2.click();
		return this;
	}
	public void clickonManageUsers1() {
		
		manageuserElement.click();
	}
	public AdminUserPage enterUsernameonUserNameField(String username11)
	{
		
	username1.sendKeys(username11);
		return this;
	}
	public AdminUserPage enterPasswordonPasswordField(String password11)
	{
		password1.sendKeys(password11);	
		return this;
	}
	public AdminUserPage clickonAdminUseTypeElement()
	{
		adminUserInformationUserTypElement.click();
		Select select=new Select(adminUserInformationUserTypElement);
		select.selectByIndex(1);
		return this;
	}
	public AdminUserPage clickonAdminUserSelect()
	{
		adminuserElement.click();
		return this;
	}
	public AdminUserPage clickonSaveButton1()
	{
		savElement.click();
		return this;
		
	}
	public AdminUserPage clickonSearchButton()
	{
		searchElement.click();
		return this;
	}
		
	
	public AdminUserPage enterSearchuserName(String username1)
	{
	
	searchadminusernamElement1.sendKeys(username1);
	return this;
	
}
	public AdminUserPage clickonSearchButtonUserType() {
		searchButtonUserName.click();
			Select select = new Select(searchButtonUserName);
			select.selectByIndex(1);
			return this;
	}
	
	

	public boolean isAlertWindowPresenting() {
		return alertAdminUser123.isDisplayed();
	}
	public String verifyActiveSearchisWork() {
		return activebutton.getText();



	}
	public AdminUserPage enterNewPassword(String newpassWord) {
		searchadminpasswordElement1.sendKeys(newpassWord);
		return this;
		
	}

	}
	

	

	
