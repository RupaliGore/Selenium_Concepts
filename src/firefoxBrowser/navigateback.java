package firefoxBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigateback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://www.newtours.demoaut.com/");
driver.manage().window().maximize();
WebElement a1= driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));

List<WebElement> a2 = a1.findElements(By.tagName("a"));
System.out.println(a2.size());

for(int i=0;i<a2.size();i++)
{
	System.out.println(a2.get(i).getText());
	a2.get(i).click();
	String add= driver.getCurrentUrl();
	System.out.println(add);
	
	driver.navigate().back();
   a1= driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
   a2 = a1.findElements(By.tagName("a"));   
	
}
  driver.close();
	}

}
