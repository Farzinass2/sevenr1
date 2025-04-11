package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import utilities.WaitUtility;

public class HomePage {
	 WaitUtility wait=new WaitUtility();
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']")private WebElement adminElement;
	@FindBy(xpath="/html/body/div/nav/ul[2]/li/div/a[2]")private WebElement logout1;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div[3]/div/a")private WebElement categorybox;
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div[4]/div/a")private WebElement subcategorybox;

	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newElement;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchElement;
	@FindBy(xpath="//p[text()='Manage Users']")private WebElement manageUser1;
	
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]")private WebElement managenewsnewElement;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement managenewssearchElement;
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-users']")private WebElement adminuserElement;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")private WebElement resetElement;
	
	
	@FindBy(xpath="//b[text()='7rmart supermarket']")private WebElement mainTitlElement;
public HomePage clickonAdminButton()
{
	adminElement.click();
	return this;
}
public LoginPage clickonLogOutButton()
{
	wait.waitUntilVisibilityOfElement(driver, logout1);
	logout1.click();
	return new LoginPage(driver);
	
	
}
public SubCategoryPage  clicksubcategory() {
	subcategorybox.click();
	return new SubCategoryPage(driver);

	}
public HomePage clickonNewButton()
{
	newElement.click();
	return this;
}
public void clickonSearchButton()
{
	searchElement.click();
}
public AdminUserPage clickonManageNews()
{
	manageUser1.click();
	return new AdminUserPage(driver);
}
public AdminUserPage clickonManageUserNewButton()
{
	managenewsnewElement.click();
	return new AdminUserPage(driver);
	}
	
public AdminUserPage  clickonManageNewsSearchButton()
{
	managenewssearchElement.click();
	return new AdminUserPage(driver);
}
public HomePage clickonAdminUser()
{
	adminuserElement.click();
	return this;
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

	//public String getTextFromTitle()
	//{
		//return mainTitle.getText();
	//}
	
	//public ManageNewsPage clickOnManageNewsNavigationLink()
	//{
		//manageNewsNav.click();
		//return new ManageNewsPage(driver);
	//}
	
	//public HomePage clickOnAdminUsersNavigationLink() {
		//adminUserNav.click();
		//return this;
	//}

	//public ManageUsersPage clickOnManageUsersRadioButton() {
	//	wait.waitUntilElementToBeSelected(driver, manageUserRadiobutton);
		//manageUserRadiobutton.click();
		//return new ManageUsersPage(driver);	
	//}
	//public SubCategoryPage clickOnSubcategoryHomeButton()
	//{
		//subcatgeoryHomeButton.click();
		//return new SubCategoryPage(driver);


