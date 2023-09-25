package DataController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Controller 
{
 static private FileInputStream fi=null;	
 static private FileOutputStream fo=null;	
 static private Workbook wb=null;
 static private Sheet sh=null;
 static private Row rw=null;
 static private Cell c=null;
  
   public Object[][] datacontroller(String filename,String sheetname) throws IOException
  {
	fi=new FileInputStream(".\\Resources\\TestData\\"+filename +".xlsx");   
	wb=new XSSFWorkbook(fi);
	sh=wb.getSheet( sheetname);
	System.out.println(sh.getLastRowNum()+1);
	System.out.println(sh.getRow(0).getLastCellNum());
    Object[][] obj=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
    
    
      for(int i=0;i<=sh.getLastRowNum()-1;i++)
    {
    	for(int j=0;j<=sh.getRow(0).getLastCellNum()-1;j++)
    	{
    		obj[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
    	}
    	
    	
    }
    return obj;
  }
	
	
	
}
