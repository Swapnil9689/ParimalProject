package com.QA.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.TestBase.DemoWeb_TestBase;

public class DemoWeb_HomePage extends DemoWeb_TestBase {
	
	//Constructor initialization for hidden elements 
	public DemoWeb_HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	//Elements initialization and implementation
	
	@FindBy(xpath = "//a[@class='login']")
	WebElement SignInButton;
	public void ClickOnSignInButton() {
		SignInButton.click();
	}
	
	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement SearchTestBox;
	@FindBy(xpath = "//button[@name='submit_search']")
	WebElement SearchButton;
	public void CheckSearchBox(String TextInput) {
		SearchTestBox.sendKeys(TextInput);
		SearchButton.click();
	}
	
	@FindBy(xpath = "//a[@title='View my shopping cart']")
	WebElement AddToCartButton;
	public void CheckAddToCartButton(){
		AddToCartButton.click();
	}
	
	@FindBy(xpath = "//a[@title='Women']")
	WebElement WomenTab;
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	WebElement DressTab;
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	WebElement TShirtTab;
	public void CheckMajorTabs() {
		WomenTab.click();
		driver.navigate().back();
		DressTab.click();
		driver.navigate().back();
		TShirtTab.click();
	}
	
	@FindBy(xpath = "//a[@class = 'blockbestsellers']")
	WebElement BestSellerBlock;
	@FindBy(xpath = "//a[@class = 'homefeatured']")
	WebElement PopularBlock;
	public void CheckSubBlocks() {
		BestSellerBlock.click();
		PopularBlock.click();
	}
}
