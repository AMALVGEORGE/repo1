package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import page.LoginPage;
import seleniumBasics.BaseTestNG;

public class LoginTest extends BaseTestNG{
	@Test
	public void verifyUserLoginwithValidCredentials()
	{
		//WebElement usernamefield = driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standard_user");
		//WebElement passwordfield = driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret_sauce");
		//WebElement loginbutton = driver.findElement(By.id("login-button"));
		//loginbutton.click();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField();
		loginpage.enterPasswordonPasswordField();
		loginpage.loginButton();
	}
@Test
	public void verifywithInvalidUserLoginValidPassword()
	{
		WebElement usernamefield = driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standarduser");
	WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();
	
		
	}
@Test
	public void verifywithValidUsernameInvalidPassword()
	{
		WebElement usernamefield = driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user");
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("secretsauce");
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
	@Test
	public void verifywithInvalidCredentials()
	{
		WebElement usernamefield = driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standarduser");
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("secretsauce");
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
}
