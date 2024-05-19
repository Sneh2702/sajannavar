package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG8 {
	@Test
	public void testcase1() {
		int a=30;
		int b=20;
		
		String actualTitle="Facebook";
		String expectedTitle="facebook";
		
		Assert.assertTrue(a<b);  //condition false >failed
		System.out.println("Assetion will get verify");
		System.out.println("Assertion checked");
		
		
		Assert.assertTrue(a<b,"Please check your condition, it should be True");  //condition false >failed the line will execute// hard Assert
		
		Assert.assertEquals(actualTitle, expectedTitle); //failed line number 20
		
		System.out.println("Assertion verify");
	}
	
	//testcase1() >failed
	//>scope of assert will be limted for perticular test case method, here for testcase1 only
	
	@Test
	public void testcase() {
		System.out.println("Hello TestNG");
	}

}
