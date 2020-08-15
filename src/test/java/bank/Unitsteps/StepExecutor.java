package bank.Unitsteps;

import bank.methods.SeleniumOperations;

public class StepExecutor 

{  public static void main(String[] args)   

{  //BrowserLaunch("webdriver.chrome.driver","C:\\AutomationProject\\pharma2\\src\\test\\resources\\DRIVERS\\chromedriver.exe");  
  //applicationOpen("http://primusbank.qedgetech.com/");  
  //Username("Admin");  
  //password("Admin");   
  //clickOnLogin();
	
	Object[] input=new Object[2];
	input[0]="Chrome";
	input[1]="C:\\\\AutomationProject\\\\pharma2\\\\src\\\\test\\\\resources\\\\DRIVERS\\\\chromedriver.exe";
	SeleniumOperations.BrowserLaunch(input);
	
	Object[] input1=new Object[1];
	input1[0]="http://primusbank.qedgetech.com/";
	SeleniumOperations.applicationLaunch(input1);
	
	Object[] input2=new Object[2];
	input2[0]="//*[@id='txtuId']";
	input2[1]="Admin";
	SeleniumOperations.SendKeys(input2);
	
	Object[] input3=new Object[2];
	input3[0]="//*[@id='txtPword']";
	input3[1]="Admin";
	SeleniumOperations.SendKeys(input3);
	
	
	Object[] input4=new Object[2];
	input4[0]="//*[@id='login']";
	SeleniumOperations.Click(input4);
	
	Object[] input5=new Object[2];
	input5[0]="//*[@src='images/Branches_but.jpg'] ";
	SeleniumOperations.Click(input5);
	
	Object[] input6=new Object[2];
	input6[0]="//*[@id='lst_countryS']";
	input6[1]="INDIA";
	SeleniumOperations.DropDown(input6);
	
	Object[] input7=new Object[2];
	input7[0]="//*[@id='lst_stateS']";
	input7[1]="MAHARASTRA";
	SeleniumOperations.DropDown(input7);
	
	Object[] input8=new Object[2];
	input8[0]="//*[@id='lst_cityS']";
	input8[1]="MUMBAI";
	SeleniumOperations.DropDown(input8);
	
	Object[] input9=new Object[2];
	input9[0]="//*[@id='btn_search']";
	SeleniumOperations.Click(input9);
	
	
	
	
	
  }  
}



