package com.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class AddCategoryPage extends TestBase{
	
	@FindBy(xpath="//input[@name='categorydata']")
	WebElement AddCategory;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement AddCategoryButton;
	
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
	




}
