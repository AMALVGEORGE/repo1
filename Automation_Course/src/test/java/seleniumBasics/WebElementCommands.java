package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base{
	
	
	public void verifyWebElemetCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagebox.sendKeys("Amal V George"); // input 
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showMessageButton.isDisplayed());
		System.out.println(showMessageButton.isEnabled());
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elemenWait<driver>Clickable(showMessageButton));
		Wait<WebDriver>fluent=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
		.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class)	;
		.fluent.until(ExpectedConditions.elementToBeClickable(showMessageButton));
		showMessageButton.click();
		WebElement yourMessage = driver.findElement(By.xpath("//div[id='message-one']"));
	    System.out.println(yourMessage.getText());
	    messagebox.clear();
	    WebElement valueA =  driver.findElement(By.id("value-a"));
	    System.out.println(valueA.getTagName());
		}

	public static void main(String[] args) {
		WebElementCommands webElement =  new WebElementCommands();
		webElement.intialisebrowser();
		webElement.verifyWebElemetCommands();
		
		

	}

}
