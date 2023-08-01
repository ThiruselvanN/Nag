package com.Selenium_Class;

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

public class FaceBook_Login {
	
	public static void main(String[]args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("thiru15@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("rithuska");
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Thirus");
		
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("doly");
		
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("9943088143");
		
		//selectBy index
		WebElement a = driver.findElement(By.id("day"));
		Select s1 = new Select(a);
		s1.selectByIndex(14);
		
		//selectBy Visibletext
		WebElement b = driver.findElement(By.name("birthday_month"));
		Select s2 = new Select(b);
		s2.selectByVisibleText("Oct");
		
		WebElement c = driver.findElement(By.name("birthday_year"));
		Select s3 = new Select(c);
		s3.selectByIndex(26);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\snap\\FceBookLogin.png");
		FileUtils.copyFile(src, des);
			
	}

}
