package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import org.testng.annotations.Test;

import Base.baseclass;
import uttilites.ReadXLdata;

public class OrangeHrmTest extends baseclass 
{
	@Test(dataProviderClass = ReadXLdata.class,dataProvider = "bvtdata",priority = 0)
	public static void LoginTest(String username,String password) throws InterruptedException 
	{
		driver.findElement(By.xpath(loc.getProperty("username"))).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys(password);
		Thread.sleep(2000);             
		driver.findElement(By.xpath(loc.getProperty("login"))).click();
		
		boolean dashboard = driver.findElement(By.xpath(loc.getProperty("Dashboard"))).isDisplayed();
		Assert.assertTrue(dashboard,"Dashboard tab should be visible after login");
		System.out.println(dashboard);
		
	}
	
	
	@Test(priority = 1)
	public static void addEmployeeTest() throws InterruptedException
	{
		driver.findElement(By.xpath(loc.getProperty("Pim"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("add-employee"))).click();
		
		String firstname = "V";
		String lastname = "Sudheer";
		WebElement first1 = driver.findElement(By.xpath(loc.getProperty("emo-firstname")));
		Thread.sleep(2000);
		WebElement last1 = driver.findElement(By.xpath(loc.getProperty("emo-lastname")));
		first1.sendKeys(firstname);
		last1.sendKeys(lastname);

		driver.findElement(By.xpath(loc.getProperty("save-button"))).click();
		
		boolean PersonalDetails = driver.findElement(By.xpath(loc.getProperty("Personal-Details"))).isDisplayed();
		Assert.assertTrue(PersonalDetails,"PersonalDetailspage should be visible after adding Employe");
		System.out.println(PersonalDetails);
	}
	
	@Test(priority = 2)
	public static void selectdropdown() throws InterruptedException 
	{
//		Thread.sleep(1000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Thread.sleep(2000);
//		js.executeScript("window.scroll(0,200)");
		Thread.sleep(2000);
//		driver.findElement(By.xpath(loc.getProperty("Nationality-Dropdown"))).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(loc.getProperty("Nationality"))).click();
//		WebElement NationalityDropdown = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-up-fill oxd-select-text--arrow']"));
		driver.findElement(By.xpath(loc.getProperty("Nationality-Dropdown"))).sendKeys("Afghan");
		Thread.sleep(2000);
		
	} 
	
	
	
//	@Test(dataProvider = "Searchtestdata",priority = 2)
//	public static void EmployeelistsearchTest(String empname,String empid) throws InterruptedException
//	{
//		driver.findElement(By.xpath(loc.getProperty("Pim"))).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(loc.getProperty("emp-list"))).click();
//		Thread.sleep(2000);
//		
////		String Empname = "V Sudheer";
////		String Empid = "0438";
//		driver.findElement(By.xpath(loc.getProperty("emo-name"))).sendKeys(empname);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(loc.getProperty("emo-id"))).sendKeys(empid);
////		first1.sendKeys(Empname);
////		last1.sendKeys(Empid);
//		
//		driver.findElement(By.xpath(loc.getProperty("search-button"))).click();
//		
//		boolean Records = driver.findElement(By.xpath(loc.getProperty("RecordsFound"))).isDisplayed();
//		Assert.assertTrue(Records,"Records Found should be visible after Employee Information Search");
//		System.out.println(Records);
//	}
//	@DataProvider(name = "Searchtestdata")
//	public Object[][] searchData()
//	{
//		return new Object[][]
//				{
//			{"sud","0000"},
//			{"sdh","0412"},
//			{"123","1596"},
//			{"Sudheer",""}
//				};
//	}
}

