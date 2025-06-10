package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.AdminPage;
import page.LoginMartPage;
import utilities.ExcelData;

public class AdminTest extends BaseTestMart	
{
	@Test
	public void verifyAdminClick() throws Exception
	{
		String username = ExcelData.getstring(0,0,"login_sheet");
		String password = ExcelData.getstring(0,1,"login_sheet");
		LoginMartPage login = new LoginMartPage(driver);
		login.enterUsernameonField(username);
		login.enterPasswordonField(password);
		login.signinButton();
		AdminPage admin = new AdminPage(driver);
		admin.clickonAdminButton();
		admin.clickonLogoutButton();
		String actual=login.dashboardDisplayed();
		String expected = "Dashboard";
		Assert.assertEquals(actual, expected,"User unable to login");
		
	}



}
