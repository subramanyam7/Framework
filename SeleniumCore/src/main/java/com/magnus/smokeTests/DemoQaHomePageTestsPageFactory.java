package com.magnus.smokeTests;

import org.testng.annotations.Test;

import com.magnus.pages.DemoQaHomePagePageFactory;

public class DemoQaHomePageTestsPageFactory {
	@Test
	public void PageFactoryTest1() {
		DemoQaHomePagePageFactory dq1 = new DemoQaHomePagePageFactory();
		dq1.openDemoQaHomePage();
		dq1.verifyHomePageDisplayed();
		dq1.closeApp();
	}

}
