package topsCareerCenter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reminders {
	public static void main(String[] args) throws InterruptedException {
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
		WebElement first  = driver.findElement(By.linkText("Please note that your assignment submissions are due."));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		first.click();
	
		
		Thread.sleep(2000);
		driver.navigate().back();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


		Thread.sleep(2000);
		WebElement second = driver.findElement(By.linkText("Please note you have pending assessments."));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		second.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
Thread.sleep(2000);
		driver.navigate().back();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
Thread.sleep(2000);
		WebElement third = driver.findElement(By.linkText("Please note that your project work for your course is pending."));
		
		third.click();


		
	

}
}
