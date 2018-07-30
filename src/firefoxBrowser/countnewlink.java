package firefoxBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class countnewlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  FirefoxDriver driver =new FirefoxDriver();
  driver.get("https://www.flipkart.com");
  driver.manage().window().maximize();
  WebElement ele1 = driver.findElement(By.className("_114Zhd"));
  
  List<WebElement> ele2 = driver.findElements(By.className("Wbt_B2"));
  System.out.println(ele2);
  /*int i =0;
  do
  {
	System.out.println(ele2.get(i).getText());  
	i++;
 }while(i<ele2.size()); */
  
  driver.close();
  }
	}


