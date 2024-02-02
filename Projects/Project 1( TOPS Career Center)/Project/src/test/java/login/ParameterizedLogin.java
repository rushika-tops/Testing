package login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedLogin {

	static WebDriver driver;

	@Test(dataProvider = "dp")
	public void login(String mo, String pass, ITestContext i) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//i.setAttribute("myDriver", driver);
		driver = new ChromeDriver();
		i.setAttribute("myDriver", driver);
		driver.manage().window().maximize();
		driver.get("https://careercenter.tops-int.com/");
		Thread.sleep(2000);

		WebElement mofield = driver.findElement(By.id("mobile"));
		mofield.sendKeys(mo);

		WebElement passfield = driver.findElement(By.id("password"));
		passfield.sendKeys(pass);
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
		loginbtn.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Home"));
		driver.quit();
	//	String ExpectedTitle="TOPS Career Center - Welcome to TOPS Technologies";
	//	String ActualTitle=driver.getTitle();
		//assertEquals(ActualTitle, ExpectedTitle);

	}
	@Test
	@DataProvider(name="dp")
	public Object logindata() {
		Object[][] obj = new Object[4][2];
		
		obj[0][0] = "9624384966";
		obj[0][1] = "#Rushika";
		
		obj[1][0] = "96243849";
		obj[1][1] = "#Rushika#27";
		
		obj[2][0] = "9624384966";
		obj[2][1] = "#Rushika";
		
		obj[3][0] = "9624384966";
		obj[3][1] = "#Rushika#27";
		
		
		return obj;

		
	}
}
