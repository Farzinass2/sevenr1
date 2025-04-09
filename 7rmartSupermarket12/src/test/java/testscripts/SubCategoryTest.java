package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;

public class SubCategoryTest  extends Base{
	public HomePage home;
	public LoginPage loginpage;
	
	@Test
	public void addNewCategory() throws IOException
	{
		String username = ExcelUtility.getStringdata(0, 0, "SignPage");
		String password = ExcelUtility.getStringdata(0, 1, "SignPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUserNameField(username).enterPasswordonPasswordField(password);
		home=loginpage.clickonSignInButton();
		
		SubCategoryPage home3=new SubCategoryPage(driver);
		home3.clicksubcategory();
		
		home3.clickonNewButton();
		
		home3.clickonSubCategoryCategory();
		String input=ExcelUtility.getStringdata(0, 0, "SubCategory");
		home3.clickonSubCategorySubCategory(input);
		boolean isSubCategoryisEnabled=home3.isSubCategoryisEnabled();
		Assert.assertTrue(isSubCategoryisEnabled,Messages.VALIDCREDENTIALERROR);
		home3.chooseImage();
		home3.pageScroll();
		home3.clickonSaveButton();
		
	}
	@Test
	
public void searchCategory() throws IOException
	{
		String username = ExcelUtility.getStringdata(0, 0, "SignPage");
		String password = ExcelUtility.getStringdata(0, 1, "SignPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUserNameField(username).enterPasswordonPasswordField(password);
		 home=loginpage.clickonSignInButton();
		
		SubCategoryPage home3=new SubCategoryPage(driver);
		 home3.clicksubcategory();
		 //home3.clickonSubCategoryCategory();
		 //home3.clickonSubCategorySubCategory();
		 home3.clickonSearchButton();
		 String input=ExcelUtility.getStringdata(1, 0, "SubCategory");
		 String input1=ExcelUtility.getStringdata(1, 1, "SubCategory");
		 home3.clickSearchListSubCategoriesCategory(input);
		 home3.clickSearchListSubCategoriesSubCategory(input1);
		 boolean isSubCategoryisEnabled=home3.isSubCategoryisEnabled();
			Assert.assertTrue(isSubCategoryisEnabled,Messages.VALIDCREDENTIALERROR);
		 
		
	    //home3.clickcategory();
	    //home3.clickonsearchListSubCategoryCategory();
	    
	    //home3.clickonSearchButton();
	    //home3.clickSearchListSubCategoriesCategory();
	    //home3.clickSearchListSubCategoriesSubCategory();
	    //home3. clickonSearchButton();
	    //home3.clickSearchListSubCategoriesSubCategory();
	    //home3. clickonSearch1();
	    //home3.clickSearchListSubCategoriesSubCategory();
	    //home3.clickonSearch1();
	    
	    //WebElement Category=driver.findElement(By.xpath("//select[@id='un']"));
	   // Category.click();
	    //Select select=new Select(Category);
	     //select.selectByIndex(1);
	//select.selectByVisibleText("Python");
	//select.selectByValue("veggies");
	     //home3.clickonSubCategory();
	//WebElement subCategory=driver.findElement(By.xpath("//input[@placeholder='Sub Category']"));
	//subCategory.sendKeys("carrot");
	//WebElement searchElement=driver.findElement(By.xpath("//button[@name='Search']"));
	//searchElement.click();

}
}
