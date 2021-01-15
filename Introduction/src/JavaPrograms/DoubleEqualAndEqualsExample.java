package JavaPrograms;

public class DoubleEqualAndEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S1 = new String ("Shaik");  
		String S2 = new String ("Shaik"); 
		
		int a, b;
		a = 5;
		b = 5;
		

		System.out.println(a==b); // Returns true since both pointing to the same value
		
		
		System.out.println(S1==S2); // reference comparison
		System.out.println(S1.equals(S2)); // content comparison
				
		StringBuffer S3 = new StringBuffer ("Shaik");
		StringBuffer S4 = new StringBuffer ("Shaik"); 
		
		
		System.out.println("\n");
		System.out.println(S3==S4);   // reference comparison
		System.out.println(S3.equals(S4));  // reference comparison
				
	}

}
