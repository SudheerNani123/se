package Practice;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEnd_Test {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException, IOException {
	
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[text()='Projectors']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[text()='PLAY MP1-A Smart WIFI 3D 4k Full HD LED Recently Launch...']")).click();
	  Thread.sleep(2000);
	  
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
	  
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click(); //buynow
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("vasamsetti157@gmail.com"); 
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click(); //otp button
	  Thread.sleep(3000);
	  
	  Scanner ss = new Scanner(System.in);
	  System.out.println("Enter OTP");
	  String otp = ss.nextLine();
	  driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh _17N0em']")).sendKeys(otp); //otp
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//span[text()='Login']")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Deliver Here']")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
	  Thread.sleep(3000);

}
}
