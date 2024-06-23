package Practice;

import java.awt.AWTException;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEnd_meesho {
WebDriver driver;
	
	
	
	void newregister() throws InterruptedException, AWTException
	{
		driver = new ChromeDriver();
		{
			
				driver.get("https://www.meesho.com/");
				Thread.sleep(3000);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Thread.sleep(3000);
			
				driver.findElement(By.xpath("//span[text()='Profile']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
				Thread.sleep(3000);
				
			 
			 	Scanner s = new Scanner(System.in);
				System.out.println("Phone Number");
				String PN = s.nextLine();
				driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(PN);
				Thread.sleep(3000);
				
				driver.quit();
				Thread.sleep(3000);
						
		}
	}
	
	void Product() throws InterruptedException, AWTException
	{
		driver = new ChromeDriver();
			
			driver.get("https://www.meesho.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//p[text()='Trendy Alluring Women Backpacks']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
			Thread.sleep(3000);
			
			
	}

	
		
		public static void main(String[] args) throws InterruptedException, AWTException {
			// TODO Auto-generated method stub
			EndtoEnd_meesho obj = new EndtoEnd_meesho();
			 // obj.newregister();
			  obj.Product();
	}
}


