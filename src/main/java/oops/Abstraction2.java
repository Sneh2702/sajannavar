package oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Abstraction2 extends Abstraction1 {

	@Override
	void CreateNewAccount() {
		// executable code
		
	}

	@Override
	void balanceCheck() {
		// executable code
		
	}

	@Override
	void linkMobileNumber() {
		// executable code	
	
	}
	
	public static void main(String[] args) {
		//Abstraction1 ab1=new Abstraction1(); we can not create object in interface
		
		Abstraction1 ab1=new Abstraction2();
		ab1.balanceCheck();
		ab1.CreateNewAccount();
		ab1.linkMobileNumber();
		
		WebDriver driver=new ChromeDriver();
		
		WebDriver driver1=new FirefoxDriver();
		
		
	} 
	

}
