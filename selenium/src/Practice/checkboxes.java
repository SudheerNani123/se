package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,900)");
		Thread.sleep(3000);
		List <WebElement> reversecheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(3000);

			int count=reversecheckbox.size();
			for(int z=reversecheckbox.size()-1;z>=0;z--)
			{
				WebElement checkbox = reversecheckbox.get(z);
				checkbox.click();
			}
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='exp-3']")).click();
			Thread.sleep(3000);
			
	}

}
