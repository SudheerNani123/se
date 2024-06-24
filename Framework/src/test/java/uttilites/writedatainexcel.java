package uttilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedatainexcel {
	public void writeData(String name1) throws Exception {
		File file = new File("C:\\Users\\vasam\\eclipse-workspace\\Framework\\src\\test\\resources\\testdata\\writedatainexcel.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(2);
		if(row == null)
		{
			row = sheet.createRow(2);
		}
		XSSFCell cell = row.createCell(2);
		cell.setCellValue(name1);
		
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		
		fos.close();
		workbook.close();
		}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data:");
		String name = sc.nextLine();
		
		writedatainexcel write = new writedatainexcel();
		{
			write.writeData(name);
			System.out.println("Data written Successfully.");
		}
		
	}

}
