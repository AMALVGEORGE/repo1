package testScript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.CategoryPage;
import utilities.ExcelData;

public class CategoryTest extends BaseTestMart {
	
	@Test
	public void addNewCategory() throws IOException, AWTException
	{
		String username = ExcelData.getstring(0,0,"login_sheet");
		String password = ExcelData.getstring(0,1,"login_sheet");
		CategoryPage category = new CategoryPage(driver);
		category.enterUsernameonField(username);
		category.enterPasswordonField(password);
		category.signinButton();
		category.clickonCategory();
		category.clicknewCategory();
		category.addCategoryname();
		category.addCategorygroup();
	    category.addCategoryImage();
	    category.clickonSaveButton();
	    String actual=category.alertCategory();
		String expected = "Alert!\nCaterory Created Successfully";
		Assert.assertEquals(actual, expected,"User unable to create category");
		
	}

}
