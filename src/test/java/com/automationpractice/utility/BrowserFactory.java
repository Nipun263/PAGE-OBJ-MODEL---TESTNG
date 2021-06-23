package com.automationpractice.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BrowserFactory {
	public static WebDriver driver;

	@BeforeSuite
	public static WebDriver startApplication(WebDriver driver, String browserName, String applicationURL) {

		if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox driver used");
		}
		

		/*
		 * else if (browserName.equalsIgnoreCase("Chrome")) {
		 * System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 * driver=new ChromeDriver(); System.out.println("Chrome driver used"); }
		 */
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(900, TimeUnit.SECONDS);
		driver.get(applicationURL);

		return driver;

	}
	
	
	@AfterSuite
	public static void closeApplication(WebDriver driver) {
		driver.quit();

	}

}
