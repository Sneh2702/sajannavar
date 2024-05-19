package javapackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG4 {
	
	@Test
	public void h() {
		System.out.println("This is h test case method");
	}

	@Test
	public void z() {
		System.out.println("This is z test case method");
	}
	
	@BeforeMethod
	public void f() {
		System.out.println("f method will execute before each test case method");
	}
	
	@AfterMethod
	public void s() {
		System.out.println("s method will execute after each test case method");
	}

}
