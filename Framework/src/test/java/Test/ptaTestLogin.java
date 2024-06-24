package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.ptaLoginPage;

public class ptaTestLogin {
	WebDriver driver;
	@BeforeTest
	   void Setup()
	{
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@BeforeClass
	   void launchURL()
	   {
		   driver.get("https://practicetestautomation.com/practice-test-login/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   }
		   
	@Test
	void loginTest()
	{
	ptaLoginPage jp = new ptaLoginPage(driver);
	jp.Setcredentials("student","Password123");
	jp.login();
	}
	
	}

