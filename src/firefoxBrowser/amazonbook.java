package firefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class amazonbook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement book = driver.findElement(By.id("searchDropdownBox"));
		book.sendKeys("Books");
		WebElement drop1 =driver.findElement(By.id("twotabsearchtextbox"));
		drop1.sendKeys("Harry potter");
		driver.findElement(By.className("nav-input")).click();
		
		//driver.findElement(By.xpath(xpathExpression)));
		//driver.findElement(By.xpath("//*[@id="result_2"]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[1]/a"));
		driver.findElement(By.xpath(".//*[@id='result_2']/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[1]/a/h2")).click();
		
		
		Thread.sleep(5000);
		// driver.findElement(By.xpath(".//*[@id='p2dPopoverID-no-button']/span/input")).click();
		driver.findElement(By.className("a-modal-scroller")).click();

		// Actions action = new Actions(driver);
		// action.sendKeys(Keys.ESCAPE);
		
		 driver.findElement(By.id("add-to-cart-button")).click();		
		
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		driver.findElement(By.id("ap_email")).sendKeys("ni3.gore@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("nitingore");
		driver.findElement(By.id("signInSubmit")).click(); 
		
		
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
