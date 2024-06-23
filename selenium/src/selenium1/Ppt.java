package selenium1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ppt {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static <webElement> void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("input[@id='twotabsearchtextbox']")).sendKeys("moto");
	 	Thread.sleep(5000);		
List<WebElement> auto = driver.findElements(By.xpath("//div[@class='left-pane-results-container"));
		System.out.println(auto.size());
		for(WebElement options :auto) {
			System.out.println(options.getText());
		}
int s = auto.size();
	System.out.println(s);
	auto.get(4).click();
	
	}
}