package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginMartPage {

	public WebDriver driver;
	public LoginMartPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="username")private WebElement usernamefield;
	@FindBy(name="password")private WebElement passwordfield;
	@FindBy(xpath="//*[@id=\"login-form\"]/div/div/div[3]/div[2]/button")private WebElement signinbutton;
	
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
}
