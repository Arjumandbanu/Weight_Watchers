package com.ww.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Repo {

	WebDriver driver;
	public Object_Repo (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
         
	}

	@FindBy (xpath= "(//span[contains(text(),'Find a Studio')])[1]")
	private WebElement Find_a_StudioButton;
	public WebElement getFind_a_StudioButton() {
		return Find_a_StudioButton;
	}


	@FindBy (xpath= "(//input[@type='text'])[1]")
	private WebElement ZipCode_Field;
	public WebElement getZipCode_Field() {
		return ZipCode_Field;
	}
	@FindBy (xpath= "(//button[@type='button'])[1]")
	private WebElement Click_on_arrow_Button;
	public WebElement getClick_on_arrow_Button() {
		return Click_on_arrow_Button;
	}
	@FindBy (xpath= "(//div[@class='location__top'])[1]")
	private WebElement first_search_result;
	public WebElement getfirst_search_result() {
		return first_search_result;
	}
}
