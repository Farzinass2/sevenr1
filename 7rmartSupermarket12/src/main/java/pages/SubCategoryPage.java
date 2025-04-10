package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constants;
import utilities.PageUtility;

public class SubCategoryPage {
	public WebDriver driver;
	public SubCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div[3]/div/a  ")private WebElement categorybox;
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div[4]/div/a")private WebElement subcategorybox;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newElement;
	@FindBy(xpath="//input[@id='main_img']")private WebElement imageuploadElement;
	@FindBy(xpath = "//button[@class='btn btn-danger']")private WebElement savElement;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchElement;
	
	
	@FindBy(xpath="//input[@placeholder='Sub Category']")private WebElement subCategory;
	
	@FindBy(xpath="//select[@id='un']")private WebElement Category;
	
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[2]")private WebElement listSubCategorySearchElement;
    
@FindBy(xpath="//select[@id='cat_id']")private 	WebElement enterSubCategoryInformationCategory;
@FindBy(xpath="//input[@id='subcategory']")private WebElement enterSubCategoryInformationsubCategory;
	
	@FindBy(xpath="//input[@name='subcategory']")private WebElement subCategory1;
	@FindBy(xpath="//select[@class='form-control selectpicker']")private WebElement searchListSubCategoryCategoryElement;
	
	
	@FindBy(xpath="/html/body/div/div[1]/section/div[3]/div/div/div/div[2]/form/div/div[2]/input")private WebElement searchListSubCategorySubCategoryElement;
     @FindBy(xpath="//i[@class='fa fa-search']")private WebElement searchElement1;

		
     @FindBy(xpath="//a[@class='nav-link active']")private WebElement subcategory1;
	private CharSequence input;
	private WebElement subcategory;


	public SubCategoryPage  clicksubcategory() {
		subcategorybox.click();
		return this;

		}
	public SubCategoryPage clickcategory()
	{
		categorybox.click();
		return  this;
		
	}
	public SubCategoryPage clickonSubCategoryCategory()
	{
		enterSubCategoryInformationCategory.sendKeys("vegetables");
		return this;
}
	public SubCategoryPage clickonSubCategorySubCategory()
	{
		enterSubCategoryInformationsubCategory.sendKeys("beetroot");
		return this;
		
	}
	public  SubCategoryPage chooseImage()
	{
		imageuploadElement.sendKeys(Constants.TESTDATAFILE1);
		return this;
		
	}
	public void clickonNewButton()
	{
		newElement.click();
		
	}
	public void pageScroll()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", showMessageButton);
		js.executeScript("window.scrollBy(0,350)", "");
		
		
	}
	public void clickonSaveButton()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", savElement);
		//js.executeScript("window.scrollBy(0,350)", "");
	}
	public SubCategoryPage clickonSearchButton()
	{
		searchElement.click();
		return this;
	}
	public SubCategoryPage clickonsearchListSubCategoryCategory()
	{
		searchListSubCategoryCategoryElement.click();
		return this;
	}
	public void clickSearchListSubCategoriesCategory()
	{
		searchListSubCategoryCategoryElement.click();

		Select select=new Select(searchListSubCategoryCategoryElement);
		select.selectByIndex(1);
		
		select.selectByValue("555");
		
		
		
		
	}
	public void clickSearchListSubCategoriesSubCategory()
	{
		searchListSubCategorySubCategoryElement.sendKeys("carrot");
		
	}
	public void clickonSearch1()
	{
		searchElement1.click();
	}
	
public boolean isSubCategoryisEnabled()
{
	return subcategory1.isDisplayed();
}

}


