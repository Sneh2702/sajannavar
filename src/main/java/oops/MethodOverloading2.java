package oops;

public class MethodOverloading2 extends MethodOverloading1 {
	
	public static void main(String[] args) {
		MethodOverloading2 mo2=new MethodOverloading2();
		mo2.sum(20,20); //40
		mo2.sum(10,5,-20); //-5
	}
	
	

}
