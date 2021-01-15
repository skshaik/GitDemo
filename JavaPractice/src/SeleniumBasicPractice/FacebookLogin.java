package SeleniumBasicPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserSupport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.salesforce.com/in/form/sem/crm-demo_b/?d=70130000000t1oC&DCMP=KNC-Google&Brand=yes&ef_id=Cj0KCQiAk53-BRD0ARIsAJuNhpvMpyC12Np52sqfkMtTuoDV88U6o-Ft9nTkVKjq9_sapGf7eLdlor8aAmg_EALw_wcB:G:s&s_kwcid=AL!4720!3!175755181399!e!!g!!salesforce&gclid=Cj0KCQiAk53-BRD0ARIsAJuNhpvMpyC12Np52sqfkMtTuoDV88U6o-Ft9nTkVKjq9_sapGf7eLdlor8aAmg_EALw_wcB");
		
		//driver.findElement(By.id("email")).sendKeys("9606748786");
		
		// driver.findElement(By.xpath("//*[@name='UserFirstName']")).sendKeys("First Name Xpath model");        // x path exalmple
		// driver.findElement(By.xpath("//*[@name='UserLastName']")).sendKeys("Last Name - Xpath 2nd model");    // x path example 2
		
		// driver.findElement(By.cssSelector("input[name='UserFirstName']")).sendKeys("Css First Name");   // CSS exalmple
		// driver.findElement(By.cssSelector("input[name='UserLastName']")).sendKeys("Css Last name");  // CSS exalmple
		
		
		driver.findElement(By.cssSelector("input#UserFirstName")).sendKeys("Css 2nd method1");   // CSS exalmple
		driver.findElement(By.cssSelector("input#UserLastName")).sendKeys("Css2 Last name");   // CSS exalmple
		
		
		//driver.findElement(By.cssSelector("#u_0_b")).sendKeys("9606748786");
		
		//driver.findElement(By.cssSelector("#u_0_s")).sendKeys("shaikshavali.sk@gmail.com");
		//driver.findElement(By.cssSelector("#u_0_s")).clear();
		// driver.findElement(By.xpath("//*[@id='u_0_s']")).sendKeys("shaikmca@gmail.com");
		// driver.findElement(By.xpath("//*[@id='u_0_b']")).submit();
		driver.findElement(By.partialLinkText("https://te-in.facebook.com/campaign/landing.php?campaign")).click();
		
		//driver.findElement(By.name("pass")).sendKeys("Banana@123");
		// driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		//	driver.findElement(By.name("login")).submit();
		
		
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getTitle());
	
	}

}
