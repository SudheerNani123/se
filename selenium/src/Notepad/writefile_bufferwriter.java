package Notepad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writefile_bufferwriter {
	
	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("C:\\Users\\vasam\\eclipse-workspace\\Selinium\\notepad\\notepad_filebuffer.txt", true);
			BufferedWriter wr = new BufferedWriter(file);
			
			wr.write("welcome");
			wr.newLine();
			wr.write("thankyou");
			wr.close();
			
			System.out.println("file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
