package bottomOfPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BotomOfPage extends BaseClass {

	@Test(priority = 1)
	public void tops() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.linkText("Home")).click();

	}

	@Test(priority = 2)
	public void profile() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.linkText("Profile")).click();

	}

}
