package JavaPrograms;

public class StringImmutableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S9 = "Shaik";
		
	
		S9.concat("Shavali");
		System.out.println("Example for immutability - "+S9);
		
		S9 = S9.concat("Shavali");
		System.out.println("After assigning the value to the same String Variable - "+S9);
		
		
		String S10 = S9.concat("Shavali");
		System.out.println("After assigning the value to a new String Variable - "+S10);
		
		
		
	}

}
