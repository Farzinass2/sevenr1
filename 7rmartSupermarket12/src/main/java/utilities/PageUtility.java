package utilities;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class PageUtility {
	private WebDriver driver;
	public void selectDropdownWithValue(WebElement element, String value) {
		Select object = new Select(element);
		object.selectByValue(value);
		
	}
	public void selectDropdownWithVisibleText(WebElement element, String value) {
		Select selectObj = new Select(element);

		selectObj.selectByVisibleText(value);
		}

		public void selectDropdownWithIndex(WebElement element, int value) {
		Select selectObj = new Select(element);
		selectObj.selectByIndex(value);

		}

	public void  verifyRightClick(WebElement showmessagElement,String value)
	{
		
		Actions actions=new Actions(driver);
		actions.contextClick(showmessagElement).build().perform();
		
		
	}
public void verifyMouseHover(WebElement mousElement,String value)
{

	Actions actions=new Actions(driver);
	actions.moveToElement(mousElement).build().perform();
	
}
public void handlingCheckBox(WebElement checkbox1,String value) {
	
	//Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
			//.withTimeout(Duration.ofSeconds(10))
			//.pollingEvery(Duration.ofSeconds(3))
			//.ignoring(NoSuchElementException.class);
			//fluentWait.until(ExpectedConditions.elementToBeClickable(checkbox1));
	checkbox1.click();	
	System.out.println(checkbox1.isSelected());
	Select object = new Select(checkbox1);
	object.selectByValue(value);
	
}
public void  handlingRadioButton(WebElement radioButtonElement)
{
	//driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");	
	//WebElement radioButtonElement=driver.findElement(By.xpath("//input[@value='green']"));
	radioButtonElement.click();
	
	
	}
} 
	


