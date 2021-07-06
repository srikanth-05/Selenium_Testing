package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day1 {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		String s = driver.getTitle();
		
		System.out.println(s);
		
		String t = driver.getCurrentUrl();
		
		System.out.println(t);
		
		driver.close();
	
	}

}

