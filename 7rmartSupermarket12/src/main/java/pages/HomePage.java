package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']")private WebElement adminElement;
	@FindBy(xpath="/html/body/div/nav/ul[2]/li/div/a[2]")private WebElement logoutElement;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div[3]/div/a")private WebElement categorybox;
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div[4]/div/a")private WebElement subcategorybox;

	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newElement;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchElement;
	
	@FindBy(xpath="//p[text()='Manage News']")private WebElement managenewsElement;
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]")private WebElement managenewsnewElement;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement managenewssearchElement;
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-users']")private WebElement adminuserElement;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")private WebElement resetElement;
	
	
	@FindBy(xpath="//b[text()='7rmart supermarket']")private WebElement mainTitlElement;
	private WebDriver driver1;
public HomePage clickonAdminButton()
{
	adminElement.click();
	return null;
}
public LoginPage clickonLogOutButton()
{
	logoutElement.click();
	return null;
}
public SubCategoryPage  clicksubcategory() {
	subcategorybox.click();
	return new SubCategoryPage(driver);

	}
public void clickonNewButton()
{
	newElement.click();
}
public void clickonSearchButton()
{
	searchElement.click();
}
public ManageNewsPage clickonManageNews()
{
	managenewsElement.click();
	return new ManageNewsPage(driver1);
}
public AdminUserPage clickonManageUserNewButton()
{
	managenewsnewElement.click();
	return new AdminUserPage(driver1);
	}
	
public AdminUserPage  clickonManageNewsSearchButton()
{
	managenewssearchElement.click();
	return new AdminUserPage(driver1);
}
public HomePage clickonAdminUser()
{
	adminuserElement.click();
	return null;
}
public void clickonResetButton()
{
	resetElement.click();
}
public String getTextFromTitle()
{
	return mainTitlElement.getText();
}

}
//package pages;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

//import utilities.WaitUtility;

//public class HomePage{
	
	
	//WaitUtility wait=new WaitUtility();
	//public WebDriver driver1;
	//public HomePage(WebDriver driver)
	//{
		//this.driver1=driver;
		//PageFactory.initElements(driver,this);
	//}
	//@FindBy(xpath="//a[@data-toggle='dropdown']")private WebElement logoutadmin;
	//@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")private WebElement logoutclick;
	//@FindBy(xpath="//b[text()='7rmart supermarket']")private WebElement maintitle;
	//@FindBy(xpath="//i[@class=\"nav-icon fas fa-users\"]")private WebElement adminUserSelect;
	//@FindBy(xpath="//p[text()='Manage Users']")private WebElement manageUser;
	//@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-sub-category\"]")private WebElement subcategory;
	//@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newManageNews;
	//@FindBy(xpath="//a[p[text()='Manage News']]")private WebElement manageNews;


	
	//public HomePage clickonadmin() {
		//logoutadmin.click();
		//return this;
	//}
	//public LoginPage logoutclick() {
		//wait.waitUntilElementtobeVisible(driver1, logoutclick);
		//logoutclick.click();
		//return new LoginPage(driver1);
	//}
	//public String getTextFromTitle() {
		//return maintitle.getText();
	//}
	//public SubCategoryPage clickSubcategory() {
		//subcategory.click();
		//return new SubCategoryPage(driver1);
	//}
	//public HomePage clickonAdminUser() {

		//adminUserSelect.click();
		//return new HomePage(driver1);
	//}
	//public AdminUsersPage clickonManageUser() {
		//manageUser.click();
		//return new AdminUsersPage(driver1);
	//}
	
	//public ManageNewsPage clickonManageNews() {
		//manageNews.click();
		//return new ManageNewsPage(driver1);
	//}
	
//}

