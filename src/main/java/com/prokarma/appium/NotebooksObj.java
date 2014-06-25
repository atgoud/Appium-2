package com.prokarma.appium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Hello world!
 *
 */
public class NotebooksObj 
{
	@FindBy(xpath = "//")
	public WebElement userld; 
	
	@FindBy(xpath = "//input[contains(@name,'PASSWORD')]")
	public WebElement password;	
	
	@FindBy(xpath = "//button[contains(@id,'login-button')]")
	public WebElement login;

}

