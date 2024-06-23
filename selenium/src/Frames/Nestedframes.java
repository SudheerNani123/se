package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nestedframes {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html#google_vignette");
		driver.findElement(By.id("name")).sendKeys("default content area");
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("frame3");
		WebElement nestedframe1 = driver.findElement(By.id("frm1"));
		driver.switchTo().frame(nestedframe1);
		Select s = new Select(driver.findElement(By.id("course")));
		s.selectByVisibleText("Java");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("back to parent frame");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Finally back to default content");
}
}