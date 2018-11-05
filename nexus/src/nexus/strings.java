package nexus;

import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				String A = in.next();
				String B = in.next();
			
		int C = A.length() + B.length();
		System.out.println(C);

		//if (  D = Integer.parseInt(B, A.compareTo(B))) System.out.println("Yes");
		// else System.out.println("No");
		if (A.compareTo(B) < 0 ) System.out.println("Yes");
		if (A.compareTo(B) > 0 ) System.out.println("No");
	//System.out.println(	A.compareTo(B));
	//System.out.println(A.substring.toUpperCase(A));
	System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1) );
	}
  
}
