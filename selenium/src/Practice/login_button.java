package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_button {
	WebDriver driver;
	
	public void login() {
		driver = new ChromeDriver(); {
			driver.get("https://login.salesforce.com/?locale=in");
			driver.manage().window().maximize();
			String s = driver.getTitle();
			System.out.println(s);
			System.out.println(s.contains("Login"));
			
		}
	}
public static void main(String[] args) throws InterruptedException {
		
		login_button obj = new login_button();
		obj.login();
		
	}

}
