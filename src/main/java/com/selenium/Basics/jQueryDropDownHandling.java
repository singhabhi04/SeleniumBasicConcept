package com.selenium.Basics;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class jQueryDropDownHandling {
	
	
	public static void selectMultipleOptions(WebDriver driver, String... valuesToSelect) {
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		
		List<WebElement> choices =	driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		for(int i=0; i<choices.size();i++) {
			String choice = choices.get(i).getText();
			
			for(int k=0;k<valuesToSelect.length;k++) {
				if(choice.equals(valuesToSelect[k])) {
					choices.get(i).click();
					break;
					
				}
			}
			
		}
		
	}


	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		selectMultipleOptions(driver,"choice 2 2","choice 2 3","choice 4");
		takeScreenShot(  driver, "MultiSelect");
	}
	public static  void takeScreenShot(WebDriver driver,String testStepsName) throws IOException {
		TakesScreenshot tss		=(TakesScreenshot)driver;
	File srcFile =	tss.getScreenshotAs(OutputType.FILE);
	String path=System.getProperty("user.dir")+"/ScreenCapturesPNG/"+testStepsName+System.currentTimeMillis()+".png";
	File screenshotDest= new File(path);
	FileUtils.copyFile(srcFile, screenshotDest);
	}

}
