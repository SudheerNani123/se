package uttilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;


public class ReadXLdata {
	@DataProvider(name = "bvtdata")
	public String[][] getData(Method m) throws EncryptedDocumentException, IOException 
	{
		String excelSheetName = m.getName();
		File f = new File("C:\\Users\\vasam\\eclipse-workspace\\Framework\\src\\test\\resources\\testdata\\LoginCreditials.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheetname = wb.getSheet(excelSheetName);
		
		
		int totalRows = sheetname.getLastRowNum();
		System.out.println(totalRows);
		Row rowcells = sheetname.getRow(0);
		int totalcols = rowcells.getLastCellNum();
		System.out.println(totalcols);
		
		DataFormatter format = new DataFormatter();
		
		String[][] testData = new String[totalRows][totalcols];
		for(int i=1;i<=totalRows;i++) 
		{
			for(int j=0;j<totalcols;j++)
			{
				testData [i-1][j] = format.formatCellValue(sheetname.getRow(i).getCell(j));
				System.out.println(testData [i-1][j]);
			}
		}
		return testData;
		
	}

}
