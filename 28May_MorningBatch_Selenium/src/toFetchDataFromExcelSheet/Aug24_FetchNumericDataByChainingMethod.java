package toFetchDataFromExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Aug24_FetchNumericDataByChainingMethod {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "E:\\28th May batch\\Excel Files\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		//How to Fetch Numeric Data From Excel Sheet
		double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(1).getNumericCellValue();
		System.out.println(value);
	}

}
