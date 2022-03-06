package TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageRepository.BasePage;

public class Autosaggesation extends BasePage
{

	@Test
	public void dropdownsuggestion() throws Throwable
	{
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(7000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		for(WebElement word:list)
		{
			if(word.getText().equals("seleniumhq"))
			{
				word.click();
				break;
				
			}
		}
	}
}
