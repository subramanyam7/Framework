package com.magnus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.magnus.utils.BaseClass;

public class DemoQaHomePagePageFactory extends BaseClass {

	// HomePage WebElements
	@FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
	WebElement imgLogo;
	
	public DemoQaHomePagePageFactory(){
		PageFactory.initElements(driver, this);
	}

	// Get Homepage
	public void openDemoQaHomePage() {
		driver.get(baseURL);
	}

	public void verifyHomePageDisplayed() {
		imgLogo = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
		Assert.assertTrue(imgLogo.isDisplayed());
	}
}
