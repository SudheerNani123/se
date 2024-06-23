package Practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GorillsTest {
	WebDriver driver;
	
	public void launchAUT() throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		int i=1;
		while(i>0)
		{
			driver.get("https://www.google.com/search?q=instagram+web&oq=instag&gs_lcrp=EgZjaHJvbWUqEggBEAAYFBiDARiHAhixAxiABDIGCAAQRRg5MhIIARAAGBQYgwEYhwIYsQMYgAQyDQgCEAAYgwEYsQMYgAQyDQgDEAAYgwEYsQMYgAQyCggEEAAYsQMYgAQyDQgFEAAYgwEYsQMYgAQyCggGEAAYsQMYgAQyBggHEAUYQNIBCDk4NzFqMGo0qAIAsAIB&sourceid=chrome&ie=UTF-8");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.navigate().to("https://www.instagram.com/");
			Thread.sleep(3000);
			i--;
			
			driver.navigate().back();
			Thread.sleep(3000);
		}

	}
	
	void login() throws InterruptedException
	{
		int i=1;
		while(i>0)
		{
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Username");
		String Username = s.nextLine();
		driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d _ap35'])[1]")).sendKeys(Username);
		Thread.sleep(3000);
		
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter Password");
		String password = ss.nextLine();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(" //button[@class=' _acan _acap _acas _aj1- _ap30']")).click();		
		i--;
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		}
		
	}
	
	void loginbutton() throws InterruptedException
	{
		
		for(int i=2;i>0;)
		{
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d _ap35'])[1]")).sendKeys("sudheer");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nani@123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(" //button[@class=' _acan _acap _acas _aj1- _ap30']")).click();		
		i--;
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		}
		driver.close();	
	}
	public static void main(String[] args) throws InterruptedException {
		
		GorillsTest obj = new GorillsTest();
		obj.launchAUT();
		obj.login();
		obj.loginbutton();
	}

}
