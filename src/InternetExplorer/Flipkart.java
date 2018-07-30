package InternetExplorer;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Flipkart {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String title =driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
