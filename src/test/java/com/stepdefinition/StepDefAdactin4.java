package com.stepdefinition;

import com.base.BaseAdactin;
import com.manager.PageObjectManager;
import com.pages.Pojo1;
import com.pages.Pojo2;
import com.pages.Pojo3;
import com.pages.Pojo4;
import com.pages.Pojo5;
import com.pages.Pojo6;
import com.pages.Pojo7;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefAdactin4 extends BaseAdactin {

	PageObjectManager pageObjectManager;
	Pojo1 loginPage;
	Pojo2 searchHotelPage;
	Pojo3 selectHotelPage;
	Pojo4 bookNowPage;
	Pojo5 orderPage;

	@Given("User on adactin page")
	public void user_on_adactin_page() {

		launchApp();
		url("http://adactinhotelapp.com/");
	}

	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String userName, String password) {

		pageObjectManager = PageObjectManager.getPageObjectManager();
		loginPage = pageObjectManager.getPojo1();
		loginPage.login(userName, password);
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {

		loginPage.loginClick();
	}

	@When("User should select {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_select(String location, String hotel, String roomType, String noOfRooms, String cInDate,
			String cOutDate, String adultsPerRoom, String childrenPerRoom) {

		searchHotelPage = pageObjectManager.getPojo2();
		searchHotelPage.searchHotel(location, hotel, roomType, noOfRooms, cInDate, cOutDate, adultsPerRoom,
				childrenPerRoom);

	}

	@When("User should click the search button")
	public void user_should_click_the_search_button() {

		searchHotelPage.searchBtn();
	}

	@When("User should select the radio button")
	public void user_should_select_the_radio_button() {

		selectHotelPage = pageObjectManager.getPojo3();
		selectHotelPage.selectHotel();
	}

	@When("User should click the continue button")
	public void user_should_click_the_continue_button() {

		selectHotelPage.continueBtn();

	}

	@When("User should Enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_Enter(String FirstName, String LastName, String BillingAddress, String CreditCardNo,
			String CreditCardType, String ExpiryDateMonth, String ExpiryDateYear, String CVVNumber) {

		bookNowPage = pageObjectManager.getPojo4();
		bookNowPage.bookHotel(FirstName, LastName, BillingAddress, CreditCardNo, CreditCardType, ExpiryDateMonth,
				ExpiryDateYear, CVVNumber);
	}

	@When("User should click the Book Now button")
	public void user_should_click_the_Book_Now_button() {

		bookNowPage.booknowBtn();

	}

	@Then("User should verify Order No")
	public void user_should_verify_Order_No() {

		orderPage = pageObjectManager.getPojo5();
		orderPage.orderId();
		orderPage.lgbtnClick();
	}

}
