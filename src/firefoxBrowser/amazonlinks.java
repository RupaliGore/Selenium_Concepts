package firefoxBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver =new FirefoxDriver();
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();

WebElement drop = driver.findElement(By.id("searchDropdownBox"));
List<WebElement> drop1 = drop.findElements(By.tagName("option "));
System.out.println(drop1.size());
for(int i=0;i<drop1.size();i++)
{
	System.out.println(drop1.get(i).getText());
	
}
driver.close();


	}

}
