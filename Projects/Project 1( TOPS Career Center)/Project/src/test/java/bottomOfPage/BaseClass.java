package bottomOfPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
 public static WebDriver driver;
 
 
	 
 
 
 @BeforeTest
	public void login() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://careercenter.tops-int.com/");
	WebElement mn = driver.findElement(By.id("mobile"));
	mn.sendKeys("9624384966");

	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("#Rushika#27");
	WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
	login.click();
	
	}
 @AfterTest
 public void tearDown() {
	 driver.quit();
 }

}
