package javapackage;

import org.testng.annotations.Test;

public class testNG7 {
	
	@Test (priority = 1)
	public void signup() {
		System.out.println("This is sign up page");
	}

	@Test(dependsOnMethods = {"signup"})
	public void login() {
		System.out.println("This s login up page");
	}
}
