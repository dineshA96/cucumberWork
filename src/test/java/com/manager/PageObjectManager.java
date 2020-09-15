package com.manager;

import com.base.BaseAdactin;
import com.pages.Pojo1;
import com.pages.Pojo2;
import com.pages.Pojo3;
import com.pages.Pojo4;
import com.pages.Pojo5;
import com.pages.Pojo6;
import com.pages.Pojo7;


public class PageObjectManager extends BaseAdactin{
	
	private static PageObjectManager pageObjectManager;
	private Pojo1 loginPage;
	private Pojo2 searchHotelPage;
	private Pojo3 selectHotelPage;
	private Pojo4 bookNowPage;
	private Pojo5 orderPage;
	private Pojo6 searchIdPage;
	private Pojo7 cancelPage;
	
	private PageObjectManager(){
		
	}
	
	public static PageObjectManager getPageObjectManager() {
		
		return (pageObjectManager==null) ? pageObjectManager=new PageObjectManager():pageObjectManager;
	}
	public  Pojo1 getPojo1() {
		
		return (loginPage==null) ? loginPage=new Pojo1():loginPage;
	}
	
	public  Pojo2 getPojo2() {
		
		return (searchHotelPage==null) ? searchHotelPage=new Pojo2():searchHotelPage;
	}
	public  Pojo3 getPojo3() {
		
		return (selectHotelPage==null) ? selectHotelPage=new Pojo3():selectHotelPage;
	}
	public  Pojo4 getPojo4() {
		
		return (bookNowPage==null) ? bookNowPage=new Pojo4():bookNowPage;
	}
	public  Pojo5 getPojo5() {
		
		return (orderPage==null) ? orderPage=new Pojo5():orderPage;
	}
    public  Pojo6 getPojo6() {
		
		return (searchIdPage==null) ? searchIdPage=new Pojo6():searchIdPage;
	}
 public  Pojo7 getPojo7() {
		
		return (cancelPage==null) ? cancelPage=new Pojo7():cancelPage;
	}
	
	
	
	
	
	
	
	
	

}
