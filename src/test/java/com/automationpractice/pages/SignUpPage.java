package com.automationpractice.pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.maven.shared.utils.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utility.BrowserFactory;
import com.automationpractice.utility.CaptureScreenshot;


public class SignUpPage {
	
	static WebDriver driver;
	
	public SignUpPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	
	@FindBy(xpath ="//*[@class='login']")
	WebElement signIn;
	
	@FindBy(xpath ="//*[@id='email_create']")
	WebElement emailAddress;
	
	@FindBy(xpath ="//*[@id='SubmitCreate']")
	WebElement createAccount;
	
	
	
	public void signInNewUser(String UserMailingAddress) throws InterruptedException, IOException {
		Thread.sleep(2000);
		signIn.click();
		
		CaptureScreenshot.takeScreenShot(driver);
		
		double RandomNumGen = Math.random();
		
		emailAddress.sendKeys(UserMailingAddress + RandomNumGen + "@gmail.com");
	
		
		createAccount.click();
		
		
		
	}
	
	
		
	
	
}