package Fileoperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite {
	   public static void main(String[] args) throws Throwable {
		
	File f = new File("C:\\Users\\jaias\\Desktop\\Excel parctice.xlsx");
	FileOutputStream f1 = new FileOutputStream(f);
	Workbook w = new XSSFWorkbook();  
	
	   }

}
