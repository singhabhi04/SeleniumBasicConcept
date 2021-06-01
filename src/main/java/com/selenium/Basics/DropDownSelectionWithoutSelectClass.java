package com.selenium.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectionWithoutSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
	List<WebElement>  dropDownList=	driver.findElements(By.xpath("//select[@id='day']/option"));
	
	for(int i=0;i<dropDownList.size();i++) {
		String dropDownValue = dropDownList.get(i).getText();
		if(dropDownValue.equals("15")) {
			dropDownList.get(i).click();
			break;
			
		}
	}
	driver.close();

	}

}
