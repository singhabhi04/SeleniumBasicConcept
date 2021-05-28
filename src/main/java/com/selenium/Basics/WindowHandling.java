package com.selenium.Basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");

		String parentWindowID = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Follow On Twitter')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Like us On Facebook')]")).click();

		Set<String> allwindowId = driver.getWindowHandles();

		Iterator<String> it =	allwindowId.iterator();
		while(it.hasNext()) {
			String childWindowId = it.next();
			if(!parentWindowID.equals(childWindowId)) {
				driver.switchTo().window(childWindowId);
				if(driver.getTitle().contains("Facebook")){
					driver.manage().window().maximize();
					System.out.println(driver.getTitle());
					driver.close();

				}

			}


		}
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
