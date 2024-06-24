package uttilites;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {
	public static void mail(String[]args) throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\vasam\\eclipse-workspace\\Framework\\src\\test\\resources\\configfiles\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
	}

}
