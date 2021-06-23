package com.automationpractice.test;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automationpractice.pages.SignUpPage;
import com.automationpractice.pages.UserDetailPage;
import com.automationpractice.utility.BrowserFactory;

public class NewUserSignUpTest4 {
	WebDriver driver;

	@BeforeClass
	public void setUp() throws IOException {
	driver = BrowserFactory.startApplication(driver, "Firefox", "http://automationpractice.com/index.php");
	
	}
	
	
	@Test
	public void newUserSignUp() throws InterruptedException, IOException {
	SignUpPage signUp = PageFactory.initElements(driver, SignUpPage.class);
	signUp.signInNewUser("Nipun.Verma");

	}

	
	  @Test
	  public void passUserCredentials() throws InterruptedException, IOException {
	  UserDetailPage userCredentails =  PageFactory.initElements(driver, UserDetailPage.class);
	  userCredentails.userDetails("Nipun", "Verma" , "Germany" ,"Alabama" ,"263 Sector 26" , "999999999");
	  
	  }
	 
	  
	
	  @AfterClass
	  public void tearDown() {
	  driver.quit();
	}
	  
}