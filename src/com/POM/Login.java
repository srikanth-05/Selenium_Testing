package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		public static WebElement em (WebDriver driver);
		return driver.findElement(By.xpath("//input[@id='email']"));
		
		public static WebElement (WebDriver driver);
		return driver.findElement(By.xpath("//input[@id='passwd']"));
	
		public static WebElementsign (WebDriver driver);
		return driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		
	}

}
