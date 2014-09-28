 package poi.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class ReadExcekDateDemoTest {


	public static void main(String[] args) {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File("src/123.xls"));
			HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
			//int sheetcount = workbook.getNumberOfSheets();
			HSSFSheet sheet = workbook.getSheetAt(0);
			int rows = sheet.getLastRowNum();
			for (int i = 0; i <= rows; i++) {
				HSSFRow row = sheet.getRow(i);
				if (row==null) {
					continue;
				}
				int cj = row.getLastCellNum();
				System.out.print("打印第"+i+"行=");
				for (int j = 0; j <cj; j++) {
					HSSFCell cell = row.getCell(j);
					if (cell==null) {
						continue;
					}
					System.out.print("打印第"+j+"列");
					if (cell.getCellType()==Cell.CELL_TYPE_NUMERIC&&HSSFDateUtil.isCellDateFormatted(cell)) {  
				        double d = cell.getNumericCellValue();   
				        Date date = HSSFDateUtil.getJavaDate(d);
				        SimpleDateFormat spm = new SimpleDateFormat("yyyy-MM-dd");
				        System.out.print(spm.format(date));
				    }else{
				    	cell.setCellType(Cell.CELL_TYPE_STRING);
				    	System.out.print(cell.getStringCellValue());
				    }
					
					System.out.print(",");
				}
				System.out.print("\n");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (inputStream!=null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
}
