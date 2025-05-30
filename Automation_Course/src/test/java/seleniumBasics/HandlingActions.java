package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

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
		//action.verifyRightclick();
		//action.verifyMouseOver();
    	//action.dragandDrop();
    	try {
			action.keyboardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void keyboardActions() throws AWTException
	{
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
	}
}


















