package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Get_location {
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
		driver.findElement(By.xpath("//a[text()='Shop']")).click();
		Thread.sleep(4000);
		WebElement search = driver.findElement(By.xpath("//a[text()='Sustainability']"));
		Thread.sleep(4000);
		Point loc = search.getLocation();
		Thread.sleep(4000);
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		driver.close();
	}
}
