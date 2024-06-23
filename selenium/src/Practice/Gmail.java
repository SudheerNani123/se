package Practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
WebDriver driver;
	
	public void CorrectCreditials() throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		int i=2;
		while(i>0)
		{
		driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-620359587%3A1713418148177286&theme=mn&ddm=0");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("sudheerr568@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("hisudheerr@568");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		i--;
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		}

	}
	
	void WrongCreditial() throws InterruptedException
	{
		for(int i=2;i>0;)
		{
		driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-620359587%3A1713418148177286&theme=mn&ddm=0");
		Thread.sleep(3000);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Email_or_Phoneno");
		String Email_or_Phoneno = s.nextLine();
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys(Email_or_Phoneno);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter Password");
		String password = ss.nextLine();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		i--;
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		}
		driver.close();	
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Gmail obj = new Gmail();
		obj.CorrectCreditials();
		obj.WrongCreditial();
	}


}
