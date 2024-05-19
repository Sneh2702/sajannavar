package interviewprograms;

public class DuplicatecharaInString {

	
	public static void main(String[] args) {
		
		String str="automation"; //at
		
		char [] carry=str.toCharArray();
		
		for (int i=0; i<str.length();i++) {  //i=0  A,  i=1 >u  //I value place every character from word
		
		
		for (int j=i+1;j<str.length();j++) { //j=1  >u, j=2 >t, j=3 >o, j=4 .m , j=5 >5
			
			if(carry[i]==carry[j]) {  //A ==a
				System.out.println(carry[j]+" ");
				break;
			}
		}
		}
				
	}
}
