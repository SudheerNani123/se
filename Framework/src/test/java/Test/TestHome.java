package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HomePage;

public class TestHome {
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
	   driver.get("https://www.google.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   }
@Test
	 void LogoTest() 
	 {
	 HomePage hpo = new HomePage(driver);
	 boolean actuallogo = hpo.isLogopresent();
	 Assert.assertTrue(actuallogo,"Logo test is success");
	 
   }
}
