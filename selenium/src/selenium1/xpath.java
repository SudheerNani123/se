package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://in.bookmyshow.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id()='mobileNo']")).sendKeys("1234567");
		
		//driver.get("https://www.instagram.com/");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("1234567");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		
	}	
		
}
