package com.Selenium_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leafground.com/pages/drop.html");
			
			Actions act = new Actions(driver);
			WebElement drag = driver.findElement(By.id("draggable"));
			WebElement drop = driver.findElement(By.id("droppable"));
			
		//	act.dragAndDrop(drag, drop).build().perform();
			Thread.sleep(3000);
			act.clickAndHold(drag).moveToElement(drop).build().perform();
			
			
	}

}
