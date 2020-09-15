package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseAdactin;

public class Pojo4 extends BaseAdactin{
	
	public Pojo4(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement cardNum;
	
	@FindBy(id="cc_type")
	private WebElement cardTyp;
	
	@FindBy(id="cc_exp_month")
	private WebElement mon;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bknow;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getCardTyp() {
		return cardTyp;
	}

	public WebElement getMon() {
		return mon;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBknow() {
		return bknow;
	}
	
	public void bookHotel(String FirstName, String LastName, String BillingAddress, String CreditCardNo, String CreditCardType, String ExpiryDateMonth, String ExpiryDateYear, String CVVNumber) {

		fill(getFname(),FirstName);
		fill(getLname(),LastName);
		fill(getAdd(),BillingAddress);
		fill(getCardNum(),CreditCardNo);
		drdp(getCardTyp(),CreditCardType);
		drdp(getMon(),ExpiryDateMonth);
		drdp(getYear(),ExpiryDateYear);
		fill(getCvv(),CVVNumber);
		
	}
	
	public void booknowBtn() {

		clik(getBknow());
		
	}
	
	public void booking(String FirstName, String LastName, String BillingAddress,String CreditCardNo,String ExpiryDateMonth, String ExpiryDateYear, String CVVNumber) {

		fill(getFname(),FirstName);
		fill(getLname(),LastName);
		fill(getAdd(),BillingAddress);
		fill(getCardNum(),CreditCardNo);
		drdp(getMon(),ExpiryDateMonth);
		drdp(getYear(),ExpiryDateYear);
		fill(getCvv(),CVVNumber);
		clik(getBknow());
		
	}

}
