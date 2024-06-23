package selenium2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mearge {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='search']"));
		searchbox.sendKeys("Selenium");
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		WebElement app = driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		act.contextClick(app).perform();
		Thread.sleep(4000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		
		Set<String> winhan = driver.getWindowHandles();
		Thread.sleep(2000);
		Iterator<String> i = winhan.iterator();
		Thread.sleep(2000);
		String win1 = i.next();
		String win2 = i.next();
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
