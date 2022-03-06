package TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageRepository.BasePage;

public class RadioButton extends BasePage
{
	@Test()
	public void radioButton()
	{
		List<WebElement> radio=driver.findElements(By.xpath("//input[@name='lang' and @TYPE='radio']"));
        for(int i=0;i<radio.size();i++)
		{
			WebElement radio_local=radio.get(i);
			String value=radio_local.getAttribute("value");
			System.out.println("values from radio button=====>"+value);
			
			if(value.equalsIgnoreCase("RUBY"))
			{
				radio_local.click();
			}
		}
	}

}
