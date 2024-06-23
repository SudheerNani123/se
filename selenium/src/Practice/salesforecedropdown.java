package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class salesforecedropdown {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
					}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		WebElement emp = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		emp.click();
		Select sel = new Select(emp);
		sel.selectByVisibleText("21 - 200 employees");
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}


}
