import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
		/* System.setProperty("webdriver.ie.driver","C:\\SeleniumBrowserSupport\\IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		driver2.get("http://gmail.com");
		driver2.close();	
		*/
	/* System.setProperty("webdriver.gecko.driver","C:\\SeleniumBrowserSupport\\geckodriver.exe");
		WebDriver driver3 = new FirefoxDriver();
		driver3.get("http://google.com");
		System.out.println(driver.getTitle());  */
		
		
		
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserSupport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		// driver.getTitle();	
		
		/*	System.setProperty("webdriver.edge.driver","C:\\SeleniumBrowserSupport\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		driver1.get("http://google.com");
		driver1.close(); */	
		
	
}
}