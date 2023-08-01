package com.Selenium_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_Relative {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Thirus");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Doly");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9943088143");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Rithuska");
	}

}
