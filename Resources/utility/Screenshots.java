package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots
{
	
  public void get_window_screenshot(WebDriver driver,String name) throws IOException
  {
	 TakesScreenshot sh=(TakesScreenshot)driver;
	 File src=sh.getScreenshotAs(OutputType.FILE);
	 Date d1=new Date();
	 String str=d1.toString();
	 str=str.substring(0,str.toString().indexOf("IST")-9).replaceAll(" ","_")+str.substring(str.toString().indexOf("IST")+4,str.length())+"_"+name;
	 File dest=new File("./screenshots/"+str+".png");
	 FileUtils.copyFile(src, dest);
  }
}
