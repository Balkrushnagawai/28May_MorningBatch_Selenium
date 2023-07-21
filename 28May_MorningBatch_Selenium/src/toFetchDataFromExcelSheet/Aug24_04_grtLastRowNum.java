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

public class Aug24_04_grtLastRowNum {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "E:\\28th May batch\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Sheet1");
		
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		
		Row row = sheet.getRow(0);
		
		int lastCellNum = row.getLastCellNum();
		System.out.println(lastCellNum);
		
		

		
	}

}
