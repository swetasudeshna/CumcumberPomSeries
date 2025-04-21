package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory
{
	public WebDriver driver;
	public static ThreadLocal<WebDriver>tDriver=new ThreadLocal<>();
	
	public WebDriver init_driver(String browser) 
	{
		System.out.println("browser value is: "+browser);
		
		if("chrome".equals(browser))
		{
			WebDriverManager.chromedriver().setup();
			tDriver.set(new ChromeDriver());
			
		}
		else if("firefox".equals(browser))
		{
			WebDriverManager.firefoxdriver().setup();
			tDriver.set(new FirefoxDriver());
			
		}
		
	
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	
	}

	public static synchronized WebDriver getDriver()
	{
		return tDriver.get();
	}
	
}
