package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project2_Create_New_Account {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("jayanthiraju1986@yahoo.com");
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[@name='SubmitCreate']")).click();
		
		Thread.sleep(7000);	
		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Jayanthi");
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Raju");
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Srikarthik");
		
		WebElement date = driver.findElement(By.name("days"));
		Select a = new Select(date);
		a.selectByValue("27");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.name("months"));
		Select a1 = new Select(month);
		a1.selectByVisibleText("April ");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.name("years"));
		Select a2 = new Select(year);
		a2.selectByValue("1955");
		Thread.sleep(2000);
	
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("WM&CO");
	
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("130 W North Ave");
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Block 1");
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Northlake");
		
		WebElement state = driver.findElement(By.name("id_state"));
		Select a4 = new Select(state);
		a4.selectByVisibleText("Illinois");
		Thread.sleep(2000);
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("60164");
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("Additional info");
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("723-406-0091");
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("708-409-0049");
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Plainfield, IL 60585");
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
		
	}
	
	
}
