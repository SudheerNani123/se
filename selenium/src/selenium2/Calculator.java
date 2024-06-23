package selenium2;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calculator {
	
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
			public static void main(String[] args) throws InterruptedException, IOException, AWTException 
			{
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.calculator.net/date-calculator.html");
				Thread.sleep(3000);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
	//Approach_1
//				Select sel = new Select(today_Month_ID);
//				sel.selectByIndex(8);
//				
//				Select sel_1 = new Select(today_Day_ID);
//				sel_1.selectByIndex(06);
//				
//				Select sel_3 = new Select(ageat_Month_ID);
//				sel_3.selectByIndex(10);
//				
//				Select sel_4 = new Select(ageat_Day_ID);
//				sel_4.selectByIndex(22);	
//				
//				driver.findElement(By.xpath("//span[@class='cbmark']")).click();
//				driver.findElement(By.xpath("//input[@value='Calculate']")).click();
				
				
//				driver.findElement(By.linkText("Create new account"));
//				Thread.sleep(3000);
				WebElement day = driver.findElement(By.id("today_Month_ID"));
				selectoptionFromDropDown(day,"Aug");
				Thread.sleep(3000);
				WebElement month = driver.findElement(By.id("today_Day_ID"));
				selectoptionFromDropDown(month,"5");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='today_Year_ID']")).clear();
				driver.findElement(By.xpath("//input[@id='today_Year_ID']")).sendKeys("1992");
				Thread.sleep(3000);
				WebElement month1 = driver.findElement(By.id("ageat_Month_ID"));
				selectoptionFromDropDown(month1,"Jan");
				Thread.sleep(3000);
				WebElement day1 = driver.findElement(By.id("ageat_Day_ID"));
				selectoptionFromDropDown(day1,"8");
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

