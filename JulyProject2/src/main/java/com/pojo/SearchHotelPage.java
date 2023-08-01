package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	
	public static WebDriver driver;    //Null driver
	
	@FindBy(id="location")
	private WebElement location;
	
	public SearchHotelPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return location;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
