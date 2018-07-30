package chromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.cfm?CFID=1233400&CFTOKEN=12704645&jsessionid=3e305c6c4eb1b18009006f36754849584276");
		
public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/Rupali/Rupali_Java/chromedriver_win32/chromedriver.exe" );
		
		driver.findElement(By.xpath("//a[@text='rithesh deshmukh']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contactid']")).click();
	}

}
