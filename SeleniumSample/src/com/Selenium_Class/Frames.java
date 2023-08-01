package com.Selenium_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");

		// size of Frame
		List<WebElement> l = driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames: " + l.size());

		// Single Frame
		WebElement Single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(Single); // from window to frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Single Frame");
		driver.switchTo().defaultContent(); // from frame to window
		Thread.sleep(3000);

		// Multiple Frame
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement Outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(Outer);
		WebElement Inner = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])"));
		driver.switchTo().frame(Inner);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Multiple Frame");

	}

}
