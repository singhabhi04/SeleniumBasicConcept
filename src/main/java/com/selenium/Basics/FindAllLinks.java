package com.selenium.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// findElement vs findElements

//findElement method is used to access a single web element on a page. It returns the first matching element.
//It throws a NoSuchElementException exception when it fails to find If the element.

//findElements method returns the list of all matching elements.
//findElements method returns  an empty list when the element is not available or doesn’t exist on the page.
//It doesn’t throw NoSuchElementException.

public class FindAllLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com");
		List<WebElement> allElements = 	driver.findElements(By.tagName("a"));
		int totalLinkCount = allElements.size();
		System.out.println("Total Number of Links present are : "+totalLinkCount);
		int count=0;
		for(int i=0;i<totalLinkCount;i++) {
		String link = 	allElements.get(i).getText();
		String href = allElements.get(i).getAttribute("href");
		if(link.length()>0 && href.length()>0) {
			System.out.println("Link Text is : "+link +" and Url is :"+href);
			
			count++;
		}
		}
		System.out.println("Total Number of valid Links are : "+count);
		driver.close();

	}

}
