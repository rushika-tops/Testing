package topsCareerCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MyCourses {
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
		WebElement mycourse = driver.findElement(By.linkText("Diploma In Software Testing And Automation"));
		Actions action = new Actions(driver);
		action.moveToElement(mycourse).build().perform();

		mycourse.click();
		WebElement  coursedetail = driver.findElement(By.linkText("Course Details"));
		coursedetail.click();
		WebElement attendance = driver.findElement(By.xpath("//button[@id='course-attendance-tab']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(attendance).build().perform();

		attendance.click();
		WebElement accounts = driver.findElement(By.xpath("//button[@id='course-accounts-tab']"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(accounts).build().perform();

		accounts.click();
		driver.quit();


	}
}
