package firefoxBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazongetlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement a3 = driver.findElement(By.id("nav-xshop"));
		List<WebElement> a4= a3.findElements(By.tagName("a"));
		System.out.println(a4.size());
		
		int i=0;
		while(i<a4.size())
		{
			System.out.println(a4.get(i).getText());
			a4.get(i).click();
			String add = driver.getCurrentUrl();
			System.out.println(add);
			driver.navigate().back();
			i++;
			a3 = driver.findElement(By.id("nav-xshop"));
		    a4= a3.findElements(By.tagName("a"));
			
		}
		driver.close();

	}

}
