package com.Selenium_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a [@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Thirus");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("meow");
		driver.findElement(By.name("reg_email__")).sendKeys("9943088143");
		driver.findElement(By.id("password_step_input")).sendKeys("rithuska");
		
		//single dropdown
		//selectby index
		WebElement a = driver.findElement(By.id("day"));
		Select s1 = new Select(a);
		s1.selectByIndex(14);
		//selectby visibletext
		WebElement b = driver.findElement(By.id("month"));
		Select s2 = new Select(b);
		s2.selectByVisibleText("Oct");
		
		driver.findElement(By.xpath("//select[@aria-label='Year']")).sendKeys("1996");
		driver.findElement(By.xpath("(//input [@type='radio'])[2]")).click();
		
	}

}
