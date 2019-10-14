package com.ww.common;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;



public class Common {
	 
	WebDriver driver;	
	
	private static String getURL = "https://www.weightwatchers.com/us/";
		public static String getGetURL() {
			return getURL;
		}

	
	public static WebDriver getbrowser(String browserName, WebDriver driver) {
		if (browserName.equalsIgnoreCase("chrome")){
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	driver = new ChromeDriver();
		}
		if (browserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver","./Driver/operadriver.exe");
			driver = new OperaDriver();	
		}
		else if (browserName.equalsIgnoreCase("Mozila")) {
			System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    return driver;
	    
	}
	
	
	
	public static void SS (WebDriver driver, String FileName) throws Throwable {
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File f1= ss.getScreenshotAs(OutputType.FILE); // to take screenshot 
		FileUtils.copyFile(f1,new File("./Screenshot/"+FileName+".png"));//to save the file 
		if (ss.getScreenshotAs(OutputType.FILE) != null) {
			System.out.println("ScreenShot Taken");
			
		}
		else {
			System.out.println("ScreenShot Couldn't Take");
		}
	
   }
	
}
