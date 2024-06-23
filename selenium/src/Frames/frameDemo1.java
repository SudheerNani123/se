package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class frameDemo1 {
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
		driver.switchTo().frame(driver.findElement(By.id("frm2")));
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sudheer");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Nani");
		driver.findElement(By.xpath("//input[@id='malerb']")).click();
		driver.findElement(By.xpath("//input[@id='latinchbx']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sudheer@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("********");
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("back to default content");
		
	
		
}
}

