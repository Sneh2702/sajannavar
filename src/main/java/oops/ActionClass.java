package oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionClass implements ActionInterface1 {

	@Override
	public void CreateNewAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balanceCheck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void linkMobileNumber() {
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) {
		//AactionInterface1 ai=new ActionInterface1(); //can not create object of interface
		
		ActionInterface1 ai=new ActionClass(); //dynamic method disptch
		ai.balanceCheck();
		ai.CreateNewAccount();
		ai.linkMobileNumber();
		
		WebDriver driver=new ChromeDriver();
		
		WebDriver driver1=new FirefoxDriver();
		
	}
}
