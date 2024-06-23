package Practice;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {
	static {
		System.setProperty("webdiver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	Navigation nav = driver.navigate();
	driver.get("https://www.flipkart.com/");
	nav.back();
	nav.forward();
	nav.refresh();
	driver.close();
}
}
