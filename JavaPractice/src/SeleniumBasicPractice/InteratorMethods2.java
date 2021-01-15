package SeleniumBasicPractice;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteratorMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.setProperty("webdriver.chrome.driver","C:\\\\SeleniumBrowserSupport\\\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		
		ArrayList<Integer> Al = new ArrayList<Integer>();
		
		int i=0;
for( i=0;i<=10;i++)
{
	Al.add(i); 	
}
System.out.println(Al);

Iterator itr = Al.iterator();

while(itr.hasNext())
{
	Integer I = (Integer)itr.next();
	if(I%2==0)
		System.out.print(I);
		else 
		itr.remove();
}	
System.out.println();	 
System.out.println(Al);

	}
		
	
	}

