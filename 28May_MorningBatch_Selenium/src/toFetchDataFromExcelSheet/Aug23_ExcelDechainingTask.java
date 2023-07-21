package toFetchDataFromExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Aug23_ExcelDechainingTask {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "E:\\28th May batch\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		
		Workbook opensheet = WorkbookFactory.create(file);
	    Sheet sheetname = opensheet.getSheet("Sheet1");
		Row row = sheetname.getRow(0);
		Cell cell = row.getCell(0);
		
		
		//String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		//String value1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

		for(int a=0; a<=5; a++) 
		{
			for(int b=0; b<1; b++)
			{
				System.out.print(row);
			}
		System.out.print(",");	
		System.out.println(cell);
		}
		/*for(int a=0; a<=0; a++)
			
		{
			System.out.println(row);
		}
		
		for(int i=0; i<=1; i++)
		{
			System.out.print(cell);
			/*for(int a=1; a<=1; a++)
			{
				System.out.println(cell);
			}*/
			
		}
	}


