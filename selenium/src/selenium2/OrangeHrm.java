package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
			public static void main(String[] args) throws InterruptedException 
			{
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).sendKeys("sudher");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']")).sendKeys("V");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
				Thread.sleep(2000);
				WebElement dd = driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']"));
				dd.click();
				
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("arguments[0].value='Azerbaijani'", dd);
				
}
}
