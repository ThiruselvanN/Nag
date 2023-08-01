package com.Selenium_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/SearchHotel.php");
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("thirusdoly");
		driver.findElement(By.id("password")).sendKeys("Kasthuri");
		driver.findElement(By.id("login")).click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s1 = new Select(location);
		s1.selectByIndex(5);
		
		driver.findElement(By.id("hotels")).sendKeys("Hotel Hervey");
		driver.findElement(By.id("room_type")).sendKeys("Deluxe");
		driver.findElement(By.id("room_nos")).sendKeys("Two");
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("19/06/2022");
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("22/06/2022");
		
		WebElement adult = driver.findElement(By.cssSelector("[id='adult_room'][id='adult_room']"));
		Select s2 = new Select(adult);
		s2.selectByValue("2");
		
		driver.findElement(By.cssSelector("[id='child_room'][id='child_room']")).sendKeys("0");
		driver.findElement(By.cssSelector("#Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Thirus");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Doly");
		driver.findElement(By.cssSelector("[id='address'][id='address']")).sendKeys("143.mens hostel,porur");
		driver.findElement(By.cssSelector("#cc_num")).sendKeys("9876543212345678");
		
		driver.findElement(By.id("cc_type")).sendKeys("VISA");
		driver.findElement(By.id("cc_exp_month")).sendKeys("October");
		driver.findElement(By.name("cc_exp_year")).sendKeys("2022");
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
		driver.findElement(By.cssSelector("#book_now")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0, 800)");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[id='my_itinerary'][id='my_itinerary']")).click();
		
	}

}
