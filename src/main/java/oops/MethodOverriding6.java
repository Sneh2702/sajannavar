package oops;

public class MethodOverriding6 extends MethodOverriding5 {
	
	static void m1() {
		System.out.println("B-M1");
	}

	 void m2() {
		System.out.println("B-M2");
	}
	
	  void m3(float f, int a) {
			System.out.println("B-M3, float and int parameter");
		}
	  
	  public static void main(String[] args) {
		MethodOverriding6 mo6=new MethodOverriding6();//child class object
		mo6.m1(); //B-M1
		mo6.m2(); //B-m2
		mo6.m3();//A-M3, No Parameter
		mo6.m3("bali"); //A-M3, String Parameter
		mo6.m3(41.2f, 10);//B-M3, float and int parameter
		
		MethodOverriding5 mo5=new MethodOverriding6(); //dynamic method dispatch
		mo5.m2();//B-m2
		mo5.m3("Rudra");//A-M3, String Parameter
		mo5.m1();//A-M1
		
	}
}
