package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pages.Common;
import pages.Login;

public class Webbase 
{
	private WebDriver driver=null;
	
	public WebDriver get_driver()
	{
		return driver;
	}
	
	@BeforeMethod()
	@Parameters({"browser","url","username","password"})
	public void login(String browser,String url,String username,String password)
	{
		switch(browser)
		{
		 case "chrome":
			 driver=new ChromeDriver();
			 break;
		 case "edge":
			 driver=new EdgeDriver();
			 break;
		
		}
		
		driver.get(url);
		Login lgn=new Login(driver);
		lgn.username().sendKeys(username);
		lgn.password().sendKeys(password);
		lgn.login_button().click();
		
	}
	
	@AfterMethod
	public void logout()
	{
		Common com=new Common(driver);
		com.logout().click();
	}
	
	

}
