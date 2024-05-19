package interviewprograms;

public class PalindromChar {
	
	//String str="madam"; //reverse also same madam so called palindro 
	
	public static boolean isPalinndrom(String str) { //madam
	
		StringBuilder sb=new StringBuilder(str);
				sb.reverse();
				String rev=sb.toString();//madam
				
				if(str.equals(rev)) {
					return true;
				}else {
						return false;
					
				}
		
	}

	public static void main(String[] args) {
		System.out.println(isPalinndrom("Madam"));
	}
	
}
