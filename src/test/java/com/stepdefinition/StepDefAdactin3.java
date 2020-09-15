package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.base.BaseAdactin;

import com.manager.PageObjectManager;
import com.pages.Pojo1;
import com.pages.Pojo2;
import com.pages.Pojo3;
import com.pages.Pojo4;
import com.pages.Pojo5;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefAdactin3 extends BaseAdactin {

	PageObjectManager pageObjectManager;
	Pojo1 loginPage;
	Pojo2 searchHotelPage;
	Pojo3 selectHotelPage;
	Pojo4 bookNowPage;
	Pojo5 orderPage;

	@Given("User3 is on adactin page")
	public void user3_is_on_adactin_page() {

		launchApp();
		url("http://adactinhotelapp.com/");
	}

	@When("User3 should enter {string},{string}")
	public void user3_should_enter(String userName, String password) {

		pageObjectManager = PageObjectManager.getPageObjectManager();
		loginPage = pageObjectManager.getPojo1();
		loginPage.login(userName, password);
		loginPage.loginClick();
	}

	@When("User3 should select {string},{string},{string},{string},{string}{string},{string},{string},{string},{string},{string},{string}")
	public void user3_should_select(String Location, String Hotels, String RoomType, String

	CheckInDate, String CheckOutDate, String FirstName, String LastName, String BillingAddress,

			String CreditCardNo, String ExpiryDateMonth, String ExpiryDateYear, String CVVNumber,

			io.cucumber.datatable.DataTable dataTable) {

		searchHotelPage = pageObjectManager.getPojo2();
		searchHotelPage.search(Location, Hotels, RoomType, CheckInDate, CheckOutDate);

		List<Map<String, String>> m = dataTable.asMaps();
		Map<String, String> map = m.get(1);
		String noOfRooms = map.get("Number of Rooms");
		String adultsPerRoom = map.get("Adults per Room");
		String childrenPerRoom = map.get("Children per Room");

		drdp(searchHotelPage.getDd4(), noOfRooms);
		drdp(searchHotelPage.getDd5(), adultsPerRoom);
		drdp(searchHotelPage.getDd6(), childrenPerRoom);
		clik(searchHotelPage.getBtn());

		selectHotelPage = pageObjectManager.getPojo3();
		selectHotelPage.selectHotel();
		selectHotelPage.continueBtn();

		bookNowPage = pageObjectManager.getPojo4();
		bookNowPage.booking(FirstName, LastName, BillingAddress, CreditCardNo,

				ExpiryDateMonth, ExpiryDateYear, CVVNumber);

		String CreditCardType = map.get("Credit Card Type");
		drdp(bookNowPage.getCardTyp(), CreditCardType);
		clik(bookNowPage.getBknow());
	}

	@When("User3 should print the booking id")
	public void user3_should_print_the_booking_id() {
		
		//Assert.assertTrue(false);
		orderPage = pageObjectManager.getPojo5();
		orderPage.orderId();
		orderPage.lgbtnClick();

	}

}
