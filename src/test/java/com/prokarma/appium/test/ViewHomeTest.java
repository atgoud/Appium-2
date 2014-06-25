package com.prokarma.appium.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/*
 Test Case 1:
 Verify the Home Screen 
 Quit the driver"
 */
public class ViewHomeTest extends MainTest {
	public ViewHomeTest() throws IOException {
		super();
	}

	@Test
	public void verifyHomePageLinks() throws Exception {

		homePageObjImpl.Home();
		
		driver.findElement(By.xpath("//")).click();
		homePageObjImpl.waitFor();
		driver.findElement(By.xpath("//")).click();
		driver.getPageSource().contains("Characters");  // Based on the scripts
		homePageObjImpl.Home();
	
		try {
			Actions builder = new Actions(driver);
			builder
			.keyDown(Keys.RETURN)
			.keyDown(Keys.RETURN)
			.keyDown(Keys.RETURN);
			Action selectMultiple = builder.build();
			selectMultiple.perform();
		} catch (Exception e) {

		}
	}

}
