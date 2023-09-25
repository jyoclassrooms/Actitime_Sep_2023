package DataController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Run {
    
	 static private FileInputStream fi=null;	
	 static private FileOutputStream fo=null;	
	 static private Workbook wb=null;
	 static private Sheet sh=null;
	 static private Row rw=null;
	 static private Cell c=null;
	public static void main(String[] args) throws IOException 
	{
		fi=new FileInputStream("./Resources/TestData/customer.xlsx");   
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet("customer");
		System.out.println(sh.getLastRowNum()+1);
		System.out.println(sh.getRow(0).getLastCellNum());

	}

}
