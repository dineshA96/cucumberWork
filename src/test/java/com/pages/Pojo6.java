package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseAdactin;

public class Pojo6 extends BaseAdactin {
	
	public Pojo6(){
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement searchbox;
	
	@FindBy(id="search_hotel_id")
	private WebElement goBtn;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getGoBtn() {
		return goBtn;
	}
	
	public void searchId() {

		fill(getSearchbox(), orderId);
	}
	
	public void goButton() {
	
		clik(getGoBtn());
	}
	
	public void enterOrderId(String id) {               //task 2

		fill(getSearchbox(), id);
	}

}
