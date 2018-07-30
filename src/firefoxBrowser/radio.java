package firefoxBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  FirefoxDriver driver = new FirefoxDriver();
  driver.get("http://www.echoecho.com/htmlforms10.htm");
  driver.manage().window().maximize();
  WebElement r1 = driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
  List<WebElement> r2=r1.findElements(By.tagName("input"));
  System.out.println(r2.size());
  int i =0;
  while(i<r2.size())
  {
	  System.out.println(r2.get(i).getAttribute("value")+ " " + r2.get(i).getAttribute("checked"));
	  i++;
	  
	  
  }
		
		driver.close();
	}

}
