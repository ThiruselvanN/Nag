package com.Selenium_Class;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Practice2 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("thiru@123gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Kasthuri");
		driver.findElement(By.id("SubmitLogin")).click();

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='product_img_link']")).click();
		
		
		//driver.findElement(By.xpath("//a[@class='quick-view-mobile']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		WebElement size = driver.findElement(By.id("group_1"));
		Select s = new Select(size);
		s.selectByIndex(2);
		
		driver.findElement(By.name("Blue")).click();
		driver.findElement(By.id("add_to_cart")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("email")).sendKeys("thiru@123gmail.com");
		//driver.findElement(By.id("passwd")).sendKeys("Kasthuri");
		//driver.findElement(By.id("SubmitLogin")).click();
		
		
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("hi");
		
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
        Thread.sleep(2000);
        
		//screen shot
        TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\snap\\automation.png");
		FileUtils.copyFile(from, to);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
