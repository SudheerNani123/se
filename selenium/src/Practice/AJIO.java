package Practice;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class AJIO {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException, IOException {
	
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  
	  driver.get("https://www.ajio.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[@id='loginAjio']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@class='username remove-phonenumber-flownumberfield']")).sendKeys("9494009183");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@class='login-btn']")).click();
	  Thread.sleep(3000);
	  
	  Scanner ss = new Scanner(System.in);
		System.out.println("Enter OTP");
		String otp = ss.nextLine();
		
	  driver.findElement(By.xpath("//input[@class='login-form-inputs']")).sendKeys(otp);
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//input[@class='login-form-inputs login-btn']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[text()='MEN']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//div[@class='img-animate'])[117]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//strong[text()='THE BEAR HOUSE']")).click();
	  Thread.sleep(3000);
	  
	    Set<String> win =driver.getWindowHandles();
		Iterator<String> it=win.iterator();
		String win1=it.next();
		String win2=it.next();
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		
	    JavascriptExecutor js1 = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js1.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='XL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		Thread.sleep(3000);
		  
		driver.close();
		Thread.sleep(3000);
		
		driver.switchTo().window(win1);
		Thread.sleep(3000);
		 
		 JavascriptExecutor js3 = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			js3.executeScript("window.scrollBy(0,1500)");
			Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//strong[text()='Marks & Spencer'])[5]")).click();
		  Thread.sleep(3000);
		  
		    Set<String> wind =driver.getWindowHandles();
			Iterator<String> it1=wind.iterator();
			String win3=it1.next();
			String win4=it1.next();
			driver.switchTo().window(win4);
			Thread.sleep(2000);
			
		    JavascriptExecutor js2 = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			js2.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[text()='L']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
			Thread.sleep(3000);
			  
			driver.close();
			Thread.sleep(3000);
			
			driver.switchTo().window(win3);
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@class='ic-cart ']")).click();
			Thread.sleep(3000);
			
			JavascriptExecutor js4 = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			js4.executeScript("window.scrollBy(0,100)");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@type='radio']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[text()='Proceed to shipping']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@class='payment-btn ']")).click();
			Thread.sleep(3000);
			
			driver.quit();
			Thread.sleep(3000);

}
}