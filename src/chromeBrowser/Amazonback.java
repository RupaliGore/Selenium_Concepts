package chromeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement a1 = driver.findElement(By.id("nav-xshop"));
		List<WebElement> a2= a1.findElements(By.tagName("a"));
		System.out.print(a2.size());
		for(int i=0;i<a2.size();i++)
		{
			System.out.println(a2.get(i).getText());
			a2.get(i).click();
			String add = driver.getCurrentUrl();
			System.out.println(add);
			 a1 = driver.findElement(By.id("nav-xshop"));
			 a2= a1.findElements(By.tagName("a"));
		}
		

	}

}
