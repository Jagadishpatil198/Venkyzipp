package com.Shopperstack.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	@FindBy(xpath = "//a[text()='Men']")
	private WebElement men;
	@FindBy(xpath = "//a[text()='T-shirts']")
	private WebElement Tshirtbtn;
	@FindBy(xpath = "//a[text()='men']")
	private WebElement ment;
	@FindBy(xpath = "(//button[text()='add to cart'])[2]")
	private WebElement addtocart;
	@FindBy(xpath = "//a[@id='cart']")
	private WebElement carticon;
	@FindBy(xpath = "//span[text()='Buy Now']")
	private WebElement buynow;
	@FindBy(xpath = "//span[text()='Add New Address']")
	private WebElement address;

	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement clickmen()
	{
		return men;
	}
	public WebElement Tshirt()
	{
		return Tshirtbtn;
	}
	public WebElement mentshirt()
	{
		return ment;
	}
	public WebElement addtocarrt()
	{
		return addtocart;
	}
	public WebElement carticon1()
	{
		return carticon;
	}
	public WebElement buynow1()
	{
		return buynow;
	}
	public WebElement addressbtn()
	{
		return address;
	}
	
	
	
}
