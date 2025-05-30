package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	
	public void verifyFrames()
	{
		
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement>totalframes = driver.findElements(By.tagName("iframe"));
		System.out.println(totalframes.size());
		WebElement mainframe = driver.findElement(By.xpath("//iframe[id='frame1']"));
		driver.switchTo().frame(mainframe);
		WebElement tableheading = driver.findElement(By.xpath("//hi[@id=sampleheading]"));
		System.out.println(tableheading);
	}
		
	public static void main(String[] args) {
		HandlingFrames frames = new HandlingFrames();
		frames.intialisebrowser();
		frames.verifyFrames();

	}

}
