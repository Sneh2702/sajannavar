package interviewprograms;

public class ReverseStringUsingBuilder {
	
	public static void main(String[] args) {
		
		String str="Automation";
	//StringBuilder
		
		StringBuilder sb=new StringBuilder(str); 
		sb.reverse();
		
		System.out.println(sb);
	}

}
