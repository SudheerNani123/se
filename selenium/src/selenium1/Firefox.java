package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Sudheer");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Sudheer123");
	}
}
