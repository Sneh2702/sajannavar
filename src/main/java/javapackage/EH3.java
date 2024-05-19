package javapackage;

public class EH3 {
 
	public static void main(String[] args) {
		try {
			int i =10/0;
					}
		catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block always executed");
		}
		System.out.println("Exception ");
	}
}
