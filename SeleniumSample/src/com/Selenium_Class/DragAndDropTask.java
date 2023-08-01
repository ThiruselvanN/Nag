package com.Selenium_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTask {
	public static void main(String[] args) {
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\driver\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			
			Actions act = new Actions(driver);
			WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
			WebElement drop = driver.findElement(By.id("amt7"));
			act.dragAndDrop(drag, drop).build().perform();
			
			WebElement drag1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
			WebElement drop1 = driver.findElement(By.id("amt8"));
			act.dragAndDrop(drag1, drop1).build().perform();
			
			WebElement drag2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
			WebElement drop2 = driver.findElement(By.id("bank"));
			act.dragAndDrop(drag2, drop2).build().perform();
			
			WebElement drag3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
			WebElement drop3 = driver.findElement(By.id("loan"));
			act.clickAndHold(drag3).moveToElement(drop3).build().perform();
	}

}
