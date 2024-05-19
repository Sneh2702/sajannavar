package samepackage;

public class Bjava {
	public static void main(String[] args) {
		
		A a=new A(); //create object of A class
		
		//System.out.println(a.a);//private
		System.out.println(a.b);// public
		System.out.println(a.c);//protected
		System.out.println(a.d);//default within same package only
		
		//a.enrollment(); //private
		a.makePayment();//public
		a.extensionPayment();//Protected
		a.rewritePayment();//default within same package only
	}

}
