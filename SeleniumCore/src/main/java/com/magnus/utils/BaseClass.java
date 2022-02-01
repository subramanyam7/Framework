package com.magnus.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected static WebDriver driver = null;

	// Environment & Configuration variables
	public String baseURL = "https://demoqa.com/";

	public WebDriver getDriver() {
		return driver;
	}

	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void closeApp() {
		driver.close();
		driver.quit();
	}
}
