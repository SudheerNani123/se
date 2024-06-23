package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("http://www.gmail.com/");
	}

}
