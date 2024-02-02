package topsCareerCenter;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentOpenings {
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
		Thread.sleep(2000);
		
				JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");

		WebElement key = driver.findElement(By.id("keyword"));
		key.sendKeys("JAVA");
		WebElement city = driver.findElement(By.id("select2-location-container"));
		city.click();
		WebElement input = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		input.sendKeys("Ahmedabad");
		WebElement search = driver.findElement(By.xpath("//input[@type='submit'])"));
		search.click();
		
		

}
}
