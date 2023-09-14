package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks 
{
    WebDriver driver;
	
	@FindBy(xpath ="//a[div[text()='Tasks']]")
	private WebElement task;
	@FindBy(linkText = "Projects & Customers")
	private WebElement project_customer;
	@FindBy(xpath = "//input[@value='Create New Customer']")
	private WebElement create_New_customer;
	@FindBy(name = "name")
	private WebElement name;
	@FindBy(name="description")
	private WebElement description;
	@FindBy(xpath ="//input[@value='Create Customer']" )
	private WebElement create_customer;
	public WebElement create_customer()
	{
		return create_customer;
	}
	public WebElement description()
	{
		return description;
	}
	
	public WebElement name()
	{
		return name;
	}
	
	
	public WebElement create_new_customer()
	{
		return create_New_customer;
	}
	
	
	public WebElement project_customer()
	{
		return project_customer;
	}
	
	
	public WebElement tasks()
	{
		return task;
	}
	
	public	Tasks(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
