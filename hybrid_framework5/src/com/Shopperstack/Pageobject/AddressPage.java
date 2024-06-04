package com.Shopperstack.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	@FindBy(xpath = "//input[@name='Name']")
	private WebElement nametf;
	@FindBy(xpath = "//input[@name='House/Office Info']")
	private WebElement housenmetf;
	@FindBy(xpath = "//input[@name='Street Info']")
	private WebElement streettf;
	@FindBy(xpath = "//input[@name='Landmark']")
	private WebElement Landmarktf;
	@FindBy(xpath = "//input[@name='Pincode']")
	private WebElement pintf;
	@FindBy(xpath = "//input[@name='Phone Number']")
	private WebElement phonetf;
	@FindBy(xpath = "//select[@id='Country']")
	private WebElement countrydd;
	@FindBy(xpath = "//select[@id='State']")
	private WebElement statedd;
	@FindBy(xpath = "//select[@id='City']")
	private WebElement citydd;
	@FindBy(xpath = "//button[@id='addAddress']")
	private WebElement addbtn;
	public AddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement passname()
	{
		return nametf;
	}
	public WebElement passhname()
	{
		return housenmetf;
	}
	public WebElement passstreet()
	{
		return streettf;
	}
	public WebElement passlandmark()
	{
		return  Landmarktf;
	}
	public WebElement passpincode()
	{
		return  pintf;
	}
	public WebElement passphoneno()
	{
		return  phonetf;
	}
	public WebElement countryd()
	{
		return  countrydd;
	}
	public WebElement stated()
	{
		return  statedd;
	}
	public WebElement cityd()
	{
		return  citydd;
	}
	public WebElement addbtn1()
	{
		return  addbtn;
	}


}
