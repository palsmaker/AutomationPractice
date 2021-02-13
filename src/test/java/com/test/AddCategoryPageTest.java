package com.test;

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
	
	@Test
	public void EnterNewCategoryTest() {
		String newCategory = addCategoryPage.EnterNewCategory();
		Assert.assertEquals(newCategory, "Pink");
		System.out.println("Pink");	
	}
	
	@Test
	public void EnterAddCategoryButton() {
		addCategoryPage.EnterAddCategoryButon();
	
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
