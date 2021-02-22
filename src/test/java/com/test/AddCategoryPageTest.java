package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.AddCategoryPage;

public class AddCategoryPageTest extends TestBase {
	
	
	AddCategoryPage addCategoryPage;
	
	
	public AddCategoryPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		addCategoryPage = new AddCategoryPage();		
	}
	
	@Test(priority=1)
	public void EnterNewCategoryTest() {
		String newCategory = addCategoryPage.EnterNewCategory();
		Assert.assertEquals(newCategory, "Pink");
		System.out.println("Pink");	
	}
	
	@Test (priority=3)
	public void EnterAddCategoryButton() {
		addCategoryPage.EnterAddCategoryButon();
	
	}
	
	@Test(priority=2)
	public void EnterToggleAllButton() {
		addCategoryPage.ToggleAllBox();
	}
	
	/*
	 * @Test public void VerifyToggleAllTest() { Boolean labelDetails =
	 * addCategoryPage.VerifyToggleAllLabel(); Assert.assertTrue(labelDetails); }
	 */
	
	@Test
	public void VerifyAddCustomerLabelTest() {
		Boolean Label = addCategoryPage.verifyAddCustomerLabel();
		Assert.assertTrue(Label);
		
	}
	

	/*
	 * Select sel = new
	 * Select(driver.findElement(By.xpath("//[@name='due_month']")));
	 * sel.selectByValue("3");
	 * 
	 * 
	 * if(sel.isMultiple()){
	 * 
	 * //Selecting multiple values by index sel.selectByValue("1");
	 * sel.selectByValue("2"); sel.selectByValue("3"); sel.selectByValue("4");
	 * sel.selectByValue("5"); sel.selectByValue("6"); sel.selectByValue("7");
	 * sel.selectByValue("8"); sel.selectByValue("9"); sel.selectByValue("10");
	 * sel.selectByValue("11"); sel.selectByValue("12"); }
	 * 
	 * 
	 */


	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
