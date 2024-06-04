package com.Shopperstack.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "loginBtn")
	private WebElement loginbtn;
	@FindBy(xpath = "//button[text()='Shopper Login']")
	private WebElement shopperButton;
	@FindBy(xpath = "//input[@name='Email']")
	private WebElement email;
	@FindBy(xpath = "//input[@name='Password']")
	private WebElement pass;
	@FindBy(xpath = "//span[@class='MuiButton-label' and text()='Login']")
	private WebElement lgnbtn;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement LoginBtn()
	{
		return loginbtn;
	}
	public WebElement ShopperBtn()
	{
		return shopperButton;
	}
	public WebElement passemail()
	{
		return email;
	}
	public WebElement passpwd()
	{
		return pass;
	}
	public WebElement Lognbutton()
	{
		return lgnbtn;
	}

}
