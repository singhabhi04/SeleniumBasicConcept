package com.selenium.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcepts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	//	WebDriverWait wait  = new WebDriverWait(driver,20);
		By webdriverText = By.xpath("//p[text()='WebDriver']");
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(webdriverText));
		ElementUtils util = new ElementUtils(driver);
		util.waitForElementPresent(webdriverText, 15);
		
	
	boolean status = driver.findElement(webdriverText).isDisplayed();
	 
	// if else condition
	if (status) {
		System.out.println("===== WebDriver is visible======");
	} else {
		System.out.println("===== WebDriver is not visible======");
	}
	}

}
