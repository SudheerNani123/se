package selenium1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS_on_Particular_webElement {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.nike.com/in/");
		Thread.sleep(2000);
		WebElement web = driver.findElement(By.xpath("//a[text()='Shop']"));
		File src = web.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest = new File("C:\\Users\\vasam\\OneDrive\\Desktop\\bug screen shot\\page33.png");
		Thread.sleep(2000);
		FileUtils.copyFile(src, dest);
		Thread.sleep(2000);
		driver.close();
}
}