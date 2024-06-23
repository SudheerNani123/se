package selenium2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calculator1 {	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.calculator.net/date-calculator.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement Month = driver.findElement(By.id("today_Month_ID"));
			Thread.sleep(2000);
			WebElement Day = driver.findElement(By.id("today_Day_ID"));
			Thread.sleep(2000);
			WebElement Month1 = driver.findElement(By.id("ageat_Month_ID"));
			Thread.sleep(2000);
			WebElement Day1 = driver.findElement(By.id("ageat_Day_ID"));
			Thread.sleep(2000);
			WebElement Month2 = driver.findElement(By.id("today2_Month_ID"));
			Thread.sleep(2000);
			WebElement Day2 = driver.findElement(By.id("today2_Day_ID"));
			Thread.sleep(2000);
			WebElement d = driver.findElement(By.id("c2op"));
//Approach_1
			Select sel = new Select(Month);
			sel.selectByIndex(10);
			
			Select sel1 = new Select(Day);
			sel1.selectByIndex(0);
			
			Select sel2 = new Select(Month1);
			sel2.selectByIndex(2);
			
			Select sel3 = new Select(Day1);
			sel3.selectByIndex(22);
			
			Select sel4 = new Select(Month2);
			sel4.selectByIndex(3);
			
			Select sel5 = new Select(Day2);
			sel5.selectByIndex(5);
			
			Select sel6 = new Select(d);
			sel6.selectByIndex(1);
			
driver.findElement(By.id("today2_Year_ID")).click();
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			
			r.keyPress(KeyEvent.VK_1);
			r.keyRelease(KeyEvent.VK_1);
			
			r.keyPress(KeyEvent.VK_9);
			r.keyRelease(KeyEvent.VK_9);
			
			r.keyPress(KeyEvent.VK_9);
			r.keyRelease(KeyEvent.VK_9);
			
			r.keyPress(KeyEvent.VK_3);
			r.keyRelease(KeyEvent.VK_3);
}
}
