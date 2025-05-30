package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindow extends Base {
	
	public void multipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		WebElement clickhere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		Set<String>handlesids=driver.getWindowHandles();
		System.out.println(handlesids);
		Iterator<String>it=handlesids.iterator();
		while(it.hasNext())
		{
			String currentid = it.next();
		
		if(!currentid.equals(parentwindow))
		{
			driver.switchTo().window(currentid);
			WebElement email = driver.findElement(By.xpath("//input[@name=\'emailid\']"));
			email.sendKeys("amal444466@gmail.com");
			WebElement submit= driver.findElement(By.xpath("//input[@value=\'Submit\']"));
			submit.click();
		}
		}
	}

	public static void main(String[] args) {
		HandlingMultipleWindow multiplew = new HandlingMultipleWindow();
		multiplew.intialisebrowser();
		multiplew.multipleWindow();

	}

}
