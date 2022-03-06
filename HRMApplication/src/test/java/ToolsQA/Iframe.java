package ToolsQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws Exception 
	{
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demoqa.com/frames");
      JavascriptExecutor jse=(JavascriptExecutor)driver;
      //jse.executeScript(0, args);
     List<WebElement> iframeElement= driver.findElements(By.tagName("iframe"));
   /*  for(WebElement ele:iframeElement) 
     {
       System.out.println("name of the iframe="+ele.getAttribute("iframe")); 
     }*/
     System.out.println("total no. of iframe="+iframeElement.size());
     driver.switchTo().frame(1);
     Thread.sleep(3000);
     driver.quit();

	}

}
