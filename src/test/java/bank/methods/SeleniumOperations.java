package bank.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 

{
	public static WebDriver driver=null;
	
	public static void BrowserLaunch(Object [] inputParameters)
	{
		String strBrowsername=(String) inputParameters[0];
		String webDriverExePath=(String) inputParameters[1];
		
		if(strBrowsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",webDriverExePath);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		else if(strBrowsername.equalsIgnoreCase("Firfox"))
		{
			System.setProperty("Webdriver.gecko.driver",webDriverExePath);
		    driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		
	}
	
	public static void applicationLaunch(Object[] inputParameters)
	{
		String strgURL=(String) inputParameters[0];
		
		driver.get(strgURL);
		
		
	}
	
	public static void SendKeys(Object[] inputParameters)
	{
		String xpath=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		
		WebElement obj1=driver.findElement(By.xpath(xpath));
		           obj1.clear();
		           obj1.sendKeys(value);
	}
	
	public static void Click(Object[] inputParameters)
	{
		String xpath=(String) inputParameters[0];
		WebElement obj1=driver.findElement(By.xpath(xpath));
		           obj1.click();
	}
	
	public static void DropDown(Object[] inputParameters)
	{
		String xpath=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		
		Select sel=new Select(driver.findElement(By.xpath(xpath)));
		sel.selectByVisibleText(value);				
	}
	
	
	
} 
















