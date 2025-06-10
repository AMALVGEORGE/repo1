package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public WebDriver driver;
	public AdminPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div/nav/ul[2]/li/a")private WebElement adminbutton;
	@FindBy(xpath ="/html/body/div/nav/ul[2]/li/div/a[2]")private WebElement logoutbutton;
	@FindBy(xpath="//p[text()='dashboard']")private WebElement dashboard;
	
	public void clickonAdminButton()
	{
		adminbutton.click();
	}
	public void clickonLogoutButton() {
		logoutbutton.click();
	}
	public String dashboardDisplayed()
	{
		return(dashboard.getText());
	}
}
	

