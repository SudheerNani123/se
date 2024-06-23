package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
	static {
		System.setProperty("webDriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
//	driver.get("https://www.google.com/");
		
	String strurl = driver.getCurrentUrl();
	driver.get("https://www.google.com/");
	System.out.println(strurl);
	
		driver.manage().window().maximize();
	}

}
