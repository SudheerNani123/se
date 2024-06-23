package selenium1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbarhandaling_pixal {
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
		driver.get("https://www.nike.com/in/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,4000)");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,-200)");
		Thread.sleep(2000);
		driver.close();	}
}
