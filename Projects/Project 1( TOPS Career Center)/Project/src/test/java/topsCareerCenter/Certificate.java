package topsCareerCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Certificate {
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
	//WebElement certi = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
	//certi.click();
	WebElement certi = driver.findElement(By.id("courseJob"));
	Select sl = new Select(certi);
	sl.deselectByValue("295319");
	certi.click();
	Thread.sleep(2000);
	WebElement accounts= driver.findElement(By.linkText("Accounts"));
	Actions action = new Actions(driver);
	action.moveToElement(accounts).build().perform();
	
	
	 
     
}
}
