package com.magnus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.magnus.utils.BaseClass;

public class DemoQaHomePage extends BaseClass {

	// HomePage WebElements
	WebElement imgLogo;

	// Get Homepage
	public void openDemoQaHomePage() {
		driver.get(baseURL);
	}

	public void verifyHomePageDisplayed() {
		imgLogo = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
		Assert.assertTrue(imgLogo.isDisplayed());
	}

}
