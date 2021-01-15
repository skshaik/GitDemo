package JavaPrograms;

import java.util.Scanner;

public class StringMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String S = "";
		System.out.println(S.isEmpty()); // To check whether the string is empty
		System.out.println(S.isBlank()); // To check whether the string is empty
		
		String S1 = "Shaik ";
		System.out.println(S1.isEmpty()); // To check whether the string is empty
		System.out.println(S1.isBlank()); // To check whether the string is empty
		
		String S2 = "Shaik Sha Vali";
		String S3 = "ShaikShaVali";
				System.out.println(S2.length()); // To check the length of the string 
		System.out.println(S3.length()); // To check the length of the string
		
		String S4 = "ababababab";
		System.out.println(S4.replace("b","a")); // To check the length of the string 
		System.out.println(S4.replace("b","s")); // To check the length of the string 

		String S5 = "ABCDEFG"; 
		System.out.println(S5.substring(3));
		System.out.println(S5.substring(2,6));
		
		
		
		final StringBuffer SB6 = new StringBuffer("SHAIKSHAVALI");
		System.out.println(SB6.reverse());
		
		final StringBuffer SB5 = new StringBuffer("abcdefghij");
		SB5.insert(2,"Shaik");
		System.out.println("after appending "+SB5);
		System.out.println(SB5.delete(3,7));
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine().toLowerCase().trim();
		int abc = (sc.nextLine().toLowerCase().trim().length());
		System.out.println(abc);
		
		
		
		System.out.println("The Entered Name is "+name);
		
		
		
		
		
	
		
		
	}

}
