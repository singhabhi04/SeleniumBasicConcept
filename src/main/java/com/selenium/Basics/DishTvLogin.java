package com.selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DishTvLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dishtv.in/Pages/Login.aspx");
		ElementUtils util = new ElementUtils(driver);
		
		//Page Objects
		By mobileNumber = By.xpath("//input[@id='ucHeader_ucLogin_txtVCNumber']");
		By password = By.id("ucHeader_ucLogin_txtPassword");
		By loginBtn = By.xpath("(//a[text()='Login'])[2]");
		
		

		util.getElement(password).sendKeys("tatadocomo");
		util.doSendKeys(mobileNumber, "9038168803");
		util.doSendKeys(password, "tatadocomo");
		util.doClick(loginBtn);
		driver.close();
	}

}
