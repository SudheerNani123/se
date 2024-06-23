package selenium1;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	static
	{
		System.setProperty("webdriver.msedge.driver","./driver/msedgedriver.exe");
	}
	public static void main(String[] args)
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.amazon.com/");
	}

}
