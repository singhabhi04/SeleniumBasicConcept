package com.selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverUsingActionClass {
	
	// Actions is a class in Java

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://mrbool.com/course/");
		Actions ac = new Actions(driver);
		WebElement content = driver.findElement(By.xpath("//span[@id='headermenudesktop']//li/a"));
		
		ac.moveToElement(content).build().perform();
		Thread.sleep(2000);
		WebElement courses = 	driver.findElement(By.xpath("//ul[@class='submenu']//a[text()='Courses']"));
		courses.click();
		Thread.sleep(5000);
		driver.close();
		
	//	ac.dragAndDrop(source, target) --drag and drop
		

	}

}
