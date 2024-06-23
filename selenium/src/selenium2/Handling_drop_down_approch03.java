package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_drop_down_approch03 {
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
		selectoptionFromDropDown(day,"5");
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		selectoptionFromDropDown(month,"Jun");
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.id("year"));
		selectoptionFromDropDown(year,"1992");
		Thread.sleep(3000);
	}
		public static void selectoptionFromDropDown(WebElement ele,String value)
		{
			Select drp = new Select(ele);
			List<WebElement> alloptions = drp.getOptions();
			for(WebElement option:alloptions)
			{
				if(option.getText().equals(value))
				{
					option.click();
					break;
				}
			}
			
		}
		
		
}

