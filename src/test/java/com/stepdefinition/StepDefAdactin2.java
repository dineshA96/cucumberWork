package com.stepdefinition;

import com.base.BaseAdactin;

import com.manager.PageObjectManager;
import com.pages.Pojo1;
import com.pages.Pojo2;
import com.pages.Pojo6;
import com.pages.Pojo7;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefAdactin2 extends BaseAdactin{
	
	PageObjectManager pageObjectManager;
	Pojo1 loginPage;
	Pojo2 searchHotelPage;
	Pojo6 bookItenaryPage;
	Pojo7 cancelBookingPage;
	
	@Given("User2 is in the adactin page")
	public void user2_is_in_the_adactin_page() {
	   
		launchApp();
		url("http://adactinhotelapp.com/");
	}

	@When("User2 should enter {string},{string} and {string}")
	public void user2_should_enter_and(String userName, String password, String id) {
		
		pageObjectManager = PageObjectManager.getPageObjectManager();
		
		loginPage = pageObjectManager.getPojo1();
		loginPage.login(userName, password);
		loginPage.loginClick();
		
		searchHotelPage = pageObjectManager.getPojo2();
		searchHotelPage.bookBtn();
		
		bookItenaryPage= pageObjectManager.getPojo6();
		bookItenaryPage.enterOrderId(id);
		bookItenaryPage.goButton();
		
	}

	@When("User2 should click the cancel button")
	public void user2_should_click_the_cancel_button() {
		
		cancelBookingPage= pageObjectManager.getPojo7();
		cancelBookingPage.checkBox();
		cancelBookingPage.cancelBtn();
		cancelBookingPage.alertHandle();
		
	}

}
