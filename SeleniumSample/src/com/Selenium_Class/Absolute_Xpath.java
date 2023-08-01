package com.Selenium_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone&rh=n%3A1389401031&ref=nb_sb_noss");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]"
				+ "/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
