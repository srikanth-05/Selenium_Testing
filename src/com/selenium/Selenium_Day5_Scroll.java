package com.selenium;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day5_Scroll {

	public static void main(String[] args) throws InterruptedException, Throwable
	
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img['imgak.mmtcdn.com/pwa_v3/pwa_hotel_assets/header/mmtLogoWhite.png']"));
		
		Thread.sleep(3000);
		TakesScreenshot a = (TakesScreenshot)driver;
		File src= a.getScreenshotAs(OutputType.FILE);
		File b = new File ("File(C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Screenshot\\Scrolldown.jpg)");
		FileUtils.copyFile(src, b);
			
		
		driver.findElement(By.xpath("//body[@class='desktop in']"));
		
		JavascriptExecutor clk = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		
		clk.executeScript("arguments[0].ScrollIntoView", "clk");
		
		
		
	}

}
