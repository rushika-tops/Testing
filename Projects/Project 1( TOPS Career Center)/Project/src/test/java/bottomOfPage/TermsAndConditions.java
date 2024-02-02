package bottomOfPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TermsAndConditions extends BaseClass{
	@Test

	public void Terms() {
		
driver.get("https://careercenter.tops-int.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)" );
		driver.findElement(By.linkText("Terms and Conditions")).click();
		
		
		

}
