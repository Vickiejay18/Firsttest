package Fileoperation;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	
	 public static void main(String[] args) throws Throwable {
			File f = new File("C:\\Users\\jaias\\Desktop\\Excel parctice.xlsx");
			
			FileInputStream f1 = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(f1);
			Sheet s = w.getSheet("Sheet1");
			for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
				
				Row row = s.getRow(i);
				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
					Cell cell = row.getCell(j);
					int cellType = cell.getCellType();
					
					if(cellType==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
					}
					else {
						if (DateUtil.isCellDateFormatted(cell)) {
							Date d = cell.getDateCellValue();
							SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
							String value = sd.format(d);
							System.out.println(value);
						}
						else {
							double d = cell.getNumericCellValue();
							long l = (long)d;
							System.out.println(l);
						}
						
					}
					
					
				}
				
			}
		}
		

}
