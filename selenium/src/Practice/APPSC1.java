package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class APPSC1 {
WebDriver driver;
	
	
	
	void NEWDIRECTRECURT() throws InterruptedException, AWTException
	{
		driver = new ChromeDriver();
		{
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		
		 WebElement d = driver.findElement(By.xpath("//TEXTAREA[@CLASS='gLFyf']"));
		 d.sendKeys("appsc");
		 d.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//span[text()='APPSC'])[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//div[@class='sub-box'])[2]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//div[@class='sub-box'])[1]")).click();
		 Thread.sleep(3000);
		 
		 
		/*//BasicDetails
		 driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Baru santhikumari");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//input[@class='form-control CalendarCss'])[1]")).sendKeys("08/03/1994");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='rbtnGender_1']")).click();
		 Thread.sleep(3000);
		 
		 WebElement Dist = driver.findElement(By.xpath("//select[@id='ddlDistrict']"));
		 Dist.click();
		 Select sel = new Select(Dist);
		 sel.selectByVisibleText("Vizianagaram");
		 Thread.sleep(3000);
		 
		 WebElement M = driver.findElement(By.xpath("//select[@id='ddlMandal']"));
		 M.click();
		 Select sel1 = new Select(M);
		 sel1.selectByVisibleText("Bobbili");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtVillage']")).sendKeys("Bobbili");
		 Thread.sleep(3000);
		 
		 WebElement com = driver.findElement(By.xpath("//select[@id='ddlCommunity']"));
		 com.click();
		 Select sel2 = new Select(com);
		 sel2.selectByVisibleText("BC-A");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtFatherName']")).sendKeys("Baru Apparao");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtMotherName']")).sendKeys("B satyavathi");
		 Thread.sleep(3000);
		 
		 WebElement mt = driver.findElement(By.xpath("//select[@id='ddlMotherTongue']"));
		 mt.click();
		 Select sel11 = new Select(mt);
		 sel11.selectByVisibleText("Telugu");
		 Thread.sleep(3000);
		 
		 WebElement R = driver.findElement(By.xpath("//select[@id='ddlReligion']"));
		 R.click();
		 Select sel21 = new Select(R);
		 sel21.selectByVisibleText("Hindu");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtMarks1']")).sendKeys("A mole on the Right fore-arm");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtMarks2']")).sendKeys("A mole on the Right side of the fore head");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtEmailId']")).sendKeys("barusanthikumari@gmail.com");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtMobileNo']")).sendKeys("7680930818");
		 Thread.sleep(3000);
		 
		 
		 //OtherDetails
		 driver.findElement(By.xpath("(//div[@class='collapsible-header'])[2]")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='rbtnDisabled_1']")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='rbtnExServicePerson_1']")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='rbtnEmployee_1']")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='rbtnNCC_1']")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='rbtnEmployeed_1']")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='rbtnAreYouExEmployeeGovt_1']")).click();
		 Thread.sleep(3000);
		 
		 
		 //AddressDetails
		 driver.findElement(By.xpath("(//div[@class='collapsible-header'])[3]")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtFlatNo']")).sendKeys("D.no:-193/6");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtArea']")).sendKeys("TR colony,Bobbili");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtDistrict']")).sendKeys("Vizianagaram");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtState']")).sendKeys("Andhra Pradesh");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtPincode']")).sendKeys("535558");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='chkAddress']")).click();
		 Thread.sleep(7000);
		 
		 
		 //SchoolingDetails
		 driver.findElement(By.xpath("(//div[@class='collapsible-header'])[4]")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='rbtnStudy_0']")).click();
		 Thread.sleep(7000);
		 
		 //4th
		 WebElement fourth = driver.findElement(By.xpath("//select[@id='ddlFourthDistrict']"));
		 fourth.click();
		 Select sel01 = new Select(fourth);
		 sel01.selectByVisibleText("Vizianagaram");
		 Thread.sleep(3000);
		 
		 WebElement year = driver.findElement(By.xpath("//select[@id='ddl4thYearOfPassing']"));
		 year.click();
		 Select sel001 = new Select(year);
		 sel001.selectByVisibleText("2004");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtFourthSchoolName']")).sendKeys("Vijetha high school");
		 Thread.sleep(7000);
		 
		 //5th
		 WebElement fifth = driver.findElement(By.xpath("//select[@id='ddlFifthDistrict']"));
		 fifth.click();
		 Select sel02 = new Select(fifth);
		 sel02.selectByVisibleText("Vizianagaram");
		 Thread.sleep(3000);
		 
		 WebElement year1 = driver.findElement(By.xpath("//select[@id='ddl5thYearOfPassing']"));
		 year1.click();
		 Select sel002 = new Select(year1);
		 sel002.selectByVisibleText("2005");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtFifthSchoolName']")).sendKeys("Vijetha high school");
		 Thread.sleep(7000);
		 
		//6th
		 WebElement sixth = driver.findElement(By.xpath("//select[@id='ddlSixthDistrict']"));
		 sixth.click();
		 Select sel03 = new Select(sixth);
		 sel03.selectByVisibleText("Vizianagaram");
		 Thread.sleep(3000);
		 
		 WebElement year2 = driver.findElement(By.xpath("//select[@id='ddlsixthYearOfPassing']"));
		 year2.click();
		 Select sel003 = new Select(year2);
		 sel003.selectByVisibleText("2006");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtSixthSchoolName']")).sendKeys("Vijetha high school");
		 Thread.sleep(7000);
		 
		//7th
		 WebElement seventh = driver.findElement(By.xpath("//select[@id='ddlSeventhDistrict']"));
		 seventh.click();
		 Select sel04 = new Select(seventh);
		 sel04.selectByVisibleText("Vizianagaram");
		 Thread.sleep(3000);
		 
		 WebElement year3 = driver.findElement(By.xpath("//select[@id='ddlSeventhYearOfPassing']"));
		 year3.click();
		 Select sel004 = new Select(year3);
		 sel004.selectByVisibleText("2007");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtSeventhSchoolName']")).sendKeys("Vijetha high school");
		 Thread.sleep(7000);
		 
		//8th
		 WebElement eight = driver.findElement(By.xpath("//select[@id='ddlEigthDistrict']"));
		 eight.click();
		 Select sel05 = new Select(eight);
		 sel05.selectByVisibleText("Vizianagaram");
		 Thread.sleep(3000);
		 
		 WebElement year4 = driver.findElement(By.xpath("//select[@id='ddlEighthYearOfPassing']"));
		 year4.click();
		 Select sel005 = new Select(year4);
		 sel005.selectByVisibleText("2008");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtEigthSchoolName']")).sendKeys("Vijetha high school");
		 Thread.sleep(7000);
		 
		//9th
		 WebElement ninth = driver.findElement(By.xpath("//select[@id='ddlNinthDistrict']"));
		 ninth.click();
		 Select sel06 = new Select(ninth);
		 sel06.selectByVisibleText("Vizianagaram");
		 Thread.sleep(3000);
		 
		 WebElement year5 = driver.findElement(By.xpath("//select[@id='ddlNinethYearOfPassing']"));
		 year5.click();
		 Select sel006 = new Select(year5);
		 sel006.selectByVisibleText("2009");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtNinthSchoolName']")).sendKeys("Vijetha high school");
		 Thread.sleep(7000);
		 
		//10th
		 WebElement tenth = driver.findElement(By.xpath("//select[@id='ddlTenthDistrict']"));
		 tenth.click();
		 Select sel07 = new Select(tenth);
		 sel07.selectByVisibleText("Vizianagaram");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtBoard']")).sendKeys("SSC");
		 Thread.sleep(7000);
		 
		 driver.findElement(By.xpath("//input[@id='txtTenthSchoolName']")).sendKeys("Vijetha high school");
		 Thread.sleep(7000);
		 
		 driver.findElement(By.xpath("//input[@id='txtHallTicketNo']")).sendKeys("10523007");
		 Thread.sleep(7000);
		 
		 WebElement MM = driver.findElement(By.xpath("//select[@id='ddlMonth']"));
		 MM.click();
		 Select sel007 = new Select(MM);
		 sel007.selectByVisibleText("March");
		 Thread.sleep(3000);
		 
		 WebElement YY = driver.findElement(By.xpath("//select[@id='ddlYear']"));
		 YY.click();
		 Select selY = new Select(YY);
		 selY.selectByVisibleText("2010");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtTenthMarks']")).sendKeys("72%");
		 Thread.sleep(7000);*/
		 
		//Higher Edu Details
		 driver.findElement(By.xpath("(//div[@class='collapsible-header'])[5]")).click();
		 Thread.sleep(3000);
		 
		//Diploma
		 WebElement diploma = driver.findElement(By.xpath("//select[@id='ddlDiplomaDistrict']"));
		 diploma.click();
		 Select sel08 = new Select(diploma);
		 sel08.selectByVisibleText("Vizianagaram");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtDiplomaBoard']")).sendKeys("State Board of technical and training");
		 Thread.sleep(7000);
		 
		 WebElement Group = driver.findElement(By.xpath("//select[@name='ddlDiplomaBranch']"));
		 Group.click();
		 Select sel09 = new Select(Group);
		 sel09.selectByVisibleText("DIPLOMA IN ELECTRONICS");
		 
		 
		 WebElement MM1 = driver.findElement(By.xpath("//select[@id='ddlDiplomaMonth']"));
		 MM1.click();
		 Select sel008 = new Select(MM1);
		 sel008.selectByVisibleText("March");
		 Thread.sleep(3000);
		 
		 
		 WebElement YY1 = driver.findElement(By.xpath("//select[@id='ddlDiplomaYear']"));
		 YY1.click();
		 Select selYy = new Select(YY1);
		 selYy.selectByVisibleText("2013");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtDiplomaHallTicketNo']")).sendKeys("104A5717");
		 Thread.sleep(7000);
		 
		 driver.findElement(By.xpath("//input[@id='txtDiplomaCollegeName']")).sendKeys("Swamy vivekananda polytechnic college");
		 Thread.sleep(7000);
		 
		 driver.findElement(By.xpath("//input[@id='txtDiplomaMarks']")).sendKeys("72%");
		 Thread.sleep(7000);
		 
		 
		//B.Tech
		 WebElement B_Tech = driver.findElement(By.xpath("//select[@id='ddlGraduationDistrict']"));
		 B_Tech.click();
		 Select sel10 = new Select(B_Tech);
		 sel10.selectByVisibleText("Visakhapatnam");
		 Thread.sleep(3000);
		 
		 WebElement University = driver.findElement(By.xpath("//select[@id='ddlUniversity']"));
		 University.click();
		 Select sel12 = new Select(University);
		 sel12.selectByVisibleText("JNTU KAKINADA");
		 Thread.sleep(3000);
		 
		 WebElement Group1 = driver.findElement(By.xpath("//select[@id='ddlGraduationGroup']"));
		 Group1.click();
		 Select sel13 = new Select(Group1);
		 sel13.selectByVisibleText("B.E/B.Tech. Electronics and Communication Engineering ");
		 Thread.sleep(3000);
		 
		 WebElement MM2 = driver.findElement(By.xpath("//select[@id='ddlGraduationMonth']"));
		 MM2.click();
		 Select sel009 = new Select(MM2);
		 sel009.selectByVisibleText("April");
		 Thread.sleep(3000);
		 
		 WebElement YY2 = driver.findElement(By.xpath("//select[@id='ddlGraduationYear']"));
		 YY2.click();
		 Select selY1 = new Select(YY2);
		 selY1.selectByVisibleText("2017");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='txtGraduationHallTicketNo']")).sendKeys("14l35A0436");
		 Thread.sleep(7000);
		 
		 driver.findElement(By.xpath("//input[@id='txtGraduationCollegeName']")).sendKeys("VIIT");
		 Thread.sleep(7000);
		 
		
		 driver.findElement(By.xpath("//input[@id='txtGraduationMarks']")).sendKeys("60%");
		 Thread.sleep(7000);
		 
		 
		//Additional qualification Details
		 driver.findElement(By.xpath("(//div[@class='collapsible-header'])[6]")).click();
		 Thread.sleep(3000); 
		 
		 
		//Photo  Details
		 driver.findElement(By.xpath("(//div[@class='collapsible-header'])[7]")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//div[@id='flUploadPhoto_ctl01']")).click();
		 Thread.sleep(3000);
			Robot r = new Robot();
			StringSelection str = new StringSelection("C:\\Users\\Lenovo\\Pictures\\dharma\\Camera\\rps20210221_235936.jpg");
			Thread.sleep(3000);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);

			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			Thread.sleep(3000);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		// Sign Details	 
		driver.findElement(By.xpath("//div[@id='flUploadSignature_ctl01']")).click();
		Thread.sleep(3000);
		Robot rr = new Robot();
		StringSelection str1 = new StringSelection("C:\\Users\\Lenovo\\Pictures\\dharma\\Camera\\20210222_000554.jpg");
		Thread.sleep(3000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1,null);

		rr.keyPress(KeyEvent.VK_CONTROL);
		rr.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		rr.keyRelease(KeyEvent.VK_CONTROL);
		rr.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);	
		
		driver.findElement(By.xpath("//input[@id='chkAnyJob']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='chkAgree']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='btnPreview']")).click();
		Thread.sleep(3000);
		}
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		APPSC1 obj = new APPSC1();
	    obj.NEWDIRECTRECURT();	

}



}


