package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	
	public void verifyFileUploadBySendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileupsk=driver.findElement(By.id("uploadfile_0"));
		fileupsk.sendKeys("C:\\Users\\amal4\\git\\repo1\\Automation_Course\\src\\test\\resources\\Java_Basics_Cheat_Sheet (1).pdf");
        WebElement terms = driver.findElement(By.id("terms"));
        terms.click();
        WebElement submit = driver.findElement(By.id("submitbutton"));
        submit.click();
        
	}
	public void verifyfileuploadByRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement pickfile = driver.findElement(By.id("pickfiles"));
		pickfile.click();
		StringSelection ss = new StringSelection("C:\\Users\\amal4\\git\\repo1\\Automation_Course\\src\\test\\resources\\Java_Basics_Cheat_Sheet (1).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.delay(2500);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void main(String[] args) {
		HandlingFileUpload fileup= new HandlingFileUpload();
		fileup.intialisebrowser();
		fileup.verifyFileUploadBySendkeys();
		try {
			fileup.verifyfileuploadByRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
