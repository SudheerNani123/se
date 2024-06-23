package selenium1;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nukari {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static <webElement> void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		//Thread.sleep(3000);
WebElement searchbox=driver.findElement(By.xpath("//input[@class='suggestor-input ']"));
searchbox.sendKeys("Test engineering");
searchbox.sendKeys(Keys.ENTER);
Thread.sleep(6000);
driver.findElement(By.xpath("//a[text()='Quality Engineer (Tester)']")).click();
Thread.sleep(6000);
Set<String> win =driver.getWindowHandles();
Iterator<String> it=win.iterator();
String win1=it.next();
String win2=it.next();
driver.switchTo().window(win2);
Thread.sleep(4000);
driver.findElement(By.xpath("//button[@id='reg-apply-button']")).click();
Thread.sleep(1000);
driver.close();
		
		
}
}
