package com.Shopperstack.basicTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Shopperstack.Pageobject.AddressPage;
import com.Shopperstack.Pageobject.Homepage;
import com.Shopperstack.Pageobject.LoginPage;

public class BasicPage implements FrameworkConstants {
	public WebDriver driver;
public	Properties pro;
public	 FileInputStream fis;
	 LoginPage ln;
  public	 WebDriverWait w;
  public 	  Homepage p;
 public Actions act;
 public AddressPage ad;
	 
	@BeforeClass
	public void openaplln() throws Exception
	{
		//System.setProperty(firefox_key, firefox_value);
		//driver=new FirefoxDriver();
		System.setProperty( chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 pro=new Properties();
		  fis=new FileInputStream("./Property/test.properties");
		 pro.load(fis);
		 
		 driver.get(pro.getProperty("url"));
		  w=new WebDriverWait(driver, 20);
		   p=new Homepage(driver);
		    act=new Actions(driver);
		     ad=new AddressPage(driver);
		    
	}
	@BeforeMethod
	public void Login()
	{
		 ln=new LoginPage(driver);
		 w.until(ExpectedConditions.visibilityOf(ln.LoginBtn()));
		 ln.LoginBtn().click();
		 w.until(ExpectedConditions.visibilityOf(ln.passemail()));
		 ln.passemail().sendKeys(pro.getProperty("email"));
		 w.until(ExpectedConditions.visibilityOf(ln.passpwd()));
		 ln.passpwd().sendKeys(pro.getProperty("password"));
		 w.until(ExpectedConditions.elementToBeClickable(ln.Lognbutton()));
		 ln.Lognbutton().click();
		 
	}

}
