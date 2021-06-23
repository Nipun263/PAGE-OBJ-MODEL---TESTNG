package com.automationpractice.pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import com.automationpractice.utility.*;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.automationpractice.utility.*;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class UserDetailPage {
	static WebDriver driver;

	  public UserDetailPage(WebDriver ldriver)
	  { 
		  this.driver=ldriver;
	  }
	 

	@FindBy(id = "id_gender1")
	WebElement gender;

	@FindBy(id = "customer_firstname")
	WebElement firstName;

	@FindBy(id = "customer_lastname")
	WebElement lastName;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name ="id_state")
	WebElement stateListed;
	
	@FindBy(name ="address1")
	WebElement Address;
	
	@FindBy(name ="phone")
	WebElement Phone;
	
	
	 @FindAll({
	 @FindBy(name = "id_state"),
	 @FindBy(id = "id_state") }) 
	 List<WebElement> statePopulated;
	 
	 
	
	public void userDetails(String FirstName, String LastName , String CityName , String SelectStateFromDD , String UserAddress , String UserPhone) throws InterruptedException, IOException{
		Thread.sleep(3000);
		firstName.sendKeys(FirstName);
		lastName.sendKeys(LastName);

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,1000)");
		 
		
		
		city.sendKeys(CityName);
		
		
		  
		  Select select = new Select(stateListed);
		  select.selectByVisibleText(SelectStateFromDD);
		 
		 
		  Address.sendKeys(UserAddress);
		  
		 
		  
		  Phone.sendKeys(UserPhone);
	}
	
	@DataProvider
	public Object[][] dataPasser(){
		Object[][] Obj = new Object[1][5];
		
		
		return Obj;
	}

}
