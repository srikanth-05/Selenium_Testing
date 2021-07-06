package com.selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			
			WebElement tab1 = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/a/span[1]"));
			Actions T = new Actions (driver);
			Thread.sleep(3000);
			T.contextClick(tab1).build().perform();
			Robot R = new Robot();
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyRelease(KeyEvent.VK_DOWN);
			R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(3000);
			WebElement tab2 = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[3]/a"));
			T.contextClick(tab2).build().perform();
			Robot R1 = new Robot();
			R1.keyPress(KeyEvent.VK_DOWN);
			R1.keyRelease(KeyEvent.VK_DOWN);
			R1.keyPress(KeyEvent.VK_ENTER);
			R1.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(3000);
			WebElement tab3 = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[4]/a/span[2]"));
			T.contextClick(tab3).build().perform();
			Robot R2 = new Robot();
			R2.keyPress(KeyEvent.VK_DOWN);
			R2.keyRelease(KeyEvent.VK_DOWN);
			R2.keyPress(KeyEvent.VK_ENTER);
			R2.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(3000);
			String Mainwindow = driver.getWindowHandle();
			int size = driver.getWindowHandles().size();
			System.out.println(size);
			
			Thread.sleep(3000);
			Set<String> comw = driver.getWindowHandles();
			
			for (String cw: comw)
			{String name = driver.switchTo().window(cw).getTitle();
			System.out.println(name);
			}
				
			
			Thread.sleep(3000);
			Set<String> z = driver.getWindowHandles();
			
			for (String bw: z)
			{
				if(!bw.equals(Mainwindow));
					
				{
					driver.switchTo().window(bw);
					
					driver.close();
					}
			}
			
	}

}
