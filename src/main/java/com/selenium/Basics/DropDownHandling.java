package com.selenium.Basics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		getSelectedValueFromDropDown(day);
		getAllDropDownValues(day);
		selectValueFromDropDown(day, "4");
		selectValueFromDropDown(month, "Jan");
		selectValueFromDropDown(year, "1990");
		driver.close();

	}
/**
 * This method is used to select value from drop down using select class and  selectByVisibleText method
 * @param element
 * @param value
 */
	public static void selectValueFromDropDown(WebElement element, String value) {

		Select sc = new Select(element);
		sc.selectByVisibleText(value);

	}
	/**
	 * This method is used to get selected value from dropdown
	 * @param element
	 */
	public static void getSelectedValueFromDropDown(WebElement element) {
		Select sc = new Select(element);
	String selectedvalue = 	sc.getFirstSelectedOption().getText();
	System.out.println(selectedvalue);
	}
	/**
	 * This method is used to get all values from a dropdown 
	 * @param element
	 */
	public static void getAllDropDownValues(WebElement element) {
		Select sc = new Select(element);
	List<WebElement> dropdownValuesList = 	sc.getOptions();
	System.out.println("Values present within Dropdown");
	for(int i=0;i<dropdownValuesList.size();i++) {
		System.out.println(dropdownValuesList.get(i).getText());
	}
	
	}
}
