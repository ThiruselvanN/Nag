package com.Selenium_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_Launch {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//webdriver methods
		//get
		driver.get("https://www.facebook.com/");
		//maximize
		driver.manage().window().maximize();
		//get title
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		//get current url
		String url = driver.getCurrentUrl();
		System.out.println("url: "+url);
		
		//navigation methods
		//to
		driver.navigate().to("https://www.instagram.com/");
		//back
		driver.navigate().back();
		//forward
		driver.navigate().forward();
		//refresh
		driver.navigate().refresh();
		
		//close
//		driver.close();
		//quit
		driver.quit();
		
		
		
	}

}
