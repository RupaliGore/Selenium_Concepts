package firefoxBrowser;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.glass.events.KeyEvent;

public class RobotConcept {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("3.13.0")).click();
		
		Robot rb =new Robot();
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		

	}

}
