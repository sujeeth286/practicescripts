package mb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.meesho.com");
		Thread.sleep(6000);
		
		//SCROLL DOWN ACTION
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		//SCROLL UP ACTION
		act.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).perform();
		
		
		
		
	}
		
		

}
