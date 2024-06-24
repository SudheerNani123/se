package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ptaLoginPage {
	WebDriver driver;
	
	@FindBy(id="username")
	private WebElement usernameTB;
	
	@FindBy(id="password")
	private WebElement passwordTB;
	
	@FindBy(id="submit")
	private WebElement loginbtn;
	
	public ptaLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
public void Setcredentials(String Enterusername,String Enterpassword)
{
	usernameTB.sendKeys(Enterusername);
	passwordTB.sendKeys(Enterpassword);
}
public void login()
{
	loginbtn.click();
}
}
