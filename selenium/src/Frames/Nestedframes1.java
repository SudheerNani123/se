package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nestedframes1 {
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
		driver.findElement(By.id("name")).sendKeys("Frame-3");
		
		driver.switchTo().frame(driver.findElement(By.id("frm2")));
		
		Select s = new Select(driver.findElement(By.id("selectnav1")));
		s.selectByVisibleText("- Basic Controls");
		
		driver.findElement(By.id("firstName")).sendKeys("nani");
		driver.findElement(By.id("lastName")).sendKeys("Sudheer");
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("email")).sendKeys("nani@neogensofttech.com");
		driver.findElement(By.id("password")).sendKeys("nani@neogensofttech");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("back to parent frame3");
 
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Finally back to default content");
}
}
