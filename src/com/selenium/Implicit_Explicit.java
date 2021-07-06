package com.selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Explicit {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();

		
		WebElement tb = driver.findElement(By.xpath("//input[@placeholder='Enter your delivery location']"));
		tb.sendKeys("Chennai");
	    WebDriverWait w = new WebDriverWait(driver,60);
		w.until(ExpectedConditions.visibilityOf(tb));
		
		
	
	
	}
	
	
	
}
