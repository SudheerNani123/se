package Practice;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class salesforce {
WebDriver driver;
	
	
	
	void SFlogindata() throws InterruptedException
	{
		driver = new ChromeDriver();
		{
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-elf-v2/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		
		Scanner s = new Scanner(System.in);
		System.out.println("FirstName");
		String FN = s.nextLine();
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys(FN);
		Thread.sleep(3000);
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("LastName");
		String LN = s1.nextLine();
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys(LN);
		Thread.sleep(3000);
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("mail");
		String Email = s2.nextLine();
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys(Email);
		Thread.sleep(3000);
		
		WebElement JT = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		JT.click();
		Select sel = new Select(JT);
		sel.selectByVisibleText("Operations Manager");
		Thread.sleep(3000);
		
		Scanner s3 = new Scanner(System.in);
		System.out.println("Company");
		String Company = s3.nextLine();
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(Company);
		Thread.sleep(3000);
		
//		WebElement emp = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
//		emp.click();
//		Select sel1 = new Select(emp);
//		sel1.selectByVisibleText("201 - 500 employees");
//		Thread.sleep(3000);
		
		Scanner empo=new Scanner(System.in);
		System.out.println("select option number:-1)1 to 25 2)26 to 100 3)101 to 200 4)201 to 500 5)501 to 2000 6)2000+");
		System.out.println("please enter option number only");
		int option = empo.nextInt();
		switch(option) {
		case 1:
		{
			WebElement employee = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
			Select Sel = new Select(employee);
			Sel.selectByIndex(1);	
			break ;
			
		}
		case 2:
		{
			WebElement employee = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
			Select Sel = new Select(employee);
			Sel.selectByIndex(2);	
			break ;
		}
		case 3:
		{
			WebElement employee = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
			Select Sel = new Select(employee);
			Sel.selectByIndex(3);	
			break ;
	 
		}
		case 4:
		{
			WebElement employee = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
			Select Sel = new Select(employee);
			Sel.selectByIndex(4);	
			break ;
	 
		}
		case 5:
		{
			WebElement employee = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
			Select Sel = new Select(employee);
			Sel.selectByIndex(5);	
			break ;
	 
		}
		case 6:
		{
			WebElement employee = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
			Select Sel = new Select(employee);
			Sel.selectByIndex(6);	
			break ;
	 
		}
		default:
			System.out.println("the option which you enter is not avaliable in the dropdown");
	 
		}
		
		Scanner s4 = new Scanner(System.in);
		System.out.println("Phoneno");
		String PH = s3.nextLine();
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys(PH);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement Con = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Con.click();
		Select sel2 = new Select(Con);
		sel2.selectByVisibleText("Benin");
		Thread.sleep(3000);
		
		
		
		
		}
		driver.close();	
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		salesforce obj = new salesforce();
		obj.SFlogindata();
	}


}
