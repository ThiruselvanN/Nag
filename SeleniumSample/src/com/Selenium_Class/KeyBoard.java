package com.Selenium_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class KeyBoard {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Robot r = new Robot(); //AWR - Application Window ToolKit
		WebElement mail = driver.findElement(By.name("email"));
		WebElement pwd = driver.findElement(By.name("pass"));

		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_U);
		r.keyRelease(KeyEvent.VK_U);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		
		pwd.click();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
	}

}
