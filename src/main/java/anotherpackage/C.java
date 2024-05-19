package anotherpackage;

import samepackage.A;

public class C extends A {
	
	public static void main(String[] args) {
		
	A a=new A(); //create object of A class
		
		//System.out.println(a.a);//private
		System.out.println(a.b);// public
		//System.out.println(a.c);//protected
		//System.out.println(a.d);//default
		
		
		//a.enrollment(); //private
		a.makePayment();//public
		//a.extensionPayment();// protected
		//a.rewritemethod();// it will reflect only same package
		
		//ceate object of child class>class C
		
	C c=new C(); //create object of C class
		
		//System.out.println(c.a);//private
		System.out.println(c.b);// public
		System.out.println(c.c);//protected
		//System.out.println(c.d);
		
		
		//c.enrollment(); //private
		c.makePayment();//public
		c.extensionPayment();// protected
		//c.rewritemethod();// it will reflect only same package
		
	}
}
