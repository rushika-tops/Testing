package topsCareerCenter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Events {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://careercenter.tops-int.com/");
		WebElement mn = driver.findElement(By.id("mobile"));
		mn.sendKeys("9624384966");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("#Rushika#27");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
		login.click();
		WebElement events = driver.findElement(By.linkText("Events"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		events.click();
		WebElement branch = driver.findElement(By.id("studentLocation"));
		Select branches = new Select(branch);
		branches.selectByValue("2");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,900)");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//li[@class='page-item']//span[@dusk='nextPage']//i[@class='fa-solid fa-angle-right']")));
		System.out.println("clickable");

		driver.findElement(
				By.xpath("//li[@class='page-item']//span[@dusk='nextPage']//i[@class='fa-solid fa-angle-right']"))
				.click();

	}
}
