package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static <webElement> void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("java");
	 	Thread.sleep(3000);		
List<WebElement> auto = driver.findElements(By.xpath("//ul[@jsname='bw4e9b'][1]/li"));
		System.out.println(auto.size());
		for(WebElement options :auto) {
			System.out.println(options.getText());
		}
int s = auto.size();
	System.out.println(s);
	auto.get(4).click();
	
	}
}
