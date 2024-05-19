package javapackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {

	//skip our test case method
	
	@Test
	public void a() {
		System.out.println("a test case method");
	}
	
	@Test
	public void z() {
		System.out.println("a test case method");
	}
	
	@Test (enabled = false)
	public void b() {
		System.out.println("a test case method");
	}
	
	@Test
	public void d() {
		throw new SkipException("We are skip our d test case method");
	}
}
