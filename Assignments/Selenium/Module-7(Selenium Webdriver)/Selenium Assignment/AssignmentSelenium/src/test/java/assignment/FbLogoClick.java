package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogoClick {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement createpg = driver.findElement(By.linkText("Create a Page"));
		createpg.click();
		WebElement logo = driver.findElement(By.xpath("//a[@title='Go to Facebook home']"));
		logo.click();
		driver.close();

		
	}

}
