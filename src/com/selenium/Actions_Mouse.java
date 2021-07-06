package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Mouse {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement Costume = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		Actions T = new Actions (driver);
		T.moveToElement(Costume).build().perform();
		
		WebElement TShirts = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		T.moveToElement(TShirts).build().perform();
		Thread.sleep(3000);
		T.contextClick(TShirts).build().perform();
		Thread.sleep(3000);
		
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);		
	}
}
