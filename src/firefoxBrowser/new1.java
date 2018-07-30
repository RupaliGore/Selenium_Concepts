package firefoxBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class new1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   FirefoxDriver driver= new FirefoxDriver();
   driver.get("http://www.echoecho.com/htmlforms10.htm");
   driver.manage().window().maximize();
   WebElement check = driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
   List<WebElement> check1 = check.findElements(By.tagName("input"));
   for(int i=0;i<check1.size();i++)
   {
	   System.out.println(check1.get(i).getAttribute("value")+ " " + check1.get(i).getAttribute("checked"));
	   
   }
	driver.close();
	}
	
}
