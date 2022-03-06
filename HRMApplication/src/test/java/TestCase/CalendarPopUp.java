package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageRepository.BasePage;

public class CalendarPopUp extends BasePage
{
	@Test
	public void calendate() throws Throwable
	{
		//driver.get("https://www.phptravels.net/");
		String month="December 2021";
		String day="25";
		driver.findElement(By.id("checkin")).click();;
		Thread.sleep(5000);
        
		while(true)
		{
			String text=driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[1]/th[2]")).getText();
		    if(text.equals(month))
		    {
		    	break;
		    }
		    else
		    {
		    	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[1]/th[3]/i")).click();
		    }
		}
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day+")]")).click();
	    Thread.sleep(6000);
	}   
	
}
