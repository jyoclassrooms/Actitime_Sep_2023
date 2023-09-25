package admin;

import java.io.IOException;

import org.testng.annotations.Test;

import DataController.Controller;
import appfunctions.Appfunctions;
import base.Webbase;
import dataprovider.DP;


public class Customer extends Webbase
{

	@Test(dataProvider ="createcustomer" ,dataProviderClass = dataprovider.DP.class)
	public void createcustomer(String customername,String customer_description) throws InterruptedException, IOException
	{
		Appfunctions app=new Appfunctions(get_driver());
		app.createcustomer(customername,customer_description);
		
		
	}
	
}
