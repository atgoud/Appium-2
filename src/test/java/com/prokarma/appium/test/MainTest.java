package com.prokarma.appium.test;

import static java.io.File.separator;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.prokarma.appium.NewTestamentObj;
import com.prokarma.appium.ScripturesObj;
import com.prokarma.appium.HomePageObj;
import com.prokarma.appium.NotebooksObj;
import com.prokarma.appium.impl.NewTestamentObjImpl;
import com.prokarma.appium.impl.ScripturesObjImpl;
import com.prokarma.appium.impl.HomePageObjImpl;
import com.prokarma.appium.impl.NotebooksObjImpl;
import com.prokarma.appium.utils.TestData;
import com.prokarma.appium.utils.Utils;

public class MainTest {

	public static WebDriver driver;
	public static NewTestamentObj newTestamentObj;
	public static ScripturesObj scripturesObj;
	public static HomePageObj homePageObj;
	public static NotebooksObj notebooksObj;
	
	public static NewTestamentObjImpl bulletinsObjImpl;
	public static ScripturesObjImpl createBulletinObjImpl;
	public static HomePageObjImpl homePageObjImpl;
	public static NotebooksObjImpl loginPageObjImpl;
	
	static WebElement element = null, element1 = null;
	public List<String> paramData = new ArrayList<String>();
	public List<String> testMethod = new ArrayList<String>();
	protected StringBuffer verificationErrors = new StringBuffer();

	TestData td = new TestData(
			"D:\\bjose\\Automation\\ert-qa\\src\\test\\resources\\TestData.xls");
	//
	
	public MainTest() throws IOException {
		
		/* System.setProperty("webdriver.firefox.bin",
		 "C:\\firefox.exe");
		 
		 FirefoxProfile firefoxProfile = new FirefoxProfile();
		 
		    firefoxProfile.setPreference("browser.download.folderList",2);
		    firefoxProfile.setPreference("browser.download.manager.showWhenStarting",false);
		    firefoxProfile.setPreference("browser.download.dir","c:");
		    firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","*.*");

		    driver = new FirefoxDriver(firefoxProfile);*/
		 

		 //HtmlUnitDriver driver =new HtmlUnitDriver(BrowserVersion.FIREFOX_3_6);
	     //driver.setJavascriptEnabled(true);

		//driver = new InternetExplorerDriver();
		
		driver = new FirefoxDriver();
		 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		newTestamentObj = new NewTestamentObj();
		PageFactory.initElements(Utils.getElement(driver), newTestamentObj);

		scripturesObj = new ScripturesObj();
		PageFactory.initElements(Utils.getElement(driver), scripturesObj);

		homePageObj = new HomePageObj();
		PageFactory.initElements(Utils.getElement(driver), homePageObj);

		notebooksObj = new NotebooksObj();
		PageFactory.initElements(Utils.getElement(driver), notebooksObj);

		// Pages objects mapping
		bulletinsObjImpl = new NewTestamentObjImpl(driver);
		PageFactory.initElements(Utils.getElement(driver), bulletinsObjImpl);

		createBulletinObjImpl = new ScripturesObjImpl(driver);
		PageFactory.initElements(Utils.getElement(driver),
				createBulletinObjImpl);

		homePageObjImpl = new HomePageObjImpl(driver);
		PageFactory.initElements(Utils.getElement(driver), homePageObjImpl);

		loginPageObjImpl = new NotebooksObjImpl(driver);
		PageFactory.initElements(Utils.getElement(driver), loginPageObjImpl);
  }

	@AfterSuite
	public void closeDriver() throws IOException {
		driver.close();
		driver.quit();
	}

	@BeforeSuite
	public void testLogin() throws Exception {
		System.out.println("log...  " + td.getCell(1, 2));
		driver.get(td.getCell(1, 2));

	/*	try {
	//		driver.switchTo().alert().accept();
		} catch (Exception e) {

		}*/

		/*loginPageObjImpl.UserId(td.getCell(2, 2));
		Reporter.log("UserId Entered");

		loginPageObjImpl.password(td.getCell(3, 2));
		Reporter.log("Password Entered");

		loginPageObjImpl.loginButton();
		Reporter.log("Login button clicked");*/

		if (driver.getTitle().contains("UP: ")) {
			Reporter.log("Entered into home page.");
		} else
			Reporter.log("Login Error!, Not loged in.");

	}

}
