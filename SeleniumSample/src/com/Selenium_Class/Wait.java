package com.Selenium_Class;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//explicit wait
		WebElement amazon_cares = driver.findElement(By.xpath("(//a[@class='nav_a'])[4]"));
		WebDriverWait w = new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOf(amazon_cares));
		
		//fluent wait
		WebElement amazon_cares_new = driver.findElement(By.xpath("(//a[@class='nav_a'])[4]"));
		
     	FluentWait w1 = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(Exception.class);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
