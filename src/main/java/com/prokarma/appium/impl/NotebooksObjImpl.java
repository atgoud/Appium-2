package com.prokarma.appium.impl;

import java.util.Calendar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.prokarma.appium.NotebooksObj;

public class NotebooksObjImpl {
	private NotebooksObj object;
	private static int TIME_OUT = 10;
	private WebDriver driver;

	public NotebooksObjImpl(WebDriver driver) {
		this.driver = driver;
		object = PageFactory.initElements(driver, NotebooksObj.class);
	}
	

	public void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException iex) {
		}
	}

	public void waitFor() {
		try {
			Thread.sleep(TIME_OUT * 1000);
		} catch (InterruptedException iex) {
		}
	}

	public void waitOn(WebElement element) {

		Long start = Calendar.getInstance().getTimeInMillis();
		Long end = start + (60 * 1000);
		do {
			try {
				ajaxPollingTime();
				if (element != null && element.isDisplayed()
						&& element.isEnabled()) {
					break;

				} else {
					throw new NoSuchElementException("Element Not Found:"
							+ element);
				}
			} catch (NoSuchElementException ignored) {
			}
			// PollingTime();
		} while ((element == null) && (start++ < end));

	}

	public void ajaxPollingTime() {
		try {
			while (true) {
				//System.out.println(driver);
				boolean flag = (Boolean) ((JavascriptExecutor) driver)
						.executeScript(" return jQuery.active == 0");
				if (flag)
					break;
				Thread.sleep(100);
			}
		} catch (InterruptedException iex) {
		}
	}


}
