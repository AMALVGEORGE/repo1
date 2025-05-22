package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
	public void verifyRightclick()
	{
		WebElement rightclick = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions actions = new Actions(driver);
		actions.contextClick(rightclick).perform();
		}
	
	public void verifyMouseOver()
	{
		WebElement mouseOver= driver.findElement(By.id("others"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseOver).perform();
	}
	
	public void dragandDrop()
	{
	    driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
		}

	public static void main(String[] args) {
		HandlingActions action =new HandlingActions();
		action.intialisebrowser();
		action.verifyRightclick();
		action.verifyMouseOver();
    	action.dragandDrop();
	}

}
