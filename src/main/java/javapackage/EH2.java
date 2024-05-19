package javapackage;

public class EH2 {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		try {
			a[10]=500;
			
		}catch (Exception e) {
			//System.out.println(e); //it will show one line of output
			
			e.printStackTrace();
		}
		
		System.out.println("Exception handle statement");
		}
	}


