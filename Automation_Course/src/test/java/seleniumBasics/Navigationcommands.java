package seleniumBasics;

import org.openqa.selenium.WebDriver;

public class Navigationcommands extends Base {
	public WebDriver driver;
	
	public void verityNavigationCommands()
	{
	 driver.navigate().to("https://www.amazon.in/");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	}

	public static void main(String[] args) {
		Navigationcommands navigate = new Navigationcommands();
		navigate.verityNavigationCommands();
		navigate.intialisebrowser();
		navigate.browserclose();
		
		
	}

}
