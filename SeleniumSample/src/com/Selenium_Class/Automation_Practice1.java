package com.Selenium_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_Practice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@class='product_img_link']")).click();
		Thread.sleep(5000);

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();

		WebElement size = driver.findElement(By.id("group_1"));
		Select s = new Select(size);
		s.selectByIndex(1);
		
		driver.findElement(By.name("Blue")).click();
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
