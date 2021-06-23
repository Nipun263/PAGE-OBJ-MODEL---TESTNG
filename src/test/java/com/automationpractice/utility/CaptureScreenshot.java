package com.automationpractice.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	public static  WebDriver driver;
	
	
	public static WebDriver  takeScreenShot(WebDriver driver) throws IOException, InterruptedException
	{
		try {
	    File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    String pathToCollectSS = System.getProperty("user.dir");
	    
	    File dest= new File(pathToCollectSS + "/test-output/" +timestamp()+".png");
	    
	    FileUtils.copyFile(scr, dest);
	
	}
	catch (Exception e) {
		System.out.println("Handle Exception");
	}
		return driver;
		
	}
	
	public static String timestamp() {
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
