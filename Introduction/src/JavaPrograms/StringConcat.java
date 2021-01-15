package JavaPrograms;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String S1, S2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		
		S1 = sc.nextLine();
		S2 = sc.nextLine();
	
		
	String S3 = S1.concat(" \n"+S2);
		System.out.println("After the Concatenation result is  "+S3);
			

		
	}

}
