package PageRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage 
{ 
	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://seleniumpractise.blogspot.com/2016/");
	}
	
   /*@AfterClass
	public void teardown()
	{
		driver.quit();
	}*/

}
