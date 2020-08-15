package bank.Unitsteps;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;

public class PrxDropDownTesting {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationProject\\pharma2\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(Options);
		
		driver.get("https://prxcloud.com/prx/home#product/");
		driver.findElementByXPath("//*[@id=\'j_username\']").sendKeys("admin@prxcloud.com");
		driver.findElementByXPath("//*[@id='j_password']").sendKeys("12345");
		driver.findElementByXPath("//*[@type=\'submit\']").click();
		driver.findElementByXPath("//*[text()='Select Manufacture']").click();
		Thread.sleep(5000);
		
		System.out.println("\nForm Size : " + driver.findElementByXPath("//*[@id='product-form']") + "\n");
		System.out.println("Web Element Object : \n" + driver.findElementByXPath("//*[@class='select2-choice select2-default']").getAttribute("innerHTML") + "\n");

		System.out.println("\nTriggering Click Event.....!!\n");
		driver.findElementByXPath("//*[@class='select2-choice select2-default']").click();
		System.out.println("\nTriggered Click Event.....!!\n");
		
		// System.out.println(driver.findElementByXPath("//*[@id='product-form']").getAttribute("innerHTML"));
		System.out.println("\nForm Size : " + driver.findElementByXPath("//*[@id='product-form']") + "\n");
		// System.out.println(driver.findElementByXPath("//*[@id='select2-results-3']"));
	}

}
