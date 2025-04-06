package com.keywordDrivenFreamwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepoOfSaucedemo {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

		public RepoOfSaucedemo(WebDriver wd) {
			PageFactory.initElements(wd, this);
			
		}
		
		@FindBy(id = "user-name")
	    private WebElement username;
		
		@FindBy(name = "password")
		private WebElement password;
		
		@FindBy(css = "inpute[value=\"Login\"]")
		private WrapsElement LoginBtn;
		
		@FindBy(id = "add-to-cart-sauce-labs-backpack")
		private WebElement addToCartBtn;

		@FindBy(css = "a[data-test=\"shopping-cart-link\"]")
		private WebElement goTocart;
		
		@FindBy(name = "checkout")
		private WebElement checkoutBtn;
		
		@FindBy (css = "Input[placeholder=\"First Name\"]")
		private WrapsElement firstname;
		
		@FindBy (id = "last-name")
		private WebElement lastname;
		
		@FindBy (id = "postal-code")
		private WebElement PostalCode;
		
		@FindBy(id = "continue")
		private WrapsElement ContinueBtn;
		
		@FindBy (id = "finish")
		private WrapsElement finishBtn;
		
		@FindBy(id = "react-burger-menu-btn")
		private WebElement logoutBtn;
		
		public void username1(String user) {
			username.sendKeys(user);
		}


	public void username(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addToCart() {
		// TODO Auto-generated method stub
		
	}


	public void logout() {
		// TODO Auto-generated method stub
		
	}

}
