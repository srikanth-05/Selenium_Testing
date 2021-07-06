package com.POM;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Placing_Order extends Base_Example{

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jayanthiraju1986@yahoo.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Srikarthik");
		
		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
		Thread.sleep(3000);	
		
		
		WebElement Women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions T = new Actions (driver);
		T.moveToElement(Women).build().perform();
		
		Thread.sleep(3000);
		WebElement TShirts = driver.findElement(By.xpath("//a[@title='T-shirts']"));
		T.moveToElement(TShirts).build().perform();
		T.doubleClick(TShirts).build().perform();
		
		Thread.sleep(3000);
		WebElement ShortSleeveTShirts = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
		T.moveToElement(ShortSleeveTShirts).build().perform();
		T.doubleClick(ShortSleeveTShirts).build().perform();
		
		Thread.sleep(3000);
		WebElement Quickview = driver.findElement(By.xpath("//a[@class='quick-view']"));
		T.moveToElement(Quickview).build().perform();
		T.click(Quickview).build().perform();
		
		List<WebElement> z = driver.findElements(By.tagName("iframe"));
        int l = z.size();
        System.out.println(l);
        
        WebElement aa = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
        driver.switchTo().frame(aa);
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='cheque']")).click();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
		
		JavascriptExecutor yl = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		yl.executeScript("window.scroll(0,500)","");
		Thread.sleep(3000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File src= t.getScreenshotAs(OutputType.FILE);
		File ss = new File ("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Screenshot\\detailsoforder5.png");
		FileUtils.copyFile(src, ss);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']")).click();
		
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File src1= t1.getScreenshotAs(OutputType.FILE);
		File st = new File ("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Testing\\src\\Screenshot\\orderhistory.png");
		FileUtils.copyFile(src1, st);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Log me out']")).click();
		
		
		
		
		
		
	}

}
