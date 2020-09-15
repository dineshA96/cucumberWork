package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseAdactin;

public class Pojo3 extends BaseAdactin {
	
	public Pojo3(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement rad;
	
	@FindBy(id="continue")
	private WebElement btn;

	public WebElement getRad() {
		return rad;
	}

	public WebElement getBtn() {
		return btn;
	}
	
	public void selectHotel() {

		clik(getRad());
		
	}
	
	public void continueBtn() {

		clik(getBtn());
		
	}

}
