package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseAdactin {

	public static WebDriver driver;

	public static String orderId;

	public static WebDriver launchApp() {
		
		if(driver==null){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aaa\\workspace\\CucumberClass\\div\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		return driver;
	}

	public static void url(String s) {

		driver.get(s);
	}

	public static void fill(WebElement w, String s) {
		w.sendKeys(s);
	}

	public static void clik(WebElement w) {
		w.click();
	}

	public static void drdp(WebElement w, String s) {
		Select sel = new Select(w);
		sel.selectByVisibleText(s);
	}

	public static void clearText(WebElement w) {
		w.clear();
	}

	public static void outPut(WebElement w) {
		orderId = w.getAttribute("value");
		System.out.println("   ORDER NUBER IS  " + orderId);
	}

	public static void quitBrowser() {

		driver.quit();
	}

}
