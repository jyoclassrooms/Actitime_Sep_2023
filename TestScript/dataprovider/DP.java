package dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import DataController.Controller;

public class DP 
{
   @DataProvider(name ="createcustomer")
    Object[][] createcustomer() throws IOException
    {
	   return new Controller().datacontroller("customer","createcustomer");
    }
   
   
	
	
}
