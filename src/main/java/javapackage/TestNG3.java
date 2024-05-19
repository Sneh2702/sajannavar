package javapackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG3 {
	
	//STCM s(), G(), z(), a(), d()
	
	@BeforeClass
	public void z() {
		System.out.println("This is before clas annoation");
	}
	
	@BeforeMethod
	public void a() {
		System.out.println("This is before Method annoation");
	}
	
	@BeforeTest
	public void g() {
		System.out.println("This is before Test annoation");
	}
	
	@BeforeSuite
	public void s() {
		System.out.println("This is before suite annoation");
	}
	
	@Test
	public void d() {
		System.out.println("This is d test case method");
	}
	

}
