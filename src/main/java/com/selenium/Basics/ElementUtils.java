package com.selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
	WebDriver driver ;

	public ElementUtils(WebDriver driver) {
	
		this.driver = driver;
	}
	/**
	 * This method is used to create WebElements on the basis of By locator
	 * @param locator
	 * @return
	 */
	 public WebElement getElement(By locator) {
		 WebElement element = null;
		 try {
			  element = driver.findElement(locator);
		 }
		catch(Exception e) {
			System.out.println("Some issue with located WebElement");
			System.out.println(e.getMessage());
		}
		 return element;
		 
	 }
	 /**
	  * This method is used to perform sendKeys operation
	  * @param locator
	  * @param value
	  */
	 public void doSendKeys(By locator, String value) {
		 try {
			 getElement(locator).sendKeys(value);
		 }
		catch(Exception e) {
			System.out.println("fail to perform sendKeys operation :"+e.getMessage());
		}
	 }
	 /**
	  * This method is used to perform click operation
	  * @param locator
	  */
	 public void doClick(By locator) {
		 try {
			 getElement(locator).click();
		 }
		 catch(Exception e) {
			 System.out.println("fail to perform click operation :"+e.getMessage());
		 }
		
	 }
	
	

}
