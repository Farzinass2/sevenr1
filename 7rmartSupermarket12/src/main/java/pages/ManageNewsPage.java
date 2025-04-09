package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageNewsPage {
	WaitUtility wait=new WaitUtility();
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Manage News']")private WebElement managenewsElement;
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]")private WebElement managenewsnewElement;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement managenewssearchElement;
	@FindBy(xpath="//textarea[@id='news']")private WebElement enterthenewsElement ;
	
    @FindBy(xpath="//button[@type='submit']")private WebElement savElement;
    @FindBy(xpath="//input[@class='form-control']")private WebElement newsTitlElement ;
    
	

	
	public ManageNewsPage clickonManageNews()
	{
		managenewsElement.click();
		return null;
	}
	public void clickonManageUserNewButton()
	{
		managenewsnewElement.click();
		
	}
	public void clickonManageNewsSearchButton()
	{
		managenewssearchElement.click();
	}
	public ManageNewsPage clickonEnterNewsElement(String input)
	{
		enterthenewsElement.sendKeys(input);
		return null;
	}
	public ManageNewsPage clickonSaveButton()
	{
		wait.waitUntilClickable(driver, savElement);
		savElement.click();
		return null;
	}
	public ManageNewsPage entertheNewsTitle(String input)
	{
		newsTitlElement.sendKeys(input);
		return null;
		
		
	}
	public boolean isManageNewsIsEnabled()
	{
		return managenewsElement.isDisplayed();
		
	}
	}
