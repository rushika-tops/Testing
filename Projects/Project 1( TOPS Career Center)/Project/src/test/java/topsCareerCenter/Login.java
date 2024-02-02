package topsCareerCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	static WebDriver driver;

	@BeforeClass

	public void launchBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://careercenter.tops-int.com/");
	}

	@Test
	public void login() {
		WebElement mono = driver.findElement(By.id("mobile"));
		mono.sendKeys("9624384966");

		driver.findElement(By.id("password")).sendKeys("#Rushika#27");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
		login.click();

	}
}
