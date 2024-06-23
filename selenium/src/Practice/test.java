package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class test {
	static {
		System.setProperty("webdriver.gecho.driver","./gechodriver.exe");
	}
public static void main(String[] args) throws InterruptedException, IOException {
	
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.com/");
	  Thread.sleep(3000);
	  WebElement search = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]"));
	  search.click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("(//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW'])[17]")).click();
	 Thread.sleep(3000);
	 
	 
	 TakesScreenshot ts = (TakesScreenshot)driver;
		Thread.sleep(2000);
		File src = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest = new File("C:\\Users\\vasam\\OneDrive\\Pictures\\Screenshots\\beauty.png");
		Thread.sleep(2000);
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(3000);
		 driver.quit();
	 
	 
}
}
