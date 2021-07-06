package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day2 {

	public static void main(String[] args) throws InterruptedException {System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	driver.navigate().to ("https://www.facebook.com");
	
	driver.navigate().back();
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
    WebElement login = driver.findElement(By.id("email"));
	
	login.sendKeys("loginfb@gmail.com");
	
    WebElement password = driver.findElement(By.id("pass"));
	
    password.sendKeys("pass@123");
    
    driver.findElement(By.name("login")).click();
	
	Thread.sleep(3000);
	}

}
