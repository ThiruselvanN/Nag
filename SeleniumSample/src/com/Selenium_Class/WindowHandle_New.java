package com.Selenium_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle_New {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		// Top offers
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		Actions a = new Actions(driver);

		WebElement top_offers = driver.findElement(By.xpath("//img[@alt='Top Offers']"));
		Thread.sleep(2000);
		a.contextClick(top_offers).build().perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// Grocery
		WebElement grocery = driver.findElement(By.xpath("//img[@alt='Grocery']"));
		Thread.sleep(2000);
		a.contextClick(grocery).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// Mobiles
		WebElement mobiles = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		Thread.sleep(2000);
		a.contextClick(mobiles).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// PARENT ID
		String parent_id = driver.getWindowHandle();
		System.out.println("parent id: " + parent_id);

		// Size
		int size = driver.getWindowHandles().size();
		System.out.println("size of the window: " + size);

		Set<String> allwindow = driver.getWindowHandles();
		// for(datatype i : refname)

		for (String window_title : allwindow) {

			String title = driver.switchTo().window(window_title).getTitle();
			System.out.println(title);

		}

		// driver.switchto().window(refname).gettitle().equalignorecase(titlerefname);

		String child_title = "Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
		for (String child : allwindow) {

			if (driver.switchTo().window(child).getTitle().equalsIgnoreCase(child_title)) {
            break;
			}
			

		}

		// close except parent

		// !refname.equals(parentrefname)

		// for(String closewindow: allwindow) {
//        	if(!closewindow.equals(parent_id)) {
//        		
//        		driver.switchTo().window(closewindow).close();
//        	}
//        }

	}
}
