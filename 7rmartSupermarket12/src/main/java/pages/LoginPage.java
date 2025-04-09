package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {
	WaitUtility wait=new WaitUtility();
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']") private WebElement  userElement;
	@FindBy(xpath="//input[@name='password']") private WebElement passwordElement;
	@FindBy(xpath="//button[text()='Sign In']") private WebElement signInElement;
	@FindBy(xpath="//p[text()='Dashboard']") private WebElement dashboardElement;
	@FindBy(xpath="/html/body/div/div[2]/h5/i")private WebElement alertmessagElement;
	private WebElement invalidmessage;
	
public LoginPage enterUsernameonUserNameField(String userNameValue)
{
	userElement.sendKeys(userNameValue);
	return this;
}
public LoginPage enterPasswordonPasswordField(String passwordValue)
{
	passwordElement.sendKeys(passwordValue);
	return this;
	
}
public HomePage clickonSignInButton()
{
	signInElement.click();
	return new HomePage(driver);
	
}

public boolean isDashboardEnabled()
{
	return dashboardElement.isDisplayed();
	
}
public boolean alertmessage()
{
return alertmessagElement.isDisplayed();

}
public String isinValidMessageDisplayed() {
	return invalidmessage.getText();

}
}
//package pages;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

//import utilities.WaitUtility;

//public class LoginPage {
	//WaitUtility wait=new WaitUtility();
	//public WebDriver driver;
	//public LoginPage(WebDriver driver)
	//{
		//this.driver=driver;
		//PageFactory.initElements(driver,this);
	//}
	//@FindBy(xpath="//input[@name='username']")private WebElement username;
	//@FindBy(xpath="//input[@name='password']")private WebElement password;
	//@FindBy(xpath="//button[text()='Sign In']")private WebElement signinbutton;
	//@FindBy(xpath="//p[text()='Dashboard']")private WebElement dashboard;
	//@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement invalidmessage;
	//@FindBy(xpath="//p[text()='Dashboard']")private WebElement falseassert;
	//public LoginPage enterUsernameOnUsernameField(String usernamevalue)
	//{
		//username.sendKeys(usernamevalue);
		//return this;
	//}
	//public LoginPage enterPasswordOnPasswordField(String passwordValue)
	//{
		//password.sendKeys(passwordValue);
		//return this;
	//}
	//public HomePage clickOnClick()
	//{
		//signinbutton.click();
		//return new HomePage(driver);
	//}
	//public boolean isDashBoardDisplayed() {
		//return dashboard.isDisplayed();
	//}
	//public boolean isinValidMessageDisplayed() {
		//return invalidmessage.isDisplayed();
	//}
	//public boolean isDashboardDisplayedinInvalidCredentials() {
		//return falseassert.isDisplayed();
	//}
	//public String isInValidMessageDisplayed() {
		//return invalidmessage.getText();
	//}
	

//}