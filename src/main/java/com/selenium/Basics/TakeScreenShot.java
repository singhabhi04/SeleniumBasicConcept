package com.selenium.Basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://mrbool.com/course/");
				
		takeScreenShot(driver);

	}
	public static void takeScreenShot(WebDriver driver) throws IOException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File dest = new File(".\\target\\screenShots"+System.currentTimeMillis()+".jpeg");
		FileUtils.copyFileToDirectory(srcFile,dest);
		driver.close();
	}

}
