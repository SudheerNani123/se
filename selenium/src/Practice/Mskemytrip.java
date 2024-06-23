package Practice;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mskemytrip {
WebDriver driver;
	
	void MMT() throws InterruptedException {
		driver = new ChromeDriver();
		
			driver.get("https://www.makemytrip.com/");
			Thread.sleep(6000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(6000);
			
			driver.switchTo().frame((WebElement) driver.findElements(By.id("webklipper-publisher-widget-container-notification-close-div"))).close();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
			Thread.sleep(3000);
			
			driver.quit();
			
	}
		public static void main(String[] args) throws InterruptedException, AWTException {
			// TODO Auto-generated method stub
			Mskemytrip obj = new Mskemytrip();
			  obj.MMT();
		}

}
