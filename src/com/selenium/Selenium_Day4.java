package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day4 {

public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//input[@name='username']"));
		
		boolean z = a.isDisplayed();
		
		boolean z1 = a.isEnabled();
		
		System.out.println(z);
		
		System.out.println(z1);
		
		a.sendKeys("xyz@gmail.com");
		
		String att = a.getAttribute("value");
	
		String att1 = a.getAttribute("name");
		
		System.out.println(att);
		
		System.out.println(att1);
		
		a.clear();
		
		WebElement loginfb = driver.findElement(By.xpath("//button[@type='button']"));
		loginfb.click();
	
	}
}