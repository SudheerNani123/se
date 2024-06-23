package Practice;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebpage {
WebDriver driver;
	
	
	
	void APPSCWEBPAGE() throws InterruptedException, AWTException
	{
		driver = new ChromeDriver();
		{
		driver.get("https://www.google.com/search?q=appsc&oq=appsc&gs_lcrp=EgZjaHJvbWUyEQgAEEUYORhDGLEDGIAEGIoFMgoIARAAGLEDGIAEMg8IAhAAGEMYsQMYgAQYigUyEggDEAAYQxiDARixAxiABBiKBTIKCAQQABixAxiABDIHCAUQABiABDIKCAYQABixAxiABDIGCAcQBRhA0gEJMTMwNTZqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='byrV5b'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h4[text()='APPSC Website']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h4[text()='Direct Recruitment OTPR']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h4[text()='Online Application Submission']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h4[text()='Download Hallticket']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		
		driver.quit();
		
		}
		
		
	}
	void APPSCHOMEPAGE() throws InterruptedException, AWTException
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=appsc&oq=appsc&gs_lcrp=EgZjaHJvbWUyEQgAEEUYORhDGLEDGIAEGIoFMgoIARAAGLEDGIAEMg8IAhAAGEMYsQMYgAQYigUyEggDEAAYQxiDARixAxiABBiKBTIKCAQQABixAxiABDIHCAUQABiABDIKCAYQABixAxiABDIGCAcQBRhA0gEJMTMwNTZqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class='l'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Home']")).click(); //1st module
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[normalize-space()='Organisation'])[1]")).click(); //2nd module
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='caret'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//a[@target='_blank'])[3]")).click();  //3rd module
		Thread.sleep(3000);
		
		Set<String> win =driver.getWindowHandles();
		Iterator<String> it=win.iterator();
		String win1=it.next();
		String win2=it.next();
		driver.switchTo().window(win2);
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(6000);
		driver.switchTo().window(win1);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class='caret'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Group-I Post Preferences Receipt']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[normalize-space()='Recover OTPR'])[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//span[@class='caret'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Fee Payment  User Manual']")).click();
		Thread.sleep(2000);
		Set<String> winn =driver.getWindowHandles();
		Iterator<String> its=winn.iterator();
		String winn1=its.next();
		String winn2=its.next();
		driver.switchTo().window(winn2);
		Thread.sleep(4000);
		driver.close();
		Thread.sleep(6000);
		driver.switchTo().window(winn1);
		
		driver.findElement(By.xpath("//a[text()='Tag OTPR ID']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		driver.quit();
		
		}
	
	void logindata() throws InterruptedException
	{
		driver = new ChromeDriver();
		
			driver.get("https://www.google.com/search?q=appsc&oq=appsc&gs_lcrp=EgZjaHJvbWUyEQgAEEUYORhDGLEDGIAEGIoFMgoIARAAGLEDGIAEMg8IAhAAGEMYsQMYgAQYigUyEggDEAAYQxiDARixAxiABBiKBTIKCAQQABixAxiABDIHCAUQABiABDIKCAYQABixAxiABDIGCAcQBRhA0gEJMTMwNTZqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(3000);
			
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		Scanner s = new Scanner(System.in);
		System.out.println("USER ID:-");
		String UI = s.nextLine();
		driver.findElement(By.xpath("(//input[@id='MainContent_txtOTPRID'])[1]")).sendKeys(UI);
		Thread.sleep(3000);
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("PASSWORD:-");
		String PW = s1.nextLine();
		driver.findElement(By.xpath("(//input[@id='MainContent_txtNewPassword'])[1]")).sendKeys(PW);
		Thread.sleep(3000);
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Captcha:-");
		String C = s2.nextLine();
		driver.findElement(By.xpath("(//input[@id='MainContent_txtCaptcha'])[1]")).sendKeys(C);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@id='MainContent_btnLogin'])[1]")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		}
	
	void Notification() throws InterruptedException
	{
		driver = new ChromeDriver();
		
			driver.get("https://www.google.com/search?q=appsc&oq=appsc&gs_lcrp=EgZjaHJvbWUyEQgAEEUYORhDGLEDGIAEGIoFMgoIARAAGLEDGIAEMg8IAhAAGEMYsQMYgAQYigUyEggDEAAYQxiDARixAxiABBiKBTIKCAQQABixAxiABDIHCAUQABiABDIKCAYQABixAxiABDIGCAcQBRhA0gEJMTMwNTZqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(3000);
			
		driver.findElement(By.xpath("(//a[text()='Notifications'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//u[text()='Recruitments']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='blinkNew'])[8]")).click();
		Thread.sleep(3000);
		Set<String> winn =driver.getWindowHandles();
		Iterator<String> its=winn.iterator();
		String winn1=its.next();
		String winn2=its.next();
		driver.switchTo().window(winn2);
		Thread.sleep(6000);
		driver.close();
		driver.switchTo().window(winn1);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//u[normalize-space()='Departmental'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(text(),'Notification')])[11]")).click();
		Thread.sleep(3000);
		Set<String> wind =driver.getWindowHandles();
		Iterator<String> its1=wind.iterator();
		String wind1=its1.next();
		String wind2=its1.next();
		driver.switchTo().window(wind2);
		Thread.sleep(6000);
		driver.close();
		driver.switchTo().window(wind1);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//u[text()='Half Yearly ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(text(),'Application & Information for Notification No. 06')])[1]")).click();
		Thread.sleep(3000);
		Set<String> wind11 =driver.getWindowHandles();
		Iterator<String> its11=wind11.iterator();
		String wind21=its11.next();
		String wind31=its11.next();
		driver.switchTo().window(wind31);
		Thread.sleep(6000);
		driver.close();
		driver.switchTo().window(wind21);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//u[text()='Rashtriya Indian Military College ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(text(),'Notification No. 01')])[1]")).click();
		Thread.sleep(3000);
		Set<String> wind101 =driver.getWindowHandles();
		Iterator<String> its101=wind101.iterator();
		String wind201=its101.next();
		String wind301=its101.next();
		driver.switchTo().window(wind301);
		Thread.sleep(6000);
		driver.close();
		driver.switchTo().window(wind201);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Recruitment Notifications']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Notification for the post of Assistant Environment')])[1]")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		StaticWebpage obj = new StaticWebpage();
	    obj.APPSCWEBPAGE();
		obj.APPSCHOMEPAGE();
		obj.logindata();
		obj.Notification();

}

}
