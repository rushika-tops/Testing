package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginByDataprovider {
	WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://careercenter.tops-int.com/");
		
	}
	@Test
	public void login(String mono,String Pass) {
		WebElement mofield = driver.findElement(By.id("mobile"));
		mofield.sendKeys(mono);

		WebElement passfield =driver.findElement(By.id("password"));
		passfield.sendKeys(Pass);
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
		loginbtn.click();

	}

}
