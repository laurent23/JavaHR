package nexus;

import java.lang.reflect.Array;
import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		String text = in.next();
		double a = text.length();
		Boolean h= true;
	//	System.out.println("a=" + a + " a/2= "+ a/2);
		
		for (int i=0; i < (text.length())/2; i++) {
			
		
		if (text.charAt(i) == text.charAt(text.length()-i-1) ) {
			h= true;
		}
			else {
				h= false;
				break;
			}
		
		
			}
		if (h ){
			 System.out.println("Yes");}
			else 
			{
				System.out.println("No");
		
		}
		
	}
}


		/*
		String inverse = "";
		//text.length;
		int j = 0;
		int k = 0;
		for ( j= text.length() ; j>=0; j--) {
			k++;
			text [j] = inverse[j];
			
			*/
		
	

