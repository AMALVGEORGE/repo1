package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagenewsPage {
	public WebDriver driver;
	public ManagenewsPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
    @FindBy(name="username")private WebElement usernamefield;
	@FindBy(name="password")private WebElement passwordfield;
	@FindBy(xpath="//*[@id=\"login-form\"]/div/div/div[3]/div[2]/button")private WebElement signinbutton;
	@FindBy(xpath="//html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[16]/a/p")private WebElement managenewsbutton;
	@FindBy(xpath = "//a[@class=\"btn btn-rounded btn-danger\"]")private WebElement newnewsbutton;
	@FindBy(xpath = "//textarea[@id=\"news\"]")private WebElement enternewsbutton;
	@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement savenewsbutton;
	@FindBy(xpath = "//a[@class=\"btn btn-rounded btn-primary\"]")private WebElement searchnewsbutton;
	@FindBy(xpath = "//input[@class=\"form-control\"]")private WebElement searchfield;
	@FindBy(xpath = "//button[@name=\"Search\"]")private WebElement searchbutton;
	@FindBy(xpath = "//h1[@class=\"m-0 text-dark\"]")private WebElement managenewsheader;
    @FindBy(className = "alert-success")private WebElement newssavedalert;
	@FindBy(xpath = "//*[text()='World is now a happy place']")private WebElement searchassertionfield;
	
	
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
	
	public void clickManagenewsButton()
	{
		managenewsbutton.click();
	}
	public void clickCreateNewsBUtton()
	{
		newnewsbutton.click();
	}
	public void enterNewsonnewsField()
	{
		enternewsbutton.sendKeys("World is now a happy place");
	}
	public void clickSaveButton()
	{
		savenewsbutton.click();
	}
	public void clicksearchNewsButton()
	{
		searchnewsbutton.click();
	}
	public void searchonSearchField()
	{
		searchfield.sendKeys("World is now a happy place");
		
	}
	public void clickonSearchbutton()
	{
		searchbutton.click();
	}
public String managenewsHeaderDisplayed()
{
	return(managenewsheader.getText());
}
public boolean savednewsalertDisplayed()
{
	return newssavedalert.isDisplayed();
}
public boolean searchResultDisplayed()
{
	return(searchassertionfield.isDisplayed());
}
}

