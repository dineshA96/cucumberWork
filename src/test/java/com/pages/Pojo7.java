package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseAdactin;

public class Pojo7 extends BaseAdactin{
	
	public Pojo7(){
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement checkBox;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement cancelBtn;
	
	public void checkBox() {
		
		clik(getCheckBox());
	}
	
	public void cancelBtn() {

		clik(getCancelBtn());
	}
	
	public void alertHandle() {

		Alert a=driver.switchTo().alert();
		a.accept();
	}

}
