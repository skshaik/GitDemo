package SeleniumBasicPractice;
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args)
	{
	
		
		ArrayList<String> names = new ArrayList<String>();
				names.add("MR.Shaik");
                names.add("Sha");
                names.add("Vali");
                names.add("Tarannum");
                names.add("Soha");
                names.add("Shayaan");
                names.add("Safa");
                
                int count = 0;
                for (int i=0; i<names.size();i++)
                {
                	String actual = names.get(i);
                	if(actual.startsWith("S"))
                	{
                		count++;
                	}
               
                }
               
                System.out.println(count);
	
	}
}
