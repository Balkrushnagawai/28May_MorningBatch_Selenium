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

public class Aug23_ExcelDisChaining {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "E:\\28th May batch\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		
		
		//How to Fetch String Data From Excel Sheet
		
		Workbook click = WorkbookFactory.create(file);
		Sheet sheetName = click.getSheet("Sheet1");
		Row row = sheetName.getRow(1);
		Cell cell = row.getCell(1);
		System.out.println(cell);
		
	}

}
