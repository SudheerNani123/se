package selenium1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH_SD_SS {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static <webElement> void main(String[] args) throws InterruptedException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		searchbox.sendKeys("moto");
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/image/312/312/xif0q/mobile/c/k/9/g34-5g-pb1v0001in-motorola-original-imagwu4r4xze9jwz.jpeg?q=70'][1]")).click();
		Thread.sleep(6000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(2000);

		Set<String> win =driver.getWindowHandles();
		Iterator<String> it=win.iterator();
		String win1=it.next();
		String win2=it.next();
		driver.switchTo().window(win2);
		Thread.sleep(4000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		Thread.sleep(2000);
	
		js1.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		Thread.sleep(2000);
		File src = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest = new File("C:\\Users\\vasam\\OneDrive\\Desktop\\bug screen shot\\flip1.png");
		Thread.sleep(2000);
		FileUtils.copyFile(src, dest);
		Thread.sleep(2000);
		driver.close();
				
	}
}
