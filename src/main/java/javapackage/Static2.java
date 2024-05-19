package javapackage;

public class Static2 {
	
	int rollNo;
	String name;
	static String branch;
	static int minBalance;
	
	//arameterized constructor
	Static2(int r, String n){
		rollNo=r;
		name=n;
		
	}
	
	public void getResult() {
		System.out.println(rollNo+" "+name+" "+branch);
	}

}
