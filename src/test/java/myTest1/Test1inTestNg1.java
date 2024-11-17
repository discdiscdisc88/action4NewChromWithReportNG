package myTest1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Test1inTestNg1 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
	
		ChromeOptions options1 = new ChromeOptions();
		options1.addArguments("--no-sandbox");
            	options1.addArguments("--disable-dev-shm-usage");
            	options1.addArguments("--headless");
		
		driver = new ChromeDriver(options1);
	}
	
	@Test
	public void test1Junit() throws Exception {

		driver.navigate().to("http://google.com");
		System.out.println("Test1 "+driver.getTitle());
		AssertJUnit.assertEquals(driver.getTitle(), "Google_jUnit");

	}

	@Test
	public void test2tNG() throws Exception {

		driver.navigate().to("http://google.com");
		System.out.println("Test2 "+driver.getTitle());
		Assert.assertEquals("GoogleN_testNG", driver.getTitle());
	}

	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Exittttttttttttt");
	}

}
