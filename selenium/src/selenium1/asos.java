package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class asos {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.asos.com/?");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@type='accountUnfilled']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Join']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sudheer@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("sudheer");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("v");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Haihello1890");
		Thread.sleep(3000);
		Select dropdown = new Select(driver.findElement(By.id("BirthDay")));
		dropdown.selectByValue("20");
		Thread.sleep(3000);
		Select dropdown1 = new Select(driver.findElement(By.id("BirthMonth")));
		dropdown1.selectByVisibleText("August");
		Thread.sleep(3000);
		Select dropdown2 = new Select(driver.findElement(By.id("BirthYear")));
		dropdown2.selectByValue("1993");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='tickbox-container subfield last-subfield  qa-gender-male']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='checkmark']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='register']")).click();
		Thread.sleep(4000);
		driver.close();
	}
}
