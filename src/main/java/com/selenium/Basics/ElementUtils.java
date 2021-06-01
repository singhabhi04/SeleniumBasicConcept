package com.selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
	WebDriver driver ;

	public ElementUtils(WebDriver driver) {
	
		this.driver = driver;
	}
	 public WebElement getElement(By locator) {
		 WebElement element = driver.findElement(locator);
		 return element;
		 
	 }
	
	

}
