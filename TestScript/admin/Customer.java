package admin;

import java.io.IOException;

import org.testng.annotations.Test;

import appfunctions.Appfunctions;
import base.Webbase;


public class Customer extends Webbase
{

	@Test
	public void createcustomer() throws InterruptedException, IOException
	{
		Appfunctions app=new Appfunctions(get_driver());
		app.createcustomer();
		
		
	}
	
}
