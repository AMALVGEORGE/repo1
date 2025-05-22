package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	
	public void verifyWebElemetCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagebox.sendKeys("Amal V George"); // input 
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showMessageButton.isDisplayed());
		System.out.println(showMessageButton.isEnabled());
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
