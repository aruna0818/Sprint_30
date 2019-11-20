package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PojoClass extends BaseClass{
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(id="email")
		private WebElement userName;


		@FindBy(id="pass")
		private WebElement passWord;
		
		@FindBy(id="loginbutton")
		private WebElement login;

		public WebElement getUserName() {
			return userName;
		}

		public WebElement getPassWord() {
			return passWord;
		}

		public WebElement getLogin() {
			return login;
		}
	
	
		

	

	

}
