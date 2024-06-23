package Practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxGoogle {
	static {
		System.setProperty("webdriver.gecho.driver","./gechodriver.exe");
	}
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
			driver.close();
			}

}
