package com.prokarma.appium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Utils {
	public static int TIME_OUT = 2;
	public static  AjaxElementLocatorFactory getElement(WebDriver driver){
		return new AjaxElementLocatorFactory(driver, TIME_OUT);
	}

}
