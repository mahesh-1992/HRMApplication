package TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageRepository.BasePage;

public class CalendarPopUp1 extends BasePage
{
	@Test
	public void calendarDate() throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='departure']")).click();
		Thread.sleep(6000);
		String month="Janbury 2022";
		String day="5";
		
		while(true)
		{
			 String text=driver.findElement(By.xpath("")).getText();
			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("")).click();
			}
			
		}
		List<WebElement> allDates=driver.findElements(By.xpath(""));
		for(WebElement ele:allDates)
		{
			 ele.getText();
		}
		
		
	}
	
}
