package com.magnus.smokeTests;

import org.testng.annotations.Test;

import com.magnus.pages.DemoQaHomePage;

public class DemoQaHomePageTests {
	@Test
	public void homePateTestCase1() {
		DemoQaHomePage dq = new DemoQaHomePage();
		dq.setup();
		dq.openDemoQaHomePage();
		dq.verifyHomePageDisplayed();
		dq.closeApp();
	}

}
