package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginMartPage;
import utilities.ExcelData;

public class LoginMartTest extends BaseTestMart{
	
	@Test
	
	public void validateWithValidCredentials() throws IOException
	{
		String username = ExcelData.getstring(10,0,"login_sheet");
		String password = ExcelData.getstring(0,1,"login_sheet");
		LoginMartPage login = new LoginMartPage(driver);
		login.enterUsernameonField(username);
		login.enterPasswordonField(password);
		login.signinButton();
		
	}
@Test
public void validateWithValidUsernameandInvalidPassword() throws IOException
{
	String username = ExcelData.getstring(1,0,"login_sheet");
	String password = ExcelData.getstring(1,1,"login_sheet");
	LoginMartPage login = new LoginMartPage(driver);
	login.enterUsernameonField(username);
	login.enterPasswordonField(password);
	login.signinButton();
	//boolean isdashboarddisplayed = login.dashboardDisplayed();
	//Assert.assertTrue(isdashboarddisplayed,"User not able to login");
	String actual=login.dashboardDisplayed();
	String expected = "Dashboard";
	Assert.assertEquals(actual, expected,"User unable to login");
	
}
@Test
public void validateWithInvalidUsernameandValidPassword() throws IOException 
{
	String username = ExcelData.getstring(2,0,"login_sheet");
	String password = ExcelData.getstring(2,1,"login_sheet");
	LoginMartPage login = new LoginMartPage(driver);
	login.enterUsernameonField(username);
	login.enterPasswordonField(password);
	login.signinButton();
}
@Test
public void validateWithInvalidCredentials() throws IOException
{
	String username = ExcelData.getstring(3,0,"login_sheet");
	String password = ExcelData.getstring(3,1,"login_sheet");
	LoginMartPage login = new LoginMartPage(driver);
	login.enterUsernameonField(username);
	login.enterPasswordonField(password);
	login.signinButton();
	
}
}
