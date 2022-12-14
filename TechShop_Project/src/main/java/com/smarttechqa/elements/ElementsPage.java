package com.smarttechqa.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smarttechqa.base.BaseClassTec;

public class ElementsPage extends BaseClassTec {

	ElementsPage(){
		PageFactory.initElements(driver, this);	
	}
	
	

	
		
		
		//How to store the elements 
		//Encapsulation in our framework. We want to make our elements private
		@FindBy(xpath = "//a[@href='/login']")
		@CacheLookup
		private WebElement loginButton;

		public WebElement getLoginButton() {
			return loginButton;
		}
		
		@FindBy(xpath = "//*[@type='email']")
		@CacheLookup
		private WebElement email;

		public WebElement getEmail() {
			return email;
		}

		
		@FindBy(id = "password")
		@CacheLookup
		private WebElement password;
		
		public WebElement getPassword() {
			return password;
		}
		
		@FindBy(name = "q")
		@CacheLookup
		private WebElement search;

		public WebElement getSearch() {
			return search;
		}
		
		@FindBy(xpath = "//button[text()='Search']")
		private WebElement searchButton;

		public WebElement getSearchButton() {
			return searchButton;
	
}
		
}
