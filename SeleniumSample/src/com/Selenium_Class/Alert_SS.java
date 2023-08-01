package com.Selenium_Class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_SS {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		
		//single alert
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		Thread.sleep(3000);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		
		//confirm alert
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		Thread.sleep(3000);
		Alert a2 = driver.switchTo().alert();
		a2.dismiss();
		
		//prompt alert
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		Thread.sleep(3000);
		Alert a3 = driver.switchTo().alert();
		a3.sendKeys("Thiru");
		a3.accept();
		
		String prompt = driver.findElement(By.xpath("//p[@id='result1']")).getText();
		System.out.println(prompt);
		
	
		//Take screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\snap\\Prompt.png");
		FileUtils.copyFile(from, to);
		
	}

}
