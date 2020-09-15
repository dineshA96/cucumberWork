package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseAdactin;

public class Pojo2 extends BaseAdactin{
	
	public Pojo2(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="location")
	private WebElement dd1;

	@FindBy(id="hotels")
	private WebElement dd2;

	@FindBy(id="room_type")
	private WebElement dd3;
	
	@FindBy(id="room_nos")
	private WebElement dd4;
	
	@FindBy(id="datepick_in")
	private WebElement dat1;
	
	@FindBy(id="datepick_out")
	private WebElement dat2;
	
	@FindBy(id="adult_room")
	private WebElement dd5;
	
	@FindBy(id="child_room")
	private WebElement dd6;
	
	@FindBy(id="Submit")
	private WebElement btn;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookItineraryBtn;
	
	public WebElement getDd1() {
		return dd1;
	}

	public WebElement getDd2() {
		return dd2;
	}

	public WebElement getDd3() {
		return dd3;
	}

	public WebElement getDd4() {
		return dd4;
	}

	public WebElement getDat1() {
		return dat1;
	}

	public WebElement getDat2() {
		return dat2;
	}

	public WebElement getDd5() {
		return dd5;
	}

	public WebElement getDd6() {
		return dd6;
	}
	
	public WebElement getBtn() {
		return btn;
	}
	
	public WebElement getBookItineraryBtn() {
		return bookItineraryBtn;
	}

	
	public void searchHotel(String location, String hotel, String roomType, String noOfRooms, String cInDate, String cOutDate, String adultsPerRoom, String childrenPerRoom) {

		drdp(getDd1(),location);
		drdp(getDd2(),hotel);
		drdp(getDd3(),roomType);
		drdp(getDd4(),noOfRooms);
			
		clearText(getDat1());
		fill(getDat1(),cInDate);
	
		clearText(getDat2());
		fill(getDat2(),cOutDate);
		
		drdp(getDd5(),adultsPerRoom);
		drdp(getDd6(),childrenPerRoom);
					
	}
	
	public void searchBtn() {
		clik(getBtn());

	}
	
	public void bookBtn() {

		clik(getBookItineraryBtn());
		
	}
	
	public void search(String location,String hotel,String roomType,String cInDate,String cOutDate) {

		drdp(getDd1(),location);
		drdp(getDd2(),hotel);
		drdp(getDd3(),roomType);
		clearText(getDat1());
		fill(getDat1(),cInDate);
		clearText(getDat2());
		fill(getDat2(),cOutDate);
	}

}
