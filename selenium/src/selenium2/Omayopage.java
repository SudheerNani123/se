package selenium2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Omayopage {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://omayo.blogspot.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		// drop down selection
			WebElement drop = driver.findElement(By.id("drop1"));
						
			Select dropdown = new Select(drop);
			dropdown.selectByIndex(2);
			
		// sending keys to text area
			driver.findElement(By.id("ta1")).sendKeys("Sudheer");
						
		// clearing text using clear()
			driver.findElement(By.id("textbox1")).clear();
		
		// handling radio button
			driver.findElement(By.id("radio1")).click();
			
		// Alert pop up using robot class
			driver.findElement(By.id("prompt")).click();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_N);
			r.keyRelease(KeyEvent.VK_N);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_N);
			r.keyRelease(KeyEvent.VK_N);
			r.keyPress(KeyEvent.VK_I);
			r.keyRelease(KeyEvent.VK_I);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
	  // clicking check box
				List <WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
				Thread.sleep(5000);
				int count = checkbox.size();
				for(int z=0;z<count;z++)
				{
					checkbox.get(z);
				}
				for(WebElement we :checkbox)
				{
					we.click();
				}
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,800)");
			
	   // double click
			WebElement doubleclick = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
			Actions act = new Actions(driver);
			act.doubleClick(doubleclick).perform();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
	   // file upload pop up
						
			JavascriptExecutor js1 = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			js1.executeScript("window.scroll(0,1500)");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//form[@action='demo_form.asp']")).click();
			Thread.sleep(3000);
			Robot r1 = new Robot();
			StringSelection str = new StringSelection("C:\\Users\\vasam\\Downloads\\123.jpg");
			Thread.sleep(3000);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);

			r1.keyPress(KeyEvent.VK_CONTROL);
			r1.keyPress(KeyEvent.VK_V);
			Thread.sleep(3000);
			r1.keyRelease(KeyEvent.VK_CONTROL);
			r1.keyRelease(KeyEvent.VK_V);
			Thread.sleep(3000);
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);		
			
			driver.quit();
		}
}
