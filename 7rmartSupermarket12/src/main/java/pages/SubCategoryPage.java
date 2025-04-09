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
	@FindBy(xpath = "//input[@id='main_img']")private WebElement imageuploadElement;
	@FindBy(xpath = "//button[@class='btn btn-danger']")private WebElement savElement;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchElement;
	
	
	@FindBy(xpath="//input[@placeholder='Sub Category']")private WebElement subCategory;
	
	@FindBy(xpath="//select[@id='un']")private WebElement Category;
	
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[2]")private WebElement listSubCategorySearchElement;
    
@FindBy(xpath="//select[@id='cat_id']")private 	WebElement enterSubCategoryInformationCategory;
@FindBy(xpath="//input[@id='subcategory']")private WebElement enterSubCategoryInformationsubCategory;
	
	@FindBy(xpath="//input[@name='subcategory']")private WebElement subCategory1;
	@FindBy(xpath="//select[@class='form-control selectpicker']")private WebElement searchListSubCategoryCategoryElement;
	
	//subCategory.sendKeys("carrot");
	@FindBy(xpath="//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[2]/input")private WebElement searchListSubCategorySubCategoryElement;
     @FindBy(xpath="//button[@name='Search']")private WebElement searchElement1;
     @FindBy(xpath="(//p[text()='Sub Category'])[2]")private WebElement subcategory;
	private CharSequence input;


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
		enterSubCategoryInformationCategory.click();
		return this;



	}
	public SubCategoryPage clickonSubCategorySubCategory(String input2)
	{
		enterSubCategoryInformationsubCategory.sendKeys(input);
		return this;
		
	}
	public  SubCategoryPage chooseImage()
	{
		imageuploadElement.sendKeys(Constants.TESTDATAFILE1);
		return this;
	}
	public SubCategoryPage clickonNewButton()
	{
		newElement.click();
		return this;
	}
	public SubCategoryPage pageScroll()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", showMessageButton);
		js.executeScript("window.scrollBy(0,350)", "");
		return this;
		
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
	public SubCategoryPage clickSearchListSubCategoriesCategory(String input)
	{
		searchListSubCategoryCategoryElement.click();

		//Select select=new Select(searchListSubCategoryCategoryElement);
		//select.selectByIndex(1);
		//select.selectByVisibleText("Python");
		//select.selectByValue("veggies");
		PageUtility utility=new PageUtility();
		utility.selectDropdownWithValue(searchListSubCategoryCategoryElement, "veggies");
		return this;
	}
	public SubCategoryPage clickSearchListSubCategoriesSubCategory(String input1)
	{
		searchListSubCategorySubCategoryElement.sendKeys("carrot");
		return this;
	}
	public void clickonSearch1()
	{
		searchElement1.click();
	}
public boolean isSubCategoryisEnabled()
{
	return subcategory.isDisplayed();
}

}
//package pages;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

//import constants.Constants;
//import utilities.PageUtility;
//import utilities.WaitUtility;

	//public class SubCategoryPage{
		//WaitUtility wait=new WaitUtility();
		//public WebDriver driver1;
		//public SubCategoryPage(WebDriver driver)
		//{
			//this.driver1=driver;
			//PageFactory.initElements(driver,this);
		//}
		//@FindBy(xpath="//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-sub-category\"]")private WebElement subcategory;
		//@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newSubcategory;
		//@FindBy(xpath="//select[@id=\'cat_id\']")private WebElement categoryInput;
		//@FindBy(xpath="//input[@id='subcategory']")private WebElement subcategoryInput;
		//@FindBy(xpath="//input[@id=\'main_img\']")private WebElement imageInput;
		//@FindBy(xpath="//button[text()='Save']")private WebElement saveButton;
		//@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchSubCategory;
		//@FindBy(xpath="//select[@id='un']")private WebElement categoryonSearchSubCategory;
		//@FindBy(xpath="//input[@name='ut']")private WebElement subCategoryonSearchSubCategory;
		//@FindBy(xpath="//button[@value='sr']")private WebElement searchonSearchSubCategory;
		//@FindBy(xpath="//button[@class='close']")private WebElement alertWindow;
		//@FindBy(xpath = "//table[@class=\"table table-bordered table-hover table-sm\"]/tbody/tr/td[1]")private WebElement searchWindow;
		
		
		//public SubCategoryPage clickNewSubcategory() {
			//newSubcategory.click();
			//return this;
		//}
		//public SubCategoryPage clickCategoryInput() {
			
			//PageUtility page=new PageUtility();
			//page.selectDropdownWithIndex(categoryInput, 3);
			//return this;
		//}
		//public SubCategoryPage clickSubCategoryInput(String input) {
			
			//subcategoryInput.sendKeys(input);
			//return this;
		//}
		//public SubCategoryPage clickOnImageInput() {
			
			//imageInput.sendKeys(Constants.TESTDATAFILE1);
			//return this;
		//}
		//public SubCategoryPage clickOnSaveButton() {
			//wait.waitUntilElementtobeClickable(driver1,saveButton);
			//saveButton.click();
			//return this;
		//}
		
		//public SubCategoryPage clickonsearchSubCategory() {
			//searchSubCategory.click();
			//return this;
		
		//}
		//public SubCategoryPage clickCategoryonsearchSubCategory() {
			//Select select=new Select(categoryonSearchSubCategory);
			//select.selectByIndex(3);
			//return this;
		//}
		//public SubCategoryPage clickonSubCategoryonSearchSubCategory(String input) {
			//subCategoryonSearchSubCategory.sendKeys(input);
			//return this;

		//}
		//public SubCategoryPage clickonsearchonSearchSubCategory() {
			//searchonSearchSubCategory.click();
			//return this;

		//}
		//public boolean verifyAlertWindowPresent() {
			//return alertWindow.isDisplayed();
		//}
		//public String verifySearchWindow() {
			//return searchWindow.getText();
		//}
	//}
