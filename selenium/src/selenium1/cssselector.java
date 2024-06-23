package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[placeholder^='Email']")).sendKeys("Sudheer@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Sudheer@123");
	}
}
