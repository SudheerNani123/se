package selenium1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement elementToBeDragged = driver.findElement(By.id("myImage"));
		WebElement elementToBeDropped = driver.findElement(By.id("targetDiv"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(elementToBeDragged,elementToBeDropped).perform();
		
	}
}


