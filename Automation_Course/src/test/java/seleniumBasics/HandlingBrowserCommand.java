package seleniumBasics;

import org.openqa.selenium.WebDriver;

public class HandlingBrowserCommand extends Base
{
	public WebDriver driver;
public void verifybrowsercommand()
{
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getWindowHandle());
}
	public static void main(String[] args) {
		HandlingBrowserCommand browser = new HandlingBrowserCommand();
		browser.intialisebrowser();
		browser.verifybrowsercommand();
		// browser.browserclose(); 

	}

}
