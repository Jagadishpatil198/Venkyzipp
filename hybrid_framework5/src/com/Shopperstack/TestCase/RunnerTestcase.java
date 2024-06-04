package com.Shopperstack.TestCase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Shopperstack.basicTest.BasicPage;
import com.Shopperstack.basicTest.ReadExcel;

public class RunnerTestcase extends BasicPage {
	@Test
	public void runnapln() throws Exception
	{
		
		
		w.until(ExpectedConditions.visibilityOf(p.clickmen()));
		p.clickmen().click();
	//	act.moveToElement(p.clickmen()).perform();
		//p.mentshirt().click();
		//p.clickmen().click();
		act.moveByOffset(20, 20).click().perform();
		w.until(ExpectedConditions.elementToBeClickable(p.addtocarrt()));
		p.addtocarrt().click();
		w.until(ExpectedConditions.elementToBeClickable(p.carticon1()));
		p.carticon1().click();
		w.until(ExpectedConditions.elementToBeClickable(p.buynow1()));
		p.buynow1().click();
		w.until(ExpectedConditions.visibilityOf(p.addressbtn()));
		p.addressbtn().click();
		w.until(ExpectedConditions.visibilityOf(ad.passname()));
		ad.passname().sendKeys(ReadExcel.readdata("Sheet5", 1, 0));
		w.until(ExpectedConditions.visibilityOf(ad.passhname()));
		ad.passhname().sendKeys(ReadExcel.readdata("Sheet5", 1, 1));
		w.until(ExpectedConditions.visibilityOf(ad.passstreet()));
		ad.passstreet().sendKeys(ReadExcel.readdata("Sheet5", 1, 2));
		ad.passlandmark().sendKeys(ReadExcel.readdata("Sheet5", 1, 3));
		Select s=new Select(ad.countryd());
		s.selectByIndex(1);
		Select s1=new Select(ad.stated());
		s1.selectByIndex(1);
		Select s2=new Select(ad.cityd());
		s2.selectByIndex(1);
	//	w.until(ExpectedConditions.elementToBeClickable(ad.passpincode()));
		//ad.passpincode().sendKeys(ReadExcel.readdata("Sheet5", 2, 0));
		//w.until(ExpectedConditions.elementToBeClickable(ad.passphoneno()));
		//ad.passphoneno().sendKeys(ReadExcel.readdata("Sheet5", 2, 1));
		ad.passpincode().sendKeys(pro.getProperty("pincode"));
  ad.passphoneno().sendKeys(pro.getProperty("phoneno"));	
  ad.addbtn1().click();
		
	//	p.carticon().click();
		
		//p.mentshirt().click();
	}

}
