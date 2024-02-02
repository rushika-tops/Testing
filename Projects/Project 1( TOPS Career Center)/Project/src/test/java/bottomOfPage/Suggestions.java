package bottomOfPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Suggestions extends BaseClass {
	@Test
public void suggestion() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,1000)" );
	driver.findElement(By.linkText("Suggestion")).click();
	
	
	
	
}
	

}
