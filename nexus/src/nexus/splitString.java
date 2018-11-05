package nexus;

import java.util.Scanner;
import java.util.regex.Pattern;

public class splitString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//String s = in.nextLine();
		String s = "He is a very very good boy, isn't he?";
	      s = s.trim();
	        if (s.length()>400000){
	            return ;
	        }else if (s.length()==0){
	            System.out.println(0);
	            return ;
	        }else{   
	//	String[] parts = s.split(Pattern.quote(" |\\.!|\\.|\\,|\\?|\\_|\\'|\\@"));
	        	
	        	
		String[] out = s.split("[_@ !,?.']+");  
		
		System.out.println(out.length);
	        
		//for (String temp : out)
		//	System.out.println(out);
		
		for (int i=0; i<=out.length-1; i++) {
		if(!(out[i]== "\n")||out[i]== "" ||out[i]== null) {
			System.out.println(out[i]);}
		}

				in.close();
	}

}
}
