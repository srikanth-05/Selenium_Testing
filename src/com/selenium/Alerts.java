package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
	
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		Thread.sleep(3000);
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		Thread.sleep(3000);
		Alert alt2 = driver.switchTo().alert();
		
		String aa = alt2.getText();
		alt2.sendKeys(aa);
		System.out.println(aa);
		alt2.dismiss();
	
	}
	
}
