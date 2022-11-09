package paywheel;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	String path="./src/test/resources/bankdetailsmain.xlsx";
	String sheetname="Sheet1";
	
	public String getstringexceldate(int row ,int cell  ) {
		
		
       FileInputStream file;
	try {
		file = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(file);
        return  workbook.getSheet(sheetname).getRow(row).getCell(cell ).getStringCellValue(); 
	}
	catch (Exception e) {
		
		e.printStackTrace();
	}
	return null;
}
	@SuppressWarnings("null")
	public int getnumericlexceldate(int row ,int cell  ) {
	     FileInputStream file;
	 	try {
	 		file = new FileInputStream(path);
	 		Workbook workbook = WorkbookFactory.create(file);
	         return   (int) workbook.getSheet(sheetname).getRow(row).getCell(cell ).getNumericCellValue(); 
	 	}
	 	catch (Exception e) {
	 		
	 		e.printStackTrace();
	 	}
	 	return   (Integer) null;
	}
	
}