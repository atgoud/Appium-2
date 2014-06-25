package com.prokarma.appium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTestamentObj {
	@FindBy(xpath = "//a[contains(text(),'Bulletins')]")
	public WebElement BulletinsMenuLink;
	
	@FindBy(xpath = "//select[contains(@id,'serviceUnit']")	
	public WebElement ServiceUnit;	
	
	@FindBy(xpath = "//tr[2]/td[2]/select")
	public WebElement Status;	
		
	@FindBy(xpath = "//div[contains(@id,'bulletinsList')]//th[1]/a")
	public WebElement RevisionNumber;
	
	@FindBy(xpath = "//div[contains(@id,'bulletinsList')]//th[2]/a")
	public WebElement EffectiveDate; 	
	
	@FindBy(xpath = "//div[contains(@id,'bulletinsList')]//th[3]/a")
	public WebElement Category; 	
	
	@FindBy(xpath = "//div[contains(@id,'bulletinsList')]//th[4]/a")
	public WebElement WebVersion;	
	
	@FindBy(xpath = "//div[contains(@id,'bulletinsList')]//th[5]/a")
	public WebElement PDFVersion;	
	
	@FindBy(xpath = "//div[contains(@id,'bulletinsList')]//th[6]/a")
	public WebElement ePUBVersion;

}
