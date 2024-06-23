package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static <webElement> void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		Thread.sleep(3000);
		List <WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(3000);

			int count=checkbox.size();
			for(int z=0;z<count;z++)
			{
				checkbox.get(z);
			}
			for(WebElement we :checkbox)
			{
				we.click();
			}
	}
}
