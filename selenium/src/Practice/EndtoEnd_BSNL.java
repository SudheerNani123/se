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
		//password
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("Sudheernani@12345");
		Thread.sleep(3000);
		//Confirm password
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("Sudheernani@12345");
		Thread.sleep(3000);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter CODE");
		String code = s.nextLine();
		Thread.sleep(3000);
		 
	  driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys(code);
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//button[@id='create-btn']")).click();
	  Thread.sleep(3000);
	  
	  Scanner o = new Scanner(System.in);
		System.out.println("Enter OTP");
		String otp = o.nextLine();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='otp']")).sendKeys(otp);
		  Thread.sleep(3000);
		
	  
	  driver.findElement(By.xpath("//button[@id='reset-btn']")).click();
	  Thread.sleep(3000);
	  
	  driver.close();
	  Thread.sleep(3000);
	  driver.switchTo().window(win1);
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//a[text()='My Account ']")).click();
		Thread.sleep(3000);
		
		Set<String> w =driver.getWindowHandles();
		Iterator<String> it1=w.iterator();
		String w1=it1.next();
		String w2=it1.next();
		driver.switchTo().window(w2);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=' Sign in']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("9494009183");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sudheernani@12345");
		Thread.sleep(3000);
		
		Scanner Ca = new Scanner(System.in);
		System.out.println("Enter Captcha CODE");
		String Captcha = Ca.nextLine();
		Thread.sleep(3000);
		 
	  driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys(Captcha);
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//button[@id='login-btn']")).click();
	  Thread.sleep(3000);
		
		
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		EndtoEnd_BSNL obj = new EndtoEnd_BSNL();
		  obj.Singin();
		  
	}
	

}
