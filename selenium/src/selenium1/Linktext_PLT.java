package selenium1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Linktext_PLT {
		static
		{
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}
		public static void main(String[] args) throws InterruptedException
		{
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.Google.com/");
			driver.findElement(By.linkText("తెలుగు")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("గోప్యత")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Google ఎందుకు డేటాని సేకరిస్తుంది")).click();
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("మీ సమాచారాన్ని షేర్ చేయడం")).click();
		}
	}
