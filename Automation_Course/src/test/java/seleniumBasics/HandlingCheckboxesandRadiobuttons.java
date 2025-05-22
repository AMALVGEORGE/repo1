package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HandlingCheckboxesandRadiobuttons extends Base{
	
	public void verifyCheckboxes()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @value='option-1']"));
		checkbox.click(); 
		System.out.println(checkbox.isSelected());
		
		
	}
	
	public void verifyRadioButtons()
	{
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton = driver.findElement(By.xpath("//input[@type='radio' and @value='green']"));
		radiobutton.click();
		
		
	}

	public static void main(String[] args) {
		HandlingCheckboxesandRadiobuttons checkbox = new HandlingCheckboxesandRadiobuttons();
		checkbox.intialisebrowser();
		checkbox.verifyCheckboxes();
		checkbox.verifyRadioButtons();
	}

}
