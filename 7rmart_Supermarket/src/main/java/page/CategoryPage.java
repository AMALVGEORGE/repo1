package page;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
	public WebDriver driver;
	public CategoryPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username")private WebElement usernamefield;
	@FindBy(name="password")private WebElement passwordfield;
	@FindBy(xpath="//*[@id=\"login-form\"]/div/div/div[3]/div[2]/button")private WebElement signinbutton;
	@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[13]/a/p")private WebElement categorybutton;
	@FindBy(xpath = "/html/body/div/div[1]/section/div[1]/a[1]")private WebElement newcategory;
	@FindBy(xpath = "//input[@id=\"category\"]")private  WebElement categoryname;
	@FindBy(xpath = "//li[@id=\"134-selectable\"]")private WebElement categorygroup;
	@FindBy(xpath = "//input[@id=\"main_img\"]")private WebElement categoryimage;
	@FindBy(xpath = "//button[text()=\"Save\"]")private WebElement savebutton;
	@FindBy(className = "alert-success")private WebElement categoryalert;

	public void enterUsernameonField(String username)
	{
		usernamefield.sendKeys(username);
	}
	public void enterPasswordonField(String password)
	{
		passwordfield.sendKeys(password);
	}
	public void signinButton()
	{
		signinbutton.click();

	}
	public void clickonCategory()
	{
		categorybutton.click();
	}
	public void clicknewCategory()
	{
		newcategory.click();
	}
	public void addCategoryname()
	{
		categoryname.sendKeys("QA by Java");
	}
	public void addCategorygroup()
	{
		categorygroup.click();
	}
	public void addCategoryImage() throws AWTException
	{
		
		categoryimage.sendKeys("C:\\Users\\amal4\\git\\repo1\\7rmart_Supermarket\\src\\test\\resources\\grocery.jpg");
		}
	public void clickonSaveButton()
	{
		savebutton.click();
	}
	public String alertCategory()
	{
		return(categoryalert.getText());
	}
}