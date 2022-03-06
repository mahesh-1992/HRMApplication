package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageRepository.BasePage;

public class GoogleApp extends BasePage
{
	@Test
	public void googleApp() throws Exception
	{
		driver.findElement(By.xpath("//a[@role='button']/*[name()='svg']")).click();
		Thread.sleep(3000);
	}

}