package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandlngLocators extends Base {
	public WebDriver driver;
	
	public void verifyLocators()
	{
		
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("form-group"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple Form"));
		driver.findElement(By.cssSelector("input[id=['single-input-field']"));
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']\r\n"));
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']\r\n"));
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	}
	
	

	public static void main(String[] args) {
		
      HandlngLocators locators = new HandlngLocators();
      locators.intialisebrowser();
      locators.verifyLocators();
    // locators.browserclose();
}
}
