package interviewprograms;

public class ReverseString {
	
	public static void main(String[] args) {
	
	String str="Automation";  //noitamotuA
	String rvs="";
	char ch;
	
	System.out.println(str);
	
	for(int i=0;i<str.length();i++) {
		ch=str.charAt(i);
		rvs=ch +rvs;
		
	}
	
	System.out.println(rvs);
	
	}
}
