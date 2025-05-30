package seleniumBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@Test
	public void testMethod()
	{
		System.out.println("Test Case");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
@AfterMethod	
public void afterMethod()
{
	System.out.println("After Method");
}

@BeforeTest
public void beforeTest()
{
	System.out.println("Before Test");
	
}

@AfterTest
public void afterTest()
{
	System.out.println("After Test");
}
@BeforeSuite
public void beforeSuite()
{
	System.out.println("Before Suite");
}
@AfterSuite
public void afterSuite()
{
	System.out.println("After Suite");
}


}