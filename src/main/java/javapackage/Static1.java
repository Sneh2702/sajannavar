package javapackage;

public class Static1 {
	int x=500;
	
	static int y=90;
	
	public static void main(String[] args) {
		
		//static int z=90;//local
		function2();
		System.out.println(y);
		Static1.function2();
		System.out.println();
		
		Static1 st1=new Static1();
		st1.function2();
		System.out.println(st1.y);
		st1.fun();
	}

	//static metthod
	public static void function2() {
		
		
	}
	
	//user defined method or non static method
	public void fun() {
		int i=100;
		
	}

	

}
