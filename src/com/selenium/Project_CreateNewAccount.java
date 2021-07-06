package com.selenium;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_CreateNewAccount {

	public static void main(String[] args) throws InterruptedException, IOException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//a[@rel='async'])")).click();
	
	
	Thread.sleep(3000);	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jayanthi");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raju");
		
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("jayanthiraju1986@yahoo.com");		
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("jayanthiraju1986@yahoo.com");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Srikarthik");
		
	WebElement dd = driver.findElement(By.name("birthday_day"));
	Select x = new Select(dd);
	x.selectByValue("27");
	Thread.sleep(2000);
	
	WebElement mm = driver.findElement(By.name("birthday_month"));
	Select x1 = new Select(mm);
	x1.selectByVisibleText("Apr");
	Thread.sleep(2000);
	
	WebElement yy = driver.findElement(By.name("birthday_year"));
	Select x2 = new Select(yy);
	x2.selectByValue("1955");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='radio']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	Thread.sleep(3000);

	TakesScreenshot t = (TakesScreenshot) driver;
	File src= t.getScreenshotAs(OutputType.FILE);
	File z = new File ("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Screenshot\\Fb.png");
	FileUtils.copyFile(src, z);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}

}
