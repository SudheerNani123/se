package Notepad;

import java.io.FileWriter;
import java.io.IOException;



public class handlingnotepad {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("C:\\Users\\vasam\\eclipse-workspace\\Selinium\\notepad\\file.txt");
		
		file.write("hi hello world");
		file.write("\n");
		file.write("hi sudheer");
		
		file.close();
		System.out.println("file is created");
	}

}
