package chromeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.drive","c:chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
driver.get("http://www.newtours.demoaut.com/");
driver.manage().window().maximize();
WebElement a1= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
List<WebElement> a2=driver.findElements(By.tagName("a"));
System.out.println(a2.size());
for(int i=0;i<a2.size();i++)
{
	System.out.println(a2.get(i).getText());
	a2.get(i).click();
	String a = driver.getCurrentUrl();
	System.out.println(a);
	driver.navigate().back();
	 a1= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
	 a2=driver.findElements(By.tagName("a"));

	
}
driver.close();


	}
}