package firefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1000);
		
		
		
        driver.findElement(By.name("firstName")).sendKeys("Ruhi");
	
		driver.findElement(By.name("lastName")).sendKeys("Gore");
		driver.findElement(By.name("phone")).sendKeys("6012333438");
		driver.findElement(By.id("userName")).sendKeys("Ruhigore28");
		driver.findElement(By.name("address1")).sendKeys("Phoenix");
		driver.findElement(By.name("address2")).sendKeys("Uhnion hills");
		driver.findElement(By.name("city")).sendKeys("phoenix");
		driver.findElement(By.name("state")).sendKeys("az");
		driver.findElement(By.name("postalCode")).sendKeys("85050");
		driver.findElement(By.name("country")).sendKeys("India");
		driver.findElement(By.name("email")).sendKeys("ruhigore28@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ni3gore");
		driver.findElement(By.name("confirmPassword")).sendKeys("ni3ore");
		driver.findElement(By.name("register")).click();
	    Thread.sleep(2000);
		driver.close();
		

	}

}
