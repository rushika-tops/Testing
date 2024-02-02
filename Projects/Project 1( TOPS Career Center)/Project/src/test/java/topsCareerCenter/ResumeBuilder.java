package topsCareerCenter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResumeBuilder {
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement resume = driver.findElement(By.linkText("Resume Builder"));
		resume.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement protitle = driver.findElement(By.id("title"));
		protitle.clear();
		protitle.sendKeys("Automation");

		WebElement mobileno = driver.findElement(By.id("contact"));
		mobileno.clear();
		mobileno.sendKeys("9624384966");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.clear();
		email.sendKeys("abcd@gmail.com");

		WebElement dob = driver.findElement(By.id("dob"));
		dob.clear();
		dob.sendKeys("06-11-1998");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,100)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.clear();
		address.sendKeys("ctm");

		WebElement linkedin = driver.findElement(By.id("linkedinLink"));
		// js2.executeScript("arguments[0].scrollintoview();",linkedin);
		linkedin.clear();
		linkedin.sendKeys("abcd");

		WebElement gitlink = driver.findElement(By.id("githubLink"));
		gitlink.clear();
		gitlink.sendKeys("rushika123");

		WebElement behancelink = driver.findElement(By.id("behanceLink"));
		behancelink.clear();
		behancelink.sendKeys("rushika123");

		WebElement submitbtn = driver.findElement(By.id("personalDetailSubmit"));
		submitbtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement profilesummary = driver.findElement(By.xpath(
				"//form[@id='summaryForm']//div[@class='col-md-12 px-md-2 px-0 mb-3']//textarea[@id='summeryContent']"));
		profilesummary.clear();
		profilesummary.sendKeys("These are  my details");
		Thread.sleep(5000);

		WebElement submit = driver.findElement(
				By.xpath("//form[@id='summaryForm']//div[@class='row mx-0']//input[@id='personalDetailSubmit']"));

		submit.click();
		WebElement ProLanguage = driver.findElement(By.id("programmingLanguages"));
		ProLanguage.clear();
		ProLanguage.sendKeys("java");

		WebElement database = driver.findElement(By.id("databases"));
		database.clear();
		database.sendKeys("MySql");

		WebElement webserver = driver.findElement(By.id("webServers"));
		webserver.clear();
		webserver.sendKeys("Apache");

		WebElement software = driver.findElement(By.id("softwares"));
		software.clear();
		software.sendKeys("JIRA");
		
		WebElement System = driver.findElement(By.id("systems"));
		System.clear();
		System.sendKeys("Linux,windows");
		
		WebElement submit3 = driver.findElement(
				By.xpath("//form[@id='technicalSkillsDetailsForm']//div[@class='row mx-0']//input[@type='submit']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		submit3.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ExperienceDetails = driver.findElement(By.linkText("+ Add Experience Details"));
		ExperienceDetails.click();
		WebElement companyname = driver.findElement(By.xpath("//input[@id='companyName']"));
		companyname.sendKeys("xyz");

		WebElement position = driver.findElement(By.id("position"));
		position.sendKeys("QA");

		WebElement JobDescri = driver.findElement(By.id("//textarea[@id='jobDescriptionText']"));
		JobDescri.sendKeys("My role in this company as a QA. ");

		WebElement jobfrom = driver.findElement(By.id("jobTenureFrom"));
		jobfrom.sendKeys("02/12/2020");

		WebElement jobTo = driver.findElement(By.id("jobTenureTo"));
		jobTo.sendKeys("02/06/2023");

		WebElement add = driver.findElement(By.id("companyDetailsFormSubmit"));
		add.click();
		
		WebElement save = driver.findElement(By.xpath("//input[@id='companyDetailsFormSubmit']"));
		save.click();

	}

}
