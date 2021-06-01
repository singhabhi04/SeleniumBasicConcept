package com.selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActionsUsingActionsClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		Actions ac = new Actions(driver);
		WebElement fullName = 	driver.findElement(By.id("userName"));
	
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));

		WebElement submit  = driver.findElement(By.xpath("//button[@id='submit']"));
		
		
	// SendKeys using Action class
	
		ac.sendKeys(fullName,"Abhishek").build().perform();;
		ac.sendKeys(email,"Ttest@test.com").build().perform();
		// Submit using actions class
		ac.click(submit).build().perform();
		//ac.contextClick(submit).perform();// Right Click
		ac.doubleClick(submit).perform();;

	}
}
