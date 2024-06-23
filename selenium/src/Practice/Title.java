package Practice;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Title {
	public void GT() throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Thread.sleep(3000);
		  driver.get("https://www.amazon.com/");
		  
		  String exp_title = "This is amazon";
		  String act_title = driver.getTitle();
		  
		  if(exp_title.equals(act_title))
		  {
			  System.out.println("both titles are same");
		  }
		  else
		  {
			  System.out.println("both titles are not same");
		  }
		  System.out.println(exp_title);
		  System.out.println(act_title);
	}
	public static void main(String[] args) throws InterruptedException {
		Title obj = new Title();
		obj.GT();
	}

}
