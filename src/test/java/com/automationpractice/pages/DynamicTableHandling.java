package com.automationpractice.pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicTableHandling  {
	WebDriver driver ;
	
	public DynamicTableHandling(WebDriver ldriver) {
		this.driver=ldriver;	
	}
	
	public void dynamicTableSetUp() {
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Size of row is " + rowCount);
		
		
	}
	
	

}
