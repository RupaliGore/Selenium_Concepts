package firefoxBrowser;

//import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi there");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.com");
		String title= driver.getTitle();
	driver.close();

     		
	
	}

}
