package com.Step_Definition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.File.FileReaderManager;
import com.Sri_Project.Base_Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sdet_Sri.PageObjectManager;

public class Adactin_Step extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("user is  launch the  application")
	public void user_is_launch_the_application() throws IOException {

		getUrl(FileReaderManager.getInstance_Frm().get_Insttance_Cr().get_url());
	}

	@And("user is enter the username")
	public void user_is_enter_the_username() throws IOException {
		inputText(pom.getInstanceLPage().getUsename(),
				FileReaderManager.getInstance_Frm().get_Insttance_Cr().get_Uname());

	}

	@And("user is enter the password")
	public void user_is_enter_the_password() throws IOException {
		inputText(pom.getInstanceLPage().getPassword(),
				FileReaderManager.getInstance_Frm().get_Insttance_Cr().get_Pass());
	}

	@Then("user is enter thesubmit Button")
	public void user_is_enter_thesubmit_button() {
		clickButton(pom.getInstanceLPage().getLogin());
	}

	@Then("hotel area")
	public void hotel_area() {
		dropdown(pom.getInstanceSearch().getLoca(), "visibletext", "Paris");
		
	}
	@Then("hotel room")
	public void hotel_room() {
		dropdown(pom.getInstanceSearch().getHotel(), "byvalue", "Hotel Sunshine");
		dropdown(pom.getInstanceSearch().getRoom(), "byindex", "2");

	}



}
