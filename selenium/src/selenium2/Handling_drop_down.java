package selenium2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_drop_down {
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
		driver.get("https://www.facebook.com/?");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.id("year"));
		Thread.sleep(3000);

//		Approch-01
//		Select sel = new Select(day);
//		sel.selectByIndex(13);
//		
//		Select sel1 = new Select(month);
//		sel1.selectByValue("11");
//		
//		Select sel2 = new Select(year);
//		sel2.selectByVisibleText("1929");
		
//		Approch-02
		Select sel11 = new Select(month);
		List<WebElement> alloptions = sel11.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Apr"))
			{
				option.click();
				break;
			}
		}
//		
		
}
}