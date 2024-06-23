package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	static {
		System.setProperty("webDriver.chrome.driver","./driver.chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	}

}
