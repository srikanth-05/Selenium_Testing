package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Day6_Selectdropdown {

	public static void main(String[] args) throws InterruptedException {

		
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("https://twitter.com/?lang=en");
					driver.manage().window().maximize();
					
					
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//a[@role='link'])")).click();
					Thread.sleep(5000);
					
					
					WebElement month = driver.findElement(By.id("Month"));
					Select s = new Select(month);
				    s.selectByVisibleText("October");
					Thread.sleep(3000);
					
					WebElement day = driver.findElement(By.id("Day"));
					Select s1 = new Select(day);
				    s1.selectByValue("14");
					Thread.sleep(3000);
					
					WebElement year = driver.findElement(By.id("Year"));
					Select s2 = new Select(year);
				    s2.selectByIndex(67);
					Thread.sleep(3000);
					
					
		
		
		
		
		}	
	}

}
