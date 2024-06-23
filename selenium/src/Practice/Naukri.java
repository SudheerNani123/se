package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
WebDriver driver;
	
	
	
	void newregister() throws InterruptedException, AWTException
	{
		driver = new ChromeDriver();
		{
			
				driver.get("https://www.naukri.com/");
				Thread.sleep(3000);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Thread.sleep(3000);
			
				driver.findElement(By.xpath("//a[text()='Register']")).click();
				Thread.sleep(3000);
			 
			 	Scanner s = new Scanner(System.in);
				System.out.println("Full name:-");
				String FN = s.nextLine();
				driver.findElement(By.xpath("(//input[@class='formInput mandatory __input'])[1]")).sendKeys(FN);
				Thread.sleep(3000);
				
				Scanner s1 = new Scanner(System.in);
				System.out.println("Email ID");
				String Email = s1.nextLine();
				driver.findElement(By.xpath("//input[@placeholder='Tell us your Email ID']")).sendKeys(Email);
				Thread.sleep(3000);
				
				Scanner s2 = new Scanner(System.in);
				System.out.println("Password");
				String Password = s2.nextLine();
				driver.findElement(By.xpath("//input[@placeholder='(Minimum 6 characters)']")).sendKeys(Password);
				Thread.sleep(3000);
				
				Scanner s3 = new Scanner(System.in);
				System.out.println("Mobile number");
				String Mbl = s3.nextLine();
				driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys(Mbl);
				Thread.sleep(3000);
				
				 
				driver.findElement(By.xpath("//div[@class='focusable optionWrap  ']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
				Thread.sleep(3000);
					Robot r = new Robot();
					StringSelection str1 = new StringSelection("C:\\Users\\vasam\\Downloads\\sudheer cv.docx");
					Thread.sleep(3000);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1,null);

					r.keyPress(KeyEvent.VK_CONTROL);
					r.keyPress(KeyEvent.VK_V);
					Thread.sleep(3000);
					r.keyRelease(KeyEvent.VK_CONTROL);
					r.keyRelease(KeyEvent.VK_V);
					Thread.sleep(3000);
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);	
					Thread.sleep(3000);
					
				driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']")).click();
				Thread.sleep(3000);
					
				driver.findElement(By.xpath("//button[text()='Register now']")).click();
				Thread.sleep(3000);
					
				Scanner O = new Scanner(System.in);
				System.out.println("OTP:-");
				String OTP = O.nextLine();
				driver.findElement(By.xpath("//div[@class='otpContainer ']")).sendKeys(OTP);
				Thread.sleep(3000);
						
		}
	}
	
	void Login() throws InterruptedException, AWTException
	{
		driver = new ChromeDriver();
			
			driver.get("https://www.naukri.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("sudheernani157@gmail.com");
			Thread.sleep(3000);
			 
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("hisudheer@123");
			Thread.sleep(3000);	
			
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			Thread.sleep(3000);	
			
			driver.findElement(By.xpath("//a[text()='Complete profile']")).click();
			Thread.sleep(3000);	
			
			//Mobile Verify                
			driver.findElement(By.xpath("(//span[text()='Verify'])[2]")).click();
			Scanner tel = new Scanner(System.in);
			System.out.println("OTP = ");
			String OTP = tel.nextLine();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@class='mobileInput ']")).sendKeys(OTP);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Verify']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[text()='CrossLayer'])[13]']")).click();
			Thread.sleep(3000);

			//Email verify
			driver.findElement(By.xpath("(//span[text()='Verify'])[3]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Request verification email']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[text()='CrossLayer'])[11]']")).click();
			Thread.sleep(3000);
			
			//Basic Details
			driver.findElement(By.xpath("//a[text()='Add location']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//label[text()='Experienced']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='exp-years-droopeFor']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[text()=' 4 Years ']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='exp-months-droopeFor']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[text()=' 3 Months ']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//i[text()='DownArrow'])[3]")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//div[text()='₹'])[1]")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='totalAbsCtc_id']")).sendKeys("950000");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='salaryBreakDownDDFor']")).click();
			Thread.sleep(3000);
			
	        driver.findElement(By.xpath("//a[text()=' Fixed ']")).click();
	        Thread.sleep(2000);
			
			driver.findElement(By.xpath("//label[text()='India']")).click();
			Thread.sleep(3000);
			
	        driver.findElement(By.xpath("//input[@id='locationSugg']")).click();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//li[text()='Hyderabad']")).click();
	        Thread.sleep(3000);
	        

			driver.findElement(By.xpath("(//span[@class='chip-item '])[2]")).click();
			Thread.sleep(3000);
			
//			driver.findElement(By.xpath("//button[text()='Save']")).click();
//			Thread.sleep(3000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			js.executeScript("window.scroll(0,-500)");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@data-ga-track='spa-event|EditProfile|BasicDetails|Cancel']//span[@class='icon'][normalize-space()='CrossLayer']")).click();
			Thread.sleep(3000);
	}
	
	
	void Details() throws InterruptedException, AWTException
	{
		driver = new ChromeDriver();
			
			driver.get("https://www.naukri.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(3000);
	
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("sudheernani157@gmail.com");
			Thread.sleep(3000);
			 
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("hisudheer@123");
			Thread.sleep(3000);	
			
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			Thread.sleep(3000);	
			
			driver.findElement(By.xpath("//a[text()='Complete profile']")).click();
			Thread.sleep(3000);	
			
			//Profile photo upload
			driver.findElement(By.xpath("//span[@class='nk-user-img']")).click();
			Thread.sleep(3000);
			
			WebElement photo = driver.findElement(By.xpath("(//input[@id='fileUpload'])[1]"));
			photo.click();
			Thread.sleep(3000);
			
			Robot rr = new Robot();
			StringSelection str1 = new StringSelection("C:\\Users\\vasam\\Downloads\\pic.jpg");
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
			
			//upload resume
			driver.findElement(By.xpath("//span[text()='Upload resume']")).click();
			Thread.sleep(3000);
			
				Robot r = new Robot();
				StringSelection str2 = new StringSelection("C:\\Users\\vasam\\Downloads\\sudheer cv.docx");
				Thread.sleep(3000);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str2,null);

				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				Thread.sleep(3000);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_V);
				Thread.sleep(3000);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);	
				Thread.sleep(3000);
				
			
			// Resume Headline      
	        driver.findElement(By.xpath("(//span[text()='editOneTheme'])[1]")).click();
	        Thread.sleep(3000);
	        WebElement e = driver.findElement(By.xpath("//textarea[@id='resumeHeadlineTxt']"));
//	        e.click();
	        e.clear();
	        e.sendKeys("Web Automation Testing with Seleniun-Java(TestNG Framework,Cucumber)&API Testing.");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[text()='Save']")).click();
	        Thread.sleep(3000);
	        
	        
	        //Key Skills
	        driver.findElement(By.xpath("(//a[text()='Add'])[2]")).click();
	        Thread.sleep(3000);
	        WebElement sk = driver.findElement(By.xpath("//input[@id='keySkillSugg']"));
	        sk.clear();
	        sk.sendKeys("Java");
		        Robot r1 = new Robot();
		        r1.keyPress(KeyEvent.VK_DOWN);
				r1.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(3000);
				r1.keyRelease(KeyEvent.VK_DOWN);
				r1.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(3000);
				r1.keyPress(KeyEvent.VK_ENTER);
				r1.keyRelease(KeyEvent.VK_ENTER);	
				Thread.sleep(3000);
			
//	        driver.findElement(By.xpath("//button[@id='saveKeySkills']")).click();
//	        Thread.sleep(3000);
				
			
				//Add Employment
		        driver.findElement(By.xpath("(//a[text()='Add'])[1]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//label[text()='Yes']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//label[text()='Full-time']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//input[@id='exp-years-droopeFor']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//a[text()=' 4 Year ']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//input[@id='exp-months-droopeFor']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//a[text()=' 6 Months ']")).click();
		        Thread.sleep(3000);
		        JavascriptExecutor js1 = (JavascriptExecutor)driver;
		    	js1.executeScript("window.scrollBy(0,100)");
		        driver.findElement(By.xpath("//input[@id='companySugg']")).sendKeys("Neogen Softtech Solutions");
		        Thread.sleep(3000);
		        WebElement designation = driver.findElement(By.xpath("//input[@id='designationSugg']"));
		        designation.sendKeys("Test Engineer");
		        Thread.sleep(3000);
			        Robot d = new Robot();
			        d.keyPress(KeyEvent.VK_DOWN);
			        d.keyRelease(KeyEvent.VK_DOWN);
			        d.keyPress(KeyEvent.VK_DOWN);
			        d.keyRelease(KeyEvent.VK_DOWN);
			        d.keyPress(KeyEvent.VK_ENTER);
			        d.keyRelease(KeyEvent.VK_ENTER);
		        
		        driver.findElement(By.xpath("//div[@id='startedYear']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//a[text()=' 2020 ']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//input[@placeholder='Select Month']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//a[text()=' Nov ']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//input[@id='keySkillSugg']")).sendKeys("Java");
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//textarea[@id='jobDescription']")).sendKeys("Flexible with any working hours");
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//input[@id='noticePeriodFor']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//a[text()=' 15 Days or less ']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//button[@id='submitEmployment']")).click();
		        Thread.sleep(3000);
	        
			
		        //Education details
		        driver.findElement(By.xpath("(//a[text()='Add'])[3]")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='highEduFor']")).click();
		        Thread.sleep(3000);
	        
		        driver.findElement(By.xpath("//a[text()=' Graduation/Diploma ']")).click();
		        Thread.sleep(3000);
		        
		        
		        //Education details
		         driver.findElement(By.xpath("//span[text()='Add education']")).click();
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//input[@id='highEduFor']")).click();
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//a[text()=' Graduation/Diploma ']")).click();
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//input[@id='institute']")).sendKeys("Avanthi's Research & Tech Academy");
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//input[@id='crsFor']")).click();
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//a[text()=' B.Tech/B.E. ']")).click();
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//input[@id='specializationFor']")).click();
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//a[text()=' Civil ']")).click();
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//label[text()='Full time']")).click();
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//input[@id='yosFieldFor']")).click();
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//a[text()=' 2010 ']")).click();
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//input[@id='yopFieldFor']")).click();
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//a[text()=' 2014 ']")).click();
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//input[@id='gradeFieldFor']")).click();
		         Thread.sleep(3000);
		         
		         driver.findElement(By.xpath("//a[text=' Course Requires a Pass ']")).click();
		         Thread.sleep(3000);
		         
		        
		        //IT Skills
		        driver.findElement(By.xpath("(//a[text()='Add'])[4]")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='itSkillSugg']")).sendKeys("selenium");
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='version']")).sendKeys("4.18.1");
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='lastUsedDroopeFor']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//a[text()=' 2024 ']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='expYearDroopeFor']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//a[text()=' 4 Year ']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='expMonthDroopeFor']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//a[text()=' 2 Months ']")).click();
		        Thread.sleep(3000);
		        
		    //  driver.findElement(By.xpath("//button[@id='saveITSkills']")).click();
		    //  Thread.sleep(3000);
		        
		        
		        //Profile Summary    
		        driver.findElement(By.xpath("(//a[text()='Add'])[6]")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//textarea[@id='profileSummaryTxt']")).sendKeys("I have skills in Selinium Maven Project,WebDrivers,WebElements&Frame works(TestNG,Cucumber)");
		        Thread.sleep(3000);
		        
	//	        driver.findElement(By.xpath("//button[text()='Save']")).click();
	//	        Thread.sleep(3000);
		        
				
	
		        //Career Profile
		        driver.findElement(By.xpath("//span[text()='Career profile']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//a[text()='Add current industry']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//a[text()='Services & Consulting ']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='fareaDroopeFor'] ")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//a[text()='Engineering - Software & Q'] ")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='roleCategoryDroopeFor'] ")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//a[text()='Quality Assurance and Testing'] ")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='roleDroopeFor'] ")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//a[text()='Automation Test Engineer'] ")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//label[text()='Permanent']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//label[text()='Full time']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//label[text()='Flexible']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//a[text()='Add preferred work location']")).click();
		        Thread.sleep(3000);
		        
		        WebElement location = driver.findElement(By.xpath("//input[@id='locationSugg']"));
		        Thread.sleep(3000);
		        location.sendKeys("Hyderabad, Telangana");
			    Thread.sleep(3000);
			        Robot r2 = new Robot();
			        r2.keyPress(KeyEvent.VK_ENTER);
			        r2.keyRelease(KeyEvent.VK_ENTER);
		        
		        driver.findElement(By.xpath("//input[@class='currency-input ']")).sendKeys("850000");
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//button[@id='saveDesiredProfile']")).click();
				Thread.sleep(2000);
		        
				
				//Personal Details
		        driver.findElement(By.xpath("//span[text()='Personal details']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//label[text()='Male']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//label[text()='Single/unmarried']")).click();
		        Thread.sleep(3000);
		        
		        
		        WebElement date = driver.findElement(By.xpath("//input[@id='pd-dateFor']"));
		        date.click();
		        date.sendKeys("8");
		        date.sendKeys(Keys.ENTER);
		        Thread.sleep(3000);
		     
		        WebElement Month = driver.findElement(By.xpath("//input[@id='pd-monthFor']"));
		        Month.click();
		        Month.sendKeys("Jun");
		        Month.sendKeys(Keys.ENTER);
		        Thread.sleep(3000);
		        
		        WebElement Year = driver.findElement(By.xpath("//input[@id='pd-yearFor']"));
		        Year.click();
		        Year.sendKeys("1992");
		        Year.sendKeys(Keys.ENTER);
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//label[text()='General']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("(//label[text()='No'])[1]")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("(//label[text()='No'])[2]")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='pd-permanent-address']")).sendKeys("Near Banana Market");
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='pd-hometown']")).sendKeys("Ravulapalem");
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='pd-pincode']")).sendKeys("533238");
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//a[@id='add-new-language']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='pd-language-0']")).sendKeys("English");
		        Thread.sleep(3000);
		        
		        WebElement lan = driver.findElement(By.xpath("//input[@id='pd-proficiency-0For']"));
		        lan.click();
		        lan.sendKeys("Proficient");
		        lan.sendKeys(Keys.ENTER);
		        Thread.sleep(2000);
		       
		        driver.findElement(By.xpath("//label[text()='Read']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//label[text()='Write']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//label[text()='Speak']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//a[@id='add-new-language']")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//input[@id='pd-language-1']")).sendKeys("Telugu");
		        Thread.sleep(2000);
		        
		        WebElement lan1 = driver.findElement(By.xpath("//input[@id='pd-proficiency-1For']"));
		        lan1.click();
		        lan1.sendKeys("Expert");
		        lan1.sendKeys(Keys.ENTER);
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("(//label[text()='Read'])[2]")).click();
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("(//label[text()='Write'])[2]")).click();
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("(//label[text()='Speak'])[2]")).click();
		        Thread.sleep(2000);
		          
	//	        driver.findElement(By.xpath("//button[@id='savePersonalDetailsBtn']")).click();        
	        
}


	
		
		public static void main(String[] args) throws InterruptedException, AWTException {
			// TODO Auto-generated method stub
			Naukri obj = new Naukri();
			  obj.newregister();
			  obj.Login();
			  obj.Details();
	}
}
