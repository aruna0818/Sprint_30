package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public WebDriver BrowserLaunch(String url ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUNACHALAM\\eclipse-workspace\\Sampl\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		return driver;
	
	}
	
	public void firstName(WebElement txtuser, String txt) {
		txtuser.sendKeys(txt);

	}
	public void login(WebElement txtlog) {
		txtlog.click();

	}
	

	}


