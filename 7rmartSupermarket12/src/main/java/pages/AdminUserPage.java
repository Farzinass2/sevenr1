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
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newElement;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchElement;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")private WebElement resetElement;
	
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[2]")private WebElement adminusersaerchElement;
	
	@FindBy(xpath="//input[@id='un']")private WebElement searchadminusernamElement1;
	@FindBy(xpath="//select[@id='ut']")private WebElement searchadminUseTypElement1;
	
	@FindBy(xpath="//button[@name='Search']")private  WebElement searchElement1;
    @FindBy(xpath="//p[text()='Manage Users']")private WebElement manageUserElement;
    
	@FindBy(xpath="//input[@type='text'])[2]")private	WebElement adminUserInformationusernamElement;
	//adminUserInformationusernamElement.sendKeys("arya");
	@FindBy(xpath="//input[@class='form-control'])[3]")private WebElement adminUserInformationpasswordElement;
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
	public void clickonNewButton()
	{
		newElement.click();
		return ;
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
	public AdminUserPage clickonAdminUserSearchButton()
	{
		adminusersaerchElement.click();
		return this;
	}
	public AdminUserPage clickonAdminUserSearch(String input)
	{
		searchadminusernamElement1.sendKeys(input);	
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
	public void clickonadminUserInformationusernamElement(String username) {
		adminUserInformationusernamElement.sendKeys("carrot");
		
	}
	public void clickonadminUserInformationpasswordElement(String password)
	{
		adminUserInformationpasswordElement.sendKeys("fruit");
		
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
	public void enterPasswordonPasswordField(String password1) {
		adminUserInformationpasswordElement.sendKeys(password1);
		
	}
	public void enterUsernameonUserNameField(String username1) {
		// TODO Auto-generated method stub
		adminUserInformationusernamElement.sendKeys(username1);
		
	}
	
	

}
