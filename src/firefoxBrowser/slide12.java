package firefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class slide12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
	//	WebElement frm = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		WebElement slide = driver.findElement(By.id("slider"));
		
		int x = slide.getLocation().x;
		Actions act1 = new Actions(driver);
		act1.dragAndDropBy(slide,x,200).build().perform();
		
		driver.close();

	}
     
}
