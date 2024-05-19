package javapackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG6 {
	
	@Test
	public void create() {
		System.out.println("Create new account");
	
	} 
	
	@Test
	public void enroll() {
		System.out.println("Enroll Payment");
	
	}
	
	@BeforeMethod
	public void setup(){
		System.out.println("Lunch app(hdfc..com, usename,passwaord and clickon login button)");
	}

	
	@AfterMethod
	public void logout() {
		System.out.println("logout web application");
	}
}
