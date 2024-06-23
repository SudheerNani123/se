package Practice;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndtoEnd_BSNL {
	WebDriver driver;
	
	void Singin() throws InterruptedException {
		driver = new ChromeDriver();
		
		driver.get("https://www.bsnl.co.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='My Account ']")).click();
		Thread.sleep(3000);
		
		Set<String> win =driver.getWindowHandles();
		Iterator<String> it=win.iterator();
		String win1=it.next();
		String win2=it.next();
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=' Sign up']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Sudheer");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Sudheernani157@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("9494009183");
		Thread.sleep(3000);
		
		
		WebElement C = driver.findElement(By.xpath("//select[@class='form-control']"));
		 C.click();
		 Select sel = new Select(C);
		 sel.selectByVisibleText("Andhra Pradesh");
		 Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("Sudheernani@1234");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("Sudheernani@1234");
		Thread.sleep(3000);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter CODE");
		String code = s.nextLine();
		Thread.sleep(3000);
		 
	  driver.findElement(By.xpath("//div[@class='input-group']")).sendKeys(code);
	  Thread.sleep(3000);
		
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		EndtoEnd_BSNL obj = new EndtoEnd_BSNL();
		  obj.Singin();
		  
	}
	

}
