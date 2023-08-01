package com.Selenium_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver; //narrowing
		
		js.executeScript("window.scrollBy(0,5000)", "");  //scroll down
		Thread.sleep(3000);
		
//		js.executeScript("window.scrollBy(0,-2000)", ""); //scroll up
		
		
		WebElement amazon_device = driver.findElement(By.xpath("(//a[@class='nav_a'])[5]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", amazon_device);
		js.executeScript("arguments[0].click();", amazon_device);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
