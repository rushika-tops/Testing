package topsCareerCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BootomOfPage  extends BaseClass{
	
	
	@Test(priority = 1)
	public void tops() {
	
driver.get("https://careercenter.tops-int.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)" );
		driver.findElement(By.linkText("Home")).click();
		
		
		
		
	}
	@Test(priority=2)
	public void profile() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1500)" );
		Thread.sleep(2000);
		driver.findElement(By.linkText("Profile")).click();
		
		
		
	}

}
