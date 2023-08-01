
package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pojo.LoginPage;
import com.pojo.SearchHotelPage;

public class PageObjectManagement {
	
	public static WebDriver driver; //Null driver
	private LoginPage lp;
	private SearchHotelPage sr;
	
	public PageObjectManagement(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	
	public LoginPage getInstanceLP() {
		lp = new LoginPage(driver);
		return lp;

	}
	public SearchHotelPage getInstanceSearch() {
		sr = new SearchHotelPage(driver);
		return sr;
	}
	

}
