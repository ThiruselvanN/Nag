package com.Selenium_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_New {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//Single dropdown
		
		WebElement single = driver.findElement(By.id("dropdown1"));
		Select s = new Select(single);
		
		boolean single_multi = s.isMultiple();
		System.out.println("Single or multi: "+single_multi);
		
		s.selectByIndex(1);
		
		Thread.sleep(3000);
		WebElement single1 = driver.findElement(By.name("dropdown2"));
		Select s1 = new Select(single1);
		
		s1.selectByValue("3");
		
		Thread.sleep(3000);
		WebElement single2 = driver.findElement(By.id("dropdown3"));
		Select s2 = new Select(single2);
		
		s2.selectByVisibleText("Loadrunner");
		System.out.println("******************Multiple Dropdown************************");
		Thread.sleep(3000);
		
		//Multiple dropdown
		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
		Select m = new Select(multi);
		
		boolean single_multiple = m.isMultiple();
		System.out.println("single or multi: "+single_multiple);
		
		List<WebElement> multi_dropdown = m.getOptions();
		
		for(WebElement i : multi_dropdown) {
			System.out.println(i.getText());
		}
		
		int size = multi_dropdown.size();
		System.out.println("size of DD: "+size);
		
		for(int i=0; i<size; i++) {
			
			if(i==1 || i==3 || i==5) {
				m.selectByIndex(i);
			}
		}
		System.out.println("**************** get AllSelected Items *********************");
		
		List<WebElement> as = m.getAllSelectedOptions();
		
		for(WebElement j : as) {
			System.out.println(j.getText());
		}
		 System.out.println("******************* get FirstSelected ***********************");
		 
		 WebElement fs = m.getFirstSelectedOption();
		 System.out.println(fs.getText());
		
		 System.out.println("******************** Deselected task ************************************");
		 
		m.deselectByIndex(3);	
		List<WebElement> dsi = m.getAllSelectedOptions();
		
		for(WebElement k : dsi) {
			System.out.println("dselect by index:" +k.getText());
		}
		
		m.deselectAll();
		List<WebElement> dsa = m.getAllSelectedOptions();
		
		for(WebElement l : dsa) {
			System.out.println("deselect all:" +l.getText());
		}
		
		
		
	}

}
