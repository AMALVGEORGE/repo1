package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.AdminUsersPage;
import utilities.ExcelData;

public class AdminUsersTest extends BaseTestMart {

	
	@Test
	
	public void createNewAdminUsers() throws IOException
	{
		String username = ExcelData.getstring(0,0,"login_sheet");
		String password = ExcelData.getstring(0,1,"login_sheet");
		AdminUsersPage adminusers = new AdminUsersPage(driver);
		adminusers.enterUsernameonField(username);
		adminusers.enterPasswordonField(password);
		adminusers.signinButton();
	    adminusers.clickonAdminUsers();
	adminusers.clickonNewAdminUser();
	adminusers.addnewAdminUserName();
	adminusers.addnewAdminPassword();
	adminusers.selectAdminType();
	adminusers.savenewAdminUser();
	boolean newadminuseralert= adminusers.newAdminUserAlert();
	Assert.assertTrue(newadminuseralert,"Admin User not created");
	}
@Test
public void searchAdminUsers() throws IOException
{
	String username = ExcelData.getstring(0,0,"login_sheet");
	String password = ExcelData.getstring(0,1,"login_sheet");
	AdminUsersPage adminusers = new AdminUsersPage(driver);
	adminusers.enterUsernameonField(username);
	adminusers.enterPasswordonField(password);
	adminusers.signinButton();
    adminusers.clickonAdminUsers();
    adminusers.searchAdminUser();
    adminusers.enterusertoSearchonAdminUserfield();
    adminusers.clickSearchButton();
    String actual=adminusers.searchAdminUserAlert();
	String expected = "AmalVG";
	Assert.assertEquals(actual, expected,"User did not get search result");
}
	
}





