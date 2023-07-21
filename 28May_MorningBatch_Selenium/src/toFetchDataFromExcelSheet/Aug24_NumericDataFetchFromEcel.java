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

public class Aug24_NumericDataFetchFromEcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "E:\\28th May batch\\Excel Files\\Book 2.xlsx";
		FileInputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		Sheet sheetName = book.getSheet("Sheet1");
		Row rowName = sheetName.getRow(4);
		Cell cell = rowName.getCell(2);
		double value = cell.getNumericCellValue();
		
		System.out.println(value);
		
		
		
		
		
		
		
	}

}
