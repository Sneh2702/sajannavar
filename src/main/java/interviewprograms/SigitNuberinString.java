package interviewprograms;

public class SigitNuberinString {  //Digit number
	
	public static void main(String[] args) {
		
		String str="Baliraj12"; //retrieve 12
		
		char[] chars=str.toCharArray(); //Baliraj12
		
		StringBuilder sb=new StringBuilder();
		
		for(char c:chars) {
			
			if(Character.isDigit(c)) {
				sb.append(c);
			}
		}
		
		System.out.println(sb);
	}

}
