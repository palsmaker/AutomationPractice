package com.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.TestBase;

public class AddCategoryPage extends TestBase{
	
	@FindBy(name="categorydata")
	WebElement AddCategory;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement AddCategoryButton;
	
	@FindBy(xpath="//input[@type='checkbox' and @name='allbox']")
	WebElement ToggleAllButton;
	
	//@FindBy(xpath="//input[contains(text(),' Toggle all ')]")
	//WebElement ToggleAllLabel;
	
	@FindBy(xpath="//input[@type= 'submit' and @value='Add category']")
		WebElement AddCategoryLabel;
	
	@FindBy(name="due_month")
	WebElement MonthDropDownLocator;
	
	
	public AddCategoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String EnterNewCategory() {
		AddCategory.sendKeys("Pink");
		return "Pink";
	}
	
	public void EnterAddCategoryButon() {
		AddCategoryButton.click();
		
	}
	
	public void ToggleAllBox() {
		ToggleAllButton.click();
	}
	
	//public boolean VerifyToggleAllLabel() {
		//return ToggleAllLabel.isDisplayed();}
	
	public boolean verifyAddCustomerLabel() {
		return AddCategoryLabel.isDisplayed();	
	}
	
	public boolean MonthDropDownLocatorOption() {
		return MonthDropDownLocator.isEnabled();
	}
	

	




}
