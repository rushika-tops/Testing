package topsCareerCenter;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePassword {
	public static void main(String [] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
			driver.get("https://careercenter.tops-int.com/");
			//driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.NANOSECONDS);
		
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			WebElement mn= driver.findElement(By.id("mobile"));
		mn.sendKeys("9624384966");
			

			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("#Rushika#27");
			WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
			login.click();
			WebElement pro = driver.findElement(By.id("profileDropdown"));
			pro.click();
			WebElement pd = driver.findElement(By.linkText("Change Password"));
			pd.click();
			WebElement currentpass = driver.findElement(By.id("current_password"));
			currentpass.sendKeys("#Rushika#27");
			WebElement newpass = driver.findElement(By.id("new_password"));
			newpass.sendKeys("#rushika#27");
			
			
			WebElement confirmpass  = driver.findElement(By.id("confirm_password"));
			confirmpass.sendKeys("#rushika#27");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement submitbtn = driver.findElement(By.id("changePasswordSubmit"));
			submitbtn.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.close();
			
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}

	}


