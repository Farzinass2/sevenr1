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
	
	@Test(description = "Add new Category and SubCategory in Sub-Category Menu", priority = 1, groups = { "smoke" })
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
		home3.clickonSubCategorySubCategory();
		
		boolean isSubCategoryisEnabled=home3.isSubCategoryisEnabled();
		Assert.assertTrue(isSubCategoryisEnabled,Messages.SUBCATADDED);
		home3.chooseImage();
		home3.pageScroll();
		home3.clickonSaveButton();
		
	}
	@Test(description = "Search the added item in Sub-Category Menu", priority = 2, groups = { "smoke" })
	
public void searchCategory() throws IOException
	{
		String username = ExcelUtility.getStringdata(0, 0, "SignPage");
		String password = ExcelUtility.getStringdata(0, 1, "SignPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUserNameField(username).enterPasswordonPasswordField(password);
		 home=loginpage.clickonSignInButton();
		
		SubCategoryPage home3=new SubCategoryPage(driver);
		 home3.clicksubcategory();
		 
		 home3.clickonSearchButton();
		// String input=ExcelUtility.getStringdata(1, 0, "SubCategory");
		 //String input1=ExcelUtility.getStringdata(1, 1, "SubCategory");
		 home3.clickSearchListSubCategoriesCategory();
		 home3.clickSearchListSubCategoriesSubCategory();
		 boolean isSubCategoryisEnabled=home3.isSubCategoryisEnabled();
			Assert.assertTrue(isSubCategoryisEnabled,Messages.SUBCATEGORYS);
		 
		
	

}
}
