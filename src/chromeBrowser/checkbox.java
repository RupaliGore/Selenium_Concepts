package chromeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		WebElement ele1 = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> ele2 = ele1.findElements(By.tagName("input"));
		System.out.println(ele2.size());
		int i=0;
		while(i<ele2.size())
		{
			System.out.println(ele2.get(i).getAttribute("value")+" "+ ele2.get(i).getAttribute("checked"));
			i++;
		}
        driver.close();
	}

}
