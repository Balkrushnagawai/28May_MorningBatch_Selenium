package toFetchDataFromExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Aug23_FetchDataFromExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "E:\\28th May batch\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(value);
	}

}
