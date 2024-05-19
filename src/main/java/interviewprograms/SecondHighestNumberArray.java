package interviewprograms;

import java.util.Arrays;



public class SecondHighestNumberArray {
	
	public static void main(String[] args) {
		
		int a[]= {10, 20, 30, 40, 50};
		System.out.println(SecondHighest(a,5));
		
	
	}
	
	public static int SecondHighest(int a[] , int total) {
		Arrays.sort(a);
		return a[total-2];
	}

	
}
