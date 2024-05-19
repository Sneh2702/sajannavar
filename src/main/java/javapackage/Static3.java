package javapackage;

public class Static3 {
	
	public static void main(String[] args) {
		 
		Static2 st1=new Static2(1, "Ram"); 
		Static2 st2=new Static2(2, "Shiva");
		Static2 st3=new Static2(3, "Geeta");
		Static2 st4=new Static2(4, "Bali");
		
		Static2.branch="IT";
		Static2.minBalance=1000;
		
		st1.getResult();
		st2.getResult();
		st3.getResult();
		st4.getResult();
	}

}
