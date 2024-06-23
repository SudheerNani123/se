package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceook {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		//driver.findElement(By.tagName("textarea")).sendKeys("gmail");
		//Thread.sleep(1000);
        //driver.findElement(By.id("email")).sendKeys("12345");
       // driver.findElement(By.id("pass")).sendKeys("abc@123");
        
        Navigation nav = driver.navigate();
        driver.get("https://www.facebook.com/");
        nav.forward();
        nav.back();
	    nav.refresh();    
		driver.close();
	}
}
