package com.Selenium_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElement_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\driver\\msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    //Id
	    WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys("Thiru@123");
	    //Name
	    WebElement password = driver.findElement(By.name("pass"));
	    password.sendKeys("12345");
	    password.clear();
	    password.sendKeys("Java");
	    
	    boolean displayed = email.isDisplayed();
	    System.out.println("displayed: "+displayed);
	    boolean enabled = email.isEnabled();
	    System.out.println("enabled: "+enabled);
	    
	    driver.findElement(By.name("login")).click();
	}

}
