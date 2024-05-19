package oops;

public class MethodOverloading4 extends MethodOverloading3 {
	
	public static void main(String[] args) {
		
		MethodOverloading4 mo4=new MethodOverloading4();
		System.out.println(mo4.add(10, 10)); //20
		System.out.println(mo4.add(10, 10, 10));//0
	}
	
}
