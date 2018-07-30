package firefoxBrowser;

import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Amazon1{
 
      public static void main(String[] args) throws InterruptedException {
            // TODO Auto-generated method stub
FirefoxDriver driver=new FirefoxDriver();
driver.get("http://www.amazon.com");
 
driver.manage().window().maximize();
 
WebElement drop=driver.findElement(By.id("searchDropdownBox"));
List<WebElement>drop1=drop.findElements(By.tagName("option"));
System.out.println(drop1.size());
int i=0;
while(i<drop1.size())
{
      System.out.println(drop1.get(i).getText());
      i++;
}
Thread.sleep(2000);
 
WebElement drop2=driver.findElement(By.id("searchDropdownBox"));
drop2.sendKeys("Books");
Thread.sleep(2000);
 
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
//System.out.println(text);
 
WebElement button=driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
button.click();
 
 
     
 
      }
 
}