package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
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
		driver.get("https://demoqa.com/droppable/");
	WebElement scroll = driver.findElement(By.xpath("//div[@id='simpleDropContainer']"));
		Point loc = scroll.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		
		WebElement etobedrag = driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		WebElement etobedrop = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(etobedrag, etobedrop).perform();
		Thread.sleep(3000);
		driver.close();
	}
}
