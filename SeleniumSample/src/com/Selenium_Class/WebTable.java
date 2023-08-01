package com.Selenium_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");

		// header
		System.out.println("******************* Header **************************************************");
		List<WebElement> header = driver.findElements(By.xpath("//table/tbody/tr/th"));

		for (WebElement i : header) {
			System.out.println(i.getText());

		}
		// all data
		System.out.println("******************* all data *************************************************");
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));

		for (WebElement i1 : all_data) {
			System.out.println(i1.getText());

		}
		// specific column
		System.out.println("***************** specific column *********************************************");
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

		for (WebElement i2 : column) {
			System.out.println(i2.getText());

		}
		// specific row
		System.out.println("***************** specific row ************************************************");
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[6]/td"));

		for (WebElement i3 : row) {
			System.out.println(i3.getText());
		}
		// row size
		System.out.println("***************** row size ****************************************************");
		List<WebElement> row_size = driver.findElements(By.tagName("tr"));
		int r_size = row_size.size();
		System.out.println(r_size);

		// column size
		System.out.println("**************** column size **************************************************");
		List<WebElement> column_size = driver.findElements(By.tagName("td"));
		int c_size = column_size.size();
		System.out.println(c_size);

		// particular data
		System.out.println("****************** particular data ********************************************");
		List<WebElement> particular = driver.findElements(By.xpath("//table/tbody/tr[5]/td[2]"));
		
		for (WebElement i4 : particular) {
			System.out.println(i4.getText());
		}
		
		WebElement particular1 = driver.findElement(By.xpath("//td[normalize-space()='Handle Exceptions']//following::td[1]"));
		System.out.println(particular1.getText());
	

	}

}
