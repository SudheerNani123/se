package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Artoftesting {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://artoftesting.com/samplesiteforselenium");
		Thread.sleep(2000);
		driver.findElement(By.id("fname")).sendKeys("java");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		driver.findElement(By.id("male")).click();
		Thread.sleep(3000);
		
		List <WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = checkbox.size();
		for(int z=0;z<count;z++)
		{
			checkbox.get(z);
		}
		for(WebElement we :checkbox )
		{
			we.click();
		
			
			WebElement drp = driver.findElement(By.id("testingDropdown"));
			Thread.sleep(2000);
			Select sel = new Select(drp);
			List<WebElement> alloptions = sel.getOptions();
			for(WebElement option :alloptions)
			{
				if(option.getText().equals("Manual Testing"))
						{
					option.click();
					break;
						}
				
			WebElement elementtobedragged = driver.findElement(By.id("myImage"));
			WebElement elementtobedropped = driver.findElement(By.id("targetDiv"));
			
			Actions act = new Actions(driver);	
			act.dragAndDrop(elementtobedragged, elementtobedropped).perform();
			Thread.sleep(3000);
		
		}
	}
}
}
