package com.selenium.Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) {
		// Java Script Alert
		//Alert is an Interface in Selenium  which have methods which  is used to handle JS alert
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
	Alert alert = 	driver.switchTo().alert();
	System.out.println(alert.getText());
	if(alert.getText().equalsIgnoreCase("Please enter a valid user name")) {
		System.out.println("Alert Text Matches");
	}
	else {
		System.out.println("Alert Text not matches");
	}

	
	alert.accept();
	driver.close();
	}

}
