package com.Selenium_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Class {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//single dropdown
		//selectByIndex
		WebElement a = driver.findElement(By.id("dropdown1"));
		Select s1 = new Select(a);
		s1.selectByIndex(3);
		//selectBy VisibleText
		WebElement b = driver.findElement(By.name("dropdown2"));
		Select s2 = new Select(b);
		s2.selectByVisibleText("Appium");
		//selectBy value
		WebElement c = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select s3 = new Select(c);
		s3.selectByValue("4");
		//isMultiple
		boolean d = s3.isMultiple();
		System.out.println("ismultiple: "+d);
		System.out.println("*************************************************************************************");
		
		//multiple dropdown
		WebElement e = driver.findElement(By.xpath("(//select)[6]"));
		Select s4 = new Select(e);
		s4.selectByValue("3");
		s4.selectByIndex(1);
		s4.selectByVisibleText("Loadrunner");
		//isMultiple
		boolean f = s4.isMultiple();
		System.out.println("isMultiple: "+f);
		System.out.println("**************************************************************************************");
		
		//getoptions
		List<WebElement> l = s4.getOptions();
//		for (int i =0; i<l.size(); i++) {
//		System.out.println(l.get(i).getText());
//		}
		for (WebElement w:l) {
			System.out.println(w.getText());
		}
		System.out.println("*****************************************************************************************");
		//getAllSelectedOptions
		List<WebElement> l1 = s4.getAllSelectedOptions();
		for (int i=0; i<l.size(); i++) {
			System.out.println(l1.get(i).getText());
			
		}
		System.out.println("******************************************************************************************");
		//getFirstSelectedOption
		WebElement g = s4.getFirstSelectedOption();
		System.out.println(g.getText());
		
		//deselectall
		//s4.deselectAll();
		
		s4.deselectByValue("3");
		s4.deselectByIndex(1);
		s4.deselectByVisibleText("UFT/QTP");
		
	
		
		
	}

}
