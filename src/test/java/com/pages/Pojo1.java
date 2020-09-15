package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseAdactin;

public class Pojo1 extends BaseAdactin{
	
	public Pojo1(){
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement lgb;
	
	
	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLgb() {
		return lgb;
	}
	
	public void login(String userName, String password) {
		
		fill(getUser(), userName);
		fill(getPass(), password);
		

	}
	
	public void loginClick() {
		
		clik(getLgb());

	}


}
