 package oops;

public class MethodOverriding5 {
	
	static void m1() {
		System.out.println("A-M1");
	}
	
	void m2 (){
		System.out.println("A-M2");
	}
	
	static void m3() {
		System.out.println("A-M1, No Parameter");
	}
	
	void m3(String S){
		System.out.println("A-M3, String Parameter");
	}

}
