package com.selenium.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//WebDriver driver = new WebDriver();-->Cannot instantiate the type WebDriver
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Open the browser
	
		
		
		// new ChromeDriver() is an object which is referred by driver which of type Webdriver Interface
		//child class object can be referred by Parent Interface reference Variable
		
		driver.manage().window().maximize(); // maximize the browser
		driver.get("https://news.google.com/topstories?hl=en-IN&gl=IN&ceid=IN:en"); // load url
		
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		
		if(titleOfThePage.equals("Google News")) {
			System.out.println("Title of the Page matched");
		}
		else {
			System.out.println("Title of the Page not matched");
		}
		
		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageUrl);
		
		//driver.close(); 
		// close the current browser instance // session Id is there but session id is  expired in case of close
		
		
		driver.quit();
		//close the all instance of browser which is opened // Session Id  is null in case of quit 
		//System.out.println(driver.getCurrentUrl());
		// org.openqa.selenium.NoSuchSessionException: invalid session id
		
	}

}
