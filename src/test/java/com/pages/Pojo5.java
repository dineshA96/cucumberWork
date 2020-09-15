package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseAdactin;

public class Pojo5 extends BaseAdactin {
	
	public Pojo5(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="order_no")
	private WebElement orno;
	
	@FindBy(id="my_itinerary")
	private WebElement myItBtn;
	
	@FindBy(id="logout")
	private WebElement logoutbtn;

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public WebElement getOrno() {
		return orno;
	}
	
	public WebElement getMyItBtn() {
		return myItBtn;
	}

	public void orderId() {
		
		outPut(orno);
	}
	
	public void myItClick() {
		
		clik(getMyItBtn());
	}
	
	public void lgbtnClick() {

		clik(getLogoutbtn());
	}

}
