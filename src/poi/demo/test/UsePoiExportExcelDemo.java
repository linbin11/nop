package poi.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.DVConstraint;
import org.apache.poi.hssf.usermodel.HSSFDataValidation;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddressList;

public class UsePoiExportExcelDemo {

	public static void main(String[] args) {
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(new File("src/445.xls"));
			inputStream = new FileInputStream(new File("src/444.xls"));
			HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
			DVConstraint constraint = DVConstraint.createExplicitListConstraint(new String[]{"林斌","张子健","梁冠华","姗姗"}); 
			CellRangeAddressList addressList =  new CellRangeAddressList(1, 65535, 1, 1);
			HSSFDataValidation s = new HSSFDataValidation(addressList, constraint);
			
			//DVConstraint dateConstraint = DVConstraint.createCustomFormulaConstraint("yyyy-mm-dd");
			//CellRangeAddressList dateAddressList = new CellRangeAddressList(1, 65535, 2, 2);
			//HSSFDataValidation dateDataValidation = new HSSFDataValidation(dateAddressList, dateConstraint);
			HSSFSheet sheet = workbook.getSheetAt(0);
			sheet.addValidationData(s);
			//sheet.addValidationData(dateDataValidation);
			workbook.write(outputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (inputStream!=null) {
				try {
					inputStream.close();
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
