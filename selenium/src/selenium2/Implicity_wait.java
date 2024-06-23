package selenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicity_wait {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.xpath("//button[@id='populate-text']")).click();
		driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='enable-button']"))).click();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='checkbox']"))).click();
}
}