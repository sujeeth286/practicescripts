package mb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.meesho.com");
		Thread.sleep(6000);
		 WebElement address = driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
		address.sendKeys("silk saree");
		Thread.sleep(2000);
		
		address.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='https://images.meesho.com/images/products/5524243/1_400.jpg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Add to Cart']")).click();
	}
		

}
