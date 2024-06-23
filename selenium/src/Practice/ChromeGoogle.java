package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeGoogle {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
					}
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

}
