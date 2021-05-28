package com.selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUplaod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	WebElement fileUplaod = 	driver.findElement(By.xpath("//input[@type='file']"));
	fileUplaod.sendKeys("C:\\Users\\ABHISHEK\\Desktop\\JavaScriptUtil.java");

	}

}
