package firefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		String a= "html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[";
		String b= "]/td[1]";
		for(int i=0;i<36;i++)
		{
			String c = driver.findElement(By.xpath(a+i+b)).getText();
			System.out.println(c);
		}
		
		
		
		
		
	}

}
