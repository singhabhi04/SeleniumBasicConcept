package com.selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.londonfreelance.org/courses/frames/");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='main']")));
	String text=	driver.findElement(By.xpath("//body[@background='top.gif']/h2")).getText();
	System.out.println(text);
	driver.close();
	//driver.switchTo().defaultContent();
	//driver.switchTo().parentFrame();

	}

}
