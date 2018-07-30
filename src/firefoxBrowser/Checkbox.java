package firefoxBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		WebElement a1 = driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table"));
		List<WebElement> a2= a1.findElements(By.tagName("input"));
		System.out.println(a2.size());
        for(int i=0;i<a2.size();i++)
        {
        	System.out.println(a2.get(i).getAttribute("value")+ " "+ a2.get(i).getAttribute("checked"));
        	
        }
	}

}
