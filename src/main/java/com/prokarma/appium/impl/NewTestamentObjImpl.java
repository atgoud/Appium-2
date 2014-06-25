package com.prokarma.appium.impl;
import java.util.Calendar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.prokarma.appium.NewTestamentObj;
public class NewTestamentObjImpl {	
		private NewTestamentObj object;
		private static int TIME_OUT = 10;
		private WebDriver driver;

		public NewTestamentObjImpl(WebDriver driver) {
			this.driver = driver;
			object = PageFactory.initElements(driver, NewTestamentObj.class);
		}
		
		public void ServiceUnit(){
			waitOn(object.ServiceUnit);
			object.ServiceUnit.click();
			wait(1);
			Reporter.log("Performed Action on ServiceUnit");
			ajaxPollingTime();
		}
		
		public void Status(){
			waitOn(object.Status);
			object.Status.click();
			wait(1);
			Reporter.log("Performed Action on Status");
			ajaxPollingTime();	
		}	
			
		public void RevisionNumber(){
			waitOn(object.RevisionNumber);
			object.RevisionNumber.click();
			wait(1);
			Reporter.log("Performed Action on RevisionNumber");
			ajaxPollingTime();
		}
		
		public void EffectiveDate(){
			waitOn(object.EffectiveDate);
			object.EffectiveDate.click();
			wait(1);
			Reporter.log("Performed Action on EffectiveDate");
			ajaxPollingTime();
		} 	
		
		public void Category(){
			waitOn(object.Category);
			object.Category.click();
			wait(1);
			Reporter.log("Performed Action on Category");
			ajaxPollingTime();
		} 	
		
		public void WebVersion(){
			waitOn(object.WebVersion);
			object.WebVersion.click();
			wait(1);
			Reporter.log("Performed Action on WebVersion");
			ajaxPollingTime();
		}	
		
		public void PDFVersion(){
			waitOn(object.PDFVersion);
			object.PDFVersion.click();
			wait(1);
			Reporter.log("Performed Action on PDFVersion");
			ajaxPollingTime();
		}	
		public void ePUBVersion(){
			waitOn(object.ePUBVersion);
			object.ePUBVersion.click();
			wait(1);
			Reporter.log("Performed Action on ePUBVersion");
			ajaxPollingTime();
		}
		

		// -------------------------Section Ends----------------------------
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
				// ajaxPollingTime();
			} while ((element == null) && (start++ < end));

		}

		public void ajaxPollingTime() {
			try {
				while (true) {
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



