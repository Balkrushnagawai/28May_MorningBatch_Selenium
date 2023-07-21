package toFetchDataFromExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Aug23_ExcelShitTask {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "E:\\28th May batch\\Excel Files\\Book 2.xlsx";
		FileInputStream file = new FileInputStream(path);
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
		System.out.println(value);
	}

}
