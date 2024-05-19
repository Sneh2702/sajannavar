package javapackage;

import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test(priority = 1)
	public void a(){
		
		System.out.println("a test case method");
	}

	@Test (priority = 2)
	public void z(){
		
		System.out.println("z test case method");
	}
	
	@Test (priority = 3)
	public void b(){
		
		System.out.println("b test case method");
	}
	
	@Test (priority = -4)
	public void c(){
		
		System.out.println("c test case method");
	}
	
	@Test (priority = -3)
	public void x(){
		
		System.out.println("x test case method");
	}
	
	@Test (priority = -1)
	public void u(){
		
		System.out.println("u test case method");
	}
}
