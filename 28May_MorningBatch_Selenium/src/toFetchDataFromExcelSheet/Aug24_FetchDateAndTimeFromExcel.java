package toFetchDataFromExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Aug24_FetchDateAndTimeFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "E:\\28th May batch\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		//How to Fetch  Date From Excel Sheet
		Date value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(1).getDateCellValue();
		System.out.println(value);
	}

}
