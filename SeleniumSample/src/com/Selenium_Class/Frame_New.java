package com.Selenium_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_New {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		//frame 1
		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		
		String text = frame1.getText();
		System.out.println("frame1: "+text);
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		//frame 2
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement frame2 = driver.findElement(By.id("Click1"));
		frame2.click();
		
		System.out.println("frame2: "+frame2.getText());
		driver.switchTo().defaultContent();
		
		//size of frame
		List<WebElement> frame_size = driver.findElements(By.tagName("iframe"));
		int size = frame_size.size();
		System.out.println("frame size: "+size);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
