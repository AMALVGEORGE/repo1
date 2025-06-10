package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {
	
	public WebDriver driver;
	public AdminUsersPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="username")private WebElement usernamefield;
	@FindBy(name="password")private WebElement passwordfield;
	@FindBy(xpath="//*[@id=\"login-form\"]/div/div/div[3]/div[2]/button")private WebElement signinbutton;
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[1]/div/a")private WebElement adminusersbutton;
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]")private WebElement newadminuser;
	@FindBy(xpath="//input[@id=\"username\"]")private WebElement usernameadminusers;
	@FindBy(xpath = "//input[@id=\"password\"]")private WebElement passworadminusers;
	@FindBy(xpath = "//select[@id=\"user_type\"]")private WebElement usertype;
	@FindBy(xpath = "//button[@name=\"Create\"]")private WebElement savebutton;
	@FindBy(xpath = "/html/body/div/div[1]/section/div[2]/div/div[1]")private WebElement newadminuseralert; 
	@FindBy(xpath = "/html/body/div/div[1]/section/div[1]/a[2]")private WebElement searchadminuser;
@FindBy(xpath = "/html/body/div/div[1]/section/div[2]/div/div[1]/div/div/div/div[2]/form/div/div[1]/input")private WebElement searchadminuserfield;
@FindBy(xpath = "//button[@name=\"Search\"]")private WebElement searchbutton;
@FindBy(xpath = "/html/body/div/div[1]/section/div[2]/div/div[3]/div[2]/table/tbody/tr[1]/td[1]")private WebElement searchresult;
	
	
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
	public void clickonAdminUsers()
	{
		adminusersbutton.click();
	}
	public void clickonNewAdminUser()
	{
		newadminuser.click();
	}
	public void addnewAdminUserName()
	{
		usernameadminusers.sendKeys("AmalVG");
	}
	public void addnewAdminPassword()
	{
		passworadminusers.sendKeys("passsword");
	}
	public void selectAdminType()
	{
		Select select= new Select(usertype);
		select.selectByValue("admin");
	}
	
public void savenewAdminUser()
{
	savebutton.click();
}
public boolean newAdminUserAlert()
{
	return(newadminuseralert.isDisplayed());
}
public void searchAdminUser()
{
	searchadminuser.click();
}
public void enterusertoSearchonAdminUserfield()
{
	searchadminuserfield.sendKeys("AmalVG");
}
public void clickSearchButton()
{
	searchbutton.click();
}
public String searchAdminUserAlert()
{
	return(searchresult.getText());
}
}
