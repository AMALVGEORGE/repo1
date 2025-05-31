package testScript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import page.LoginPage;
import seleniumBasics.BaseTestNG;
import utilities.ExcelUtilities;

public class LoginTest extends BaseTestNG{
	@Test
	public void verifyUserLoginwithValidCredentials() throws IOException
	{
		//WebElement usernamefield = driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standard_user");
		//WebElement passwordfield = driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret_sauce");
		//WebElement loginbutton = driver.findElement(By.id("login-button"));
		//loginbutton.click();
		String username = ExcelUtilities.Getstring(0,0,"LoginSheet");
		String password= ExcelUtilities.Getstring(0,1,"LoginSheet");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.loginButton();
	}
@Test
	public void verifywithInvalidUserLoginValidPassword() throws IOException
	{
		//*WebElement usernamefield = driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standarduser");
	//WebElement passwordfield = driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret_sauce");
		//WebElement loginbutton = driver.findElement(By.id("login-button"));
		//loginbutton.click();
	String username = ExcelUtilities.Getstring(1,0,"LoginSheet");
	String password= ExcelUtilities.Getstring(1,1,"LoginSheet");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameonUsernameField(username);
	loginpage.enterPasswordonPasswordField(password);
	loginpage.loginButton();
		
		
	}
@Test
	public void verifywithValidUsernameInvalidPassword() throws IOException
	{
		//WebElement usernamefield = driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standard_user");
		//WebElement passwordfield = driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secretsauce");
		//WebElement loginbutton = driver.findElement(By.id("login-button"));
		//loginbutton.click();
	String username = ExcelUtilities.Getstring(2,0,"LoginSheet");
	String password= ExcelUtilities.Getstring(2,1,"LoginSheet");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameonUsernameField(username);
	loginpage.enterPasswordonPasswordField(password);
	loginpage.loginButton();
	
	
	}
	@Test
	public void verifywithInvalidCredentials() throws IOException
	{
		//WebElement usernamefield = driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standarduser");
		//WebElement passwordfield = driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secretsauce");
		//WebElement loginbutton = driver.findElement(By.id("login-button"));
		//loginbutton.click();
		String username = ExcelUtilities.Getstring(3,0,"LoginSheet");
		String password= ExcelUtilities.Getstring(3,1,"LoginSheet");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameonUsernameField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.loginButton();
		
	}
}
