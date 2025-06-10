package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.ManagenewsPage;
import utilities.ExcelData;

public class ManagenewsTest extends BaseTestMart {
	
	@Test
	
	public void validateManagenewsbutton() throws IOException
	{
		String username = ExcelData.getstring(0,0,"login_sheet");
		String password = ExcelData.getstring(0,1,"login_sheet");
		ManagenewsPage managenews = new ManagenewsPage(driver);
		managenews.enterUsernameonField(username);
		managenews.enterPasswordonField(password);
		managenews.signinButton();
		managenews.clickManagenewsButton();
		String actual=managenews.managenewsHeaderDisplayed();
		String expected = "Manage News";
		Assert.assertEquals(actual, expected,"User not landed on Manage news page");
		
	}

	@Test
	public void createNewNews() throws IOException
	{
		String username = ExcelData.getstring(0,0,"login_sheet");
		String password = ExcelData.getstring(0,1,"login_sheet");
		ManagenewsPage managenews = new ManagenewsPage(driver);
		managenews.enterUsernameonField(username);
		managenews.enterPasswordonField(password);
		managenews.signinButton();
		managenews.clickManagenewsButton();
		managenews.clickCreateNewsBUtton();
		managenews.enterNewsonnewsField();
		managenews.clickSaveButton();
		boolean savednewsAlert  = managenews.savednewsalertDisplayed();
		Assert.assertTrue(savednewsAlert, "Alert not displayed - News may not have been created");

	}
	@Test
	public void searchCreatedNews() throws IOException
	{
		String username = ExcelData.getstring(0,0,"login_sheet");
		String password = ExcelData.getstring(0,1,"login_sheet");
		ManagenewsPage managenews = new ManagenewsPage(driver);
		managenews.enterUsernameonField(username);
		managenews.enterPasswordonField(password);
		managenews.signinButton();
		managenews.clickManagenewsButton();
		managenews.clicksearchNewsButton();
		managenews.searchonSearchField();
		managenews.clickonSearchbutton();
		boolean searchResultDisplayed  = managenews.searchResultDisplayed();
		Assert.assertTrue(searchResultDisplayed, "Search Unsuccesful");
		
	}
}
