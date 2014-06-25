package com.prokarma.appium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScripturesObj {
	
	@FindBy(xpath = "//a[contains(text(),'Create Bulletin')]")
	public WebElement CreateBulletinMenuLink;
		
	@FindBy(xpath = "//div[contains(@id='serviceUnitGroupBox')]//tr/td[2]/select")
	public WebElement ServiceUnitName;
		
	@FindBy(xpath = "//div[contains(@id,'createBulletin')]//button[contains(@id,'submit')]")
	public WebElement  Submit;
}
