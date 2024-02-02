package bottomOfPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


public class JobTracker extends BaseClass {
	@Test

	public void jobs() {
		
driver.get("https://careercenter.tops-int.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)" );
		driver.findElement(By.linkText("Home")).click();
		
		
		

}
