package bank.Unitsteps;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TemptJava implements TemptData
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\AutomationProject\\pharma2\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://primusbank.qedgetech.com/");
		
		driver.findElementByXPath("//*[@id='txtuId']").sendKeys(username);
		driver.findElementByXPath("//*[@id='txtPword']").sendKeys(password);
		driver.findElementByXPath("//*[@id='login']").click();
		driver.findElementByXPath("//*[@src='images/Branches_but.jpg']").click();
		
		Select sel=new Select(driver.findElementByXPath("//*[@id='lst_countryS']"));
		sel.selectByVisibleText(country);
		
		Select sel1=new Select(driver.findElementByXPath("//*[@id='lst_stateS']"));
		sel1.selectByVisibleText(state);
		
		Select sel2=new Select(driver.findElementByXPath("//*[@id='lst_cityS']"));
		sel2.selectByVisibleText(city);
		
		driver.findElementByXPath("//*[@id='btn_search']").click();
	}
	
}
