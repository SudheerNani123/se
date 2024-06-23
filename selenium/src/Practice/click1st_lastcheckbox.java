package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
public class click1st_lastcheckbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

	
	    public static void main(String[] args) throws InterruptedException {

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	        
	        JavascriptExecutor js = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			js.executeScript("window.scroll(0,900)");
			Thread.sleep(3000);

	        // Find all checkboxes
	        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

	        // Click the first checkbox
	        checkboxes.get(0).click();

	        // Click the last checkbox
	        checkboxes.get(4).click();

	    }
	}


