package com.Selenium_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\nbhuv\\eclipse-workspace\\Selenium_8AM_May\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("thiru@123gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		//Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement w = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
		w.click();
		
		driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("Thirus");
		driver.findElement(By.xpath("(//input[@data-validate='isName'])[2]")).sendKeys("doly");
		driver.findElement(By.xpath("//input[@data-validate='isPasswd']")).sendKeys("Kasthuri");

		WebElement a = driver.findElement(By.id("days"));
		Select s1 = new Select(a);
		s1.selectByIndex(15);

		WebElement b = driver.findElement(By.id("months"));
		Select s2 = new Select(b);
		s2.selectByIndex(10);

		WebElement c = driver.findElement(By.id("years"));
		Select s3 = new Select(c);
		s3.selectByIndex(27);

		driver.findElement(By.name("company")).sendKeys("Greens");
		driver.findElement(By.id("address1")).sendKeys("no.143,Thomas street");
		driver.findElement(By.id("address2")).sendKeys("Porur");

		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("Chennai");

		WebElement d = driver.findElement(By.id("id_state"));
		Select s4 = new Select(d);
		s4.selectByVisibleText("New York");

		driver.findElement(By.xpath("//input[@class='form-control uniform-input text']")).sendKeys("12345");
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("am a student");
		driver.findElement(By.id("phone_mobile")).sendKeys("9943088143");
		driver.findElement(By.id("alias")).sendKeys("Mexico");
		driver.findElement(By.id("submitAccount")).click();
		

	}

}
