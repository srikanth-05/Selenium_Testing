package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Pom extends Login{
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
	Login k = new Login ();
	
	k.em(driver).sendKeys("jayathiraju1986@yahoo.com");
	
	k.pass(driver).sendKeys("Srikanthkarthik");
	
	k.sign(driver).click();
	}

}
