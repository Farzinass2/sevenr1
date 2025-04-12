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
	//@FindBy(xpath="/html/body/div/div[2]/h5/i")private WebElement alertmessagElement;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement alertmessagElement1;
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
public  HomePage clickonSignInButton()
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
return alertmessagElement1.isDisplayed();

}

}