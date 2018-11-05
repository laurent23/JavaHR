package nexus;

import java.util.Scanner;
import java.io.File;

public class readFromFile {

	public static void main(String[] args) throws Exception {
		File myFile = new File("/Users/z800/42/aaa.txt");
		Scanner scan = new Scanner(myFile);
		while (scan.hasNext()){ try
		{
		
			for (int i = 1; ; i++)
			System.out.println(i+ " " + scan.nextLine());
		}
		catch(Exception e) {
		}
		scan.close();
		}
	}
}
