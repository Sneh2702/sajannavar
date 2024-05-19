package oops;

public class Person1 {
	
	public String name;
	public int age;
	
	//default constructor
	Person1(){
		
		name="Baliraj";
		age= 35;
				
	}
	

	
	//Parameterize constructor
	Person1(String s, int i){
		
		name=s;
		age=i;
	}
	
	public void enroll() {
		System.out.println("Hello I'm " +name);
		System.out.println("My age is " +age);
	
		}
}
