package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTableHandling extends Base{
	
	public void verifyTableHandling()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement newtable =driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(newtable.getText());
		WebElement tablerow= driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(tablerow.getText());
	}

	public static void main(String[] args) {
		HandlingTableHandling tablehandle =  new HandlingTableHandling();
		tablehandle.intialisebrowser();
		tablehandle.verifyTableHandling();

	}

}
