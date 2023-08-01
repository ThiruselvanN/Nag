package com.adactinproject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.Base_Class;
import com.helperfile.FileReadManager;
import com.pojo.LoginPage;
import com.pom.PageObjectManagement;

public class Adactinclass extends Base_Class {
	
	public static void main(String[] args) throws IOException {
		
		driver=getbrowser("chrome");
		getUrl(FileReadManager.getInstance_FRM().getInstance_CR().get_Url());
		
		PageObjectManagement pom = new PageObjectManagement(driver);
		
		inputText(pom.getInstanceLP().getUsername(), FileReadManager.getInstance_FRM().getInstance_CR().get_Uname());
		inputText(pom.getInstanceLP().getPassword(), FileReadManager.getInstance_FRM().getInstance_CR().get_Pass());
		clickbutton(pom.getInstanceLP().getSubmit());
		
		dropDown(pom.getInstanceSearch().getLocation(),"byIndex", "2");
		
//		LoginPage lp = new LoginPage(driver);
//		
//		inputText(lp.getUsername(),"arvind19");
//		inputText(lp.getPassword(),"12345678");
//		clickbutton(lp.getSubmit());

		
//		WebElement username = driver.findElement(By.id("username"));
//		inputText(username, "arvind19");
//		
//		WebElement password = driver.findElement(By.id("password"));
//		inputText(password, "12345678");
//		
//		WebElement submit = driver.findElement(By.id("login"));
//		clickbutton(submit);
//		
//		WebElement location = driver.findElement(By.id("location"));
//        dropDown(location, "byIndex", "2");

	
	
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	

