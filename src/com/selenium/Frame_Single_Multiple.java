package com.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Single_Multiple {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		 List<WebElement> z = driver.findElements(By.tagName("iframe"));
         int l = z.size();
         System.out.println(l);
         
         driver.switchTo().frame("singleframe");
         driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("text box is enabled");
         driver.switchTo().defaultContent();
         
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
         WebElement OuterFrame= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
         driver.switchTo().frame(OuterFrame);
		
         Thread.sleep(2000);
         WebElement InnerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
         driver.switchTo().frame(InnerFrame);
         driver.findElement(By.xpath("//input[@type='text']")).sendKeys("inner frame text box is enabled");
        
        Thread.sleep(2000);
		driver.switchTo().defaultContent();
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='Widgets.html']")).click();
		
	}

}
