package JavaPrograms;

import sun.security.util.Length;

public class ArraysExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int x[] = new int[3];
		System.out.println(x);
		System.out.println(x[0]);
		

		int y[][] = new int[2][];
		System.out.println(y);
		System.out.println(y[0]);
		// System.out.println(y[0][0]);
		
		// System.out.println(x.getClass().getName());
	
		*/
		
		int[] x = {10,20,30,40,50};
		for(int i=0; i<5;i++)
		{
			System.out.println(x[i]);
		}
		
		char[] ch = {'a','e','i','o','u'};
		
	
		for(int j=0; j<5;j++)
		{
			System.out.println(ch[j]);
		}
		
		
		String[] s = {"Shaik","Sha","Vali"};
		
		for(int k=0; k<3;k++)
		{
			System.out.println(s[k]);
		}
		
		System.out.println(s[0].length());
		
		
		
		
		
		
		
	}

}
