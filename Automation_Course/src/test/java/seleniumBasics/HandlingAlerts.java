package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{
	
	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert=driver.findElement(By.id("alertButton"));
		simplealert.click();
		Alert alets = driver.switchTo().alert();
		alets.accept();
		
	}
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert= driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Alert alets = driver.switchTo().alert();
		alets.accept();
		
	}
	
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptalert=driver.findElement(By.id("promtButton"));
		promptalert.click();
		Alert alets = driver.switchTo().alert();
		alets.sendKeys("Amal");
		alets.accept();
		
	}

	public static void main(String[] args) {
		HandlingAlerts alerts = new HandlingAlerts();
		alerts.intialisebrowser();
		alerts.verifySimpleAlert();
		alerts.verifyConfirmAlert();
		alerts.verifyPromptAlert();

	}

}
