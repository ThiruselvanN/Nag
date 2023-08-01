package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;   //Null driver
	public static WebDriver getbrowser(String browsername) {
		
		if(browsername.equalsIgnoreCase("CHROME")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nbhuv\\eclipse-workspace\\SeleniumSample\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("Edge")) {
			
			System.setProperty("webdriver.edge.driver","C:\\Users\\nbhuv\\eclipse-workspace\\SeleniumSample\\driver\\msedgedriver.exe" );
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	public static void clickbutton(WebElement element) {
		element.click();
	}
	public static void inputText(WebElement element , String value) {
		element.sendKeys(value);

	}
	public static void getUrl(String url) {
        driver.get(url);
	}
	public static void close() {
        driver.close();
	}
	//element,String,String   dropdown
	public static void dropDown(WebElement element, String type, String value) {
		Select s = new Select(element);
		
		if(type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		}
		else if (type.equalsIgnoreCase("byIndex")) {
			int Index = Integer.parseInt(value);   //String conver to int
			s.selectByIndex(Index);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}