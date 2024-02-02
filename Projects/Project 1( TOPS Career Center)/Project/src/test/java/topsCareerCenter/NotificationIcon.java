package topsCareerCenter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NotificationIcon {
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
		WebElement notificationicon = driver.findElement(By.xpath("//i[@class='fa-regular fa-bell']"));
		notificationicon.click();
	/*	 WebElement dropdown = driver.findElement(By.id("notificationFilter"));
		Select s = new Select(dropdown);

		boolean result = s.isMultiple();
		System.out.println(result);
		s.selectByIndex(2);
		*/
		/* WebElement dropdown = driver.findElement(By.id("notificationFilter"));
			Select s = new Select(dropdown);
			
			s.selectByVisibleText("Important Reminders");
			*/
			 WebElement dropdown = driver.findElement(By.id("notificationFilter"));
				Select s = new Select(dropdown);
				s.selectByValue("all");
				Thread.sleep(2000);
				
				 WebElement dropdown2 = driver.findElement(By.id("notificationFilter"));
				Select s1 = new Select(dropdown2);
				s1.selectByValue("295319");
				
				 WebElement dropdown3 = driver.findElement(By.id("notificationFilter"));
					Select s2 = new Select(dropdown2);
					s2.selectByValue("unread");
					WebElement viewdetails = driver.findElement(By.linkText("View Details"));
					viewdetails.click();
					
					
					
				
				
		
		
			
			
			
		}

		
		

}

