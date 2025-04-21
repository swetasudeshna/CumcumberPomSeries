package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	private WebDriver driver;
	//1. By Locators:
	private By emailId=By.id("email");
	private By password=By.id("passwd");
	private By SignInButton=By.id("SubmitLogin");
	private By forgotPwdLink=By.linkText("Forgot your password?");
	
	//2.constructor of the page class
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//3.page actions
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean isForgotPwdLinkExist()
	{
		return driver.findElement(forgotPwdLink).isDisplayed();
		
	}
	
	
	public void enterUserName(String Username)
	{
		driver.findElement(emailId).sendKeys(Username);
		
	}
	
	public void enterPassword(String Password)
	{
		driver.findElement(password).sendKeys(Password);
		
	}
	
	public void clickOnLogin()
	{
		driver.findElement(SignInButton).click();
	}
	
	public AccountsPage doLogin(String un,String pwd)
	{
		System.out.println("login with:"+un+ "and" +pwd);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(SignInButton).click();
		return new AccountsPage(driver);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

