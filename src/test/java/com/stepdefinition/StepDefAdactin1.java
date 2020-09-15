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

public class StepDefAdactin1 extends BaseAdactin {

	PageObjectManager pageObjectManager;
	Pojo1 loginPage;
	Pojo2 searchHotelPage;
	Pojo3 selectHotelPage;
	Pojo4 bookNowPage;
	Pojo5 orderPage;
	Pojo6 searchIdPage;
	Pojo7 cancelPage;

	@Given("User1 is on the adactin page")
	public void user1_is_on_the_adactin_page() {

		launchApp();
		url("http://adactinhotelapp.com/");

	}

	@When("User1 should enter {string} and {string}")
	public void user1_should_enter_and(String userName, String password) throws InterruptedException {

		pageObjectManager = PageObjectManager.getPageObjectManager();
		loginPage = pageObjectManager.getPojo1();
		loginPage.login(userName, password);

	}

	@When("User1 should click the login button")
	public void user1_should_click_the_login_button() {

		loginPage.loginClick();
	}

	@When("User1 should select {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user1_should_select(String location, String hotel, String roomType, String noOfRooms, String cInDate,
			String cOutDate, String adultsPerRoom, String childrenPerRoom) {

		searchHotelPage = pageObjectManager.getPojo2();
		searchHotelPage.searchHotel(location, hotel, roomType, noOfRooms, cInDate, cOutDate, adultsPerRoom,
				childrenPerRoom);

	}

	@When("User1 should click the search button")
	public void user1_should_click_the_search_button() {

		searchHotelPage.searchBtn();

	}

	@When("User1 should select the radio button")
	public void user1_should_select_the_radio_button() {

		selectHotelPage = pageObjectManager.getPojo3();
		selectHotelPage.selectHotel();

	}

	@When("User1 should click the continue button")
	public void user1_should_click_the_continue_button() {

		selectHotelPage.continueBtn();
	}

	@When("User1 should Enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user1_should_Enter(String FirstName, String LastName, String BillingAddress, String CreditCardNo,
			String CreditCardType, String ExpiryDateMonth, String ExpiryDateYear, String CVVNumber) {

		bookNowPage = pageObjectManager.getPojo4();
		bookNowPage.bookHotel(FirstName, LastName, BillingAddress, CreditCardNo, CreditCardType, ExpiryDateMonth,
				ExpiryDateYear, CVVNumber);

	}

	@When("User1 should click the Book Now button")
	public void user1_should_click_the_Book_Now_button() throws InterruptedException {

		bookNowPage.booknowBtn();
	}

	@Then("User1 should verify Order No")
	public void user1_should_verify_Order_No() {

		orderPage = pageObjectManager.getPojo5();
		orderPage.orderId();
	}

	@Then("User1 should click the myItinerary button")
	public void user1_should_click_the_myItinerary_button() {

		orderPage.myItClick();

	}

	@Then("User1 should Enter orderId and click goButton")
	public void user1_should_Enter_orderId_and_click_goButton() {

		searchIdPage = pageObjectManager.getPojo6();
		searchIdPage.searchId();
		searchIdPage.goButton();

	}

	@Then("User1 should select checkBox and cancelButton")
	public void user1_should_select_checkBox_and_cancelButton() {

		cancelPage = pageObjectManager.getPojo7();
		cancelPage.checkBox();
		cancelPage.cancelBtn();
	}

	@Then("User1 should handle the alert")
	public void user1_should_handle_the_alert() {

		cancelPage.alertHandle();
	}

}
