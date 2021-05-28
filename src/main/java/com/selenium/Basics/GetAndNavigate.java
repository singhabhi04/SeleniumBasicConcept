package com.selenium.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in");
//		System.out.println(driver.getTitle());
//		driver.close();
		driver.navigate().to("https://www.amazon.in");
		System.out.println(driver.getTitle());

	}

}
