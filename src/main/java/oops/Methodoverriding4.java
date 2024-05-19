package oops;

import System.out.MethodOverrriding3;

public class Methodoverriding4 extends MethodOverriding3 {
	
	public void cook() {
		System.out.println("Sister is cooking");
		
	}
	public void angry() {
		System.out.println("Dad is angry");
	}
	
	public static void main(String[] args) {
		
		//parent ref=new Child();
		MethodOverriding3 mo3=new Methodoverriding4(); //dynamic method dispatch
		mo3.cook(); // Child class method will get execute
		mo3.eat(); //Parent class method will get execute
		
		//mo3.angry(); //It is not allowed in case of dynamic method dispatch
		
	 MethodOverriding3 parentref=new MethodOverriding3();
	 parentref.cook();
	}
}