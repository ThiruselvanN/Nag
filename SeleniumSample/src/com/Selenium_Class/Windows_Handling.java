package com.Selenium_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Robot rb = new Robot();
		Actions ac = new Actions(driver);
		
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		ac.contextClick(mobiles).perform();
		
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement customer = driver.findElement(By.linkText("Customer Service"));
		ac.contextClick(customer).perform();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement fashion = driver.findElement(By.linkText("Fashion"));
		ac.contextClick(fashion).perform();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		for(String id : windowHandles) {
			
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
			
		}
	}

}
