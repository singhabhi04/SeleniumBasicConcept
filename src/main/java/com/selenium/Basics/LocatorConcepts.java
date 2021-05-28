package com.selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
	WebElement fullName = 	driver.findElement(By.id("userName"));
	fullName.sendKeys("Abhishek Kumar Singh ");
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("Abhishek.topa@gmail.com");
	WebElement address = driver.findElement(By.id("permanentAddress"));
	address.sendKeys("rabodh PIN_- 825330");
	WebElement submit  = driver.findElement(By.xpath("//button[@id='submit']"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", submit);
	}

}
