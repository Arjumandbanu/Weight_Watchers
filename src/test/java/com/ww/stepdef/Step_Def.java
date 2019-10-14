package com.ww.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ww.common.Common;
import com.ww.objectrepo.Object_Repo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def {

	WebDriver driver;
	Object_Repo ob;
	
	@Given("^User Open a dafault Browser$")
	public void user_Open_a_dafault_Browser() throws Throwable {
		
		
       driver=Common.getbrowser("Mozila",driver); 
	  
	    
	}

	@When("^User in home weightwatchers page$")
	public void user_in_home_weightwatchers_page() throws Throwable {
	   
		driver.get(Common.getGetURL());
		Thread.sleep(5000);
	    ob = PageFactory.initElements(driver,Object_Repo.class);
	}

	@When("^Verify that the loaded page title Contains Weight Loss$")
	public void verify_that_the_loaded_page_title_Contains_Weight_Loss() throws Throwable {
		
		System.out.println("Verifications Results are below:");
		driver.getTitle();
		System.out.println(driver.getTitle());

		if (driver.getTitle().contains("WW (Weight Watchers): Weight Loss & Wellness Help")) {
			System.out.println(" Page Title verified and passed ");
		} else {
			System.out.println(" Page verification Failed ");
			
		}  
		System.out.println("==========================");
	    
	}
	

	@When("^User click on Find a studio$")
	public void user_click_on_Find_a_studio() throws Throwable {
	
		ob.getFind_a_StudioButton().click();	
		Thread.sleep(5000);
	    
	    
	}

	@When("^Verify that loaded page title contains Meetings Near You$")
	public void verify_that_loaded_page_title_contains_Meetings_Near_You() throws Throwable {
		
		Thread.sleep(5000);
	    driver.getTitle();
	    System.out.println(driver.getTitle());

		if (driver.getTitle().contains("Find A Meeting | WW USA")) {
			System.out.println("Page title verified and passed");
		} else {
			System.out.println("Page Title verification Failed");

		}
		System.out.println("==========================");
	}

	
	@When("^User enters zip code as \"([^\"]*)\" search for meetings In the search field$")
	public void user_enters_zip_code_as_search_for_meetings_In_the_search_field(String arg1) throws Throwable {
	   
	    ob.getZipCode_Field().sendKeys(arg1);
	}

	
	@When("^Click on arrow Button$")
	public void click_on_arrow_Button() throws Throwable {
	    ob.getClick_on_arrow_Button().click();
	    
	}

	
	@When("^Print the title of the first result and the distance$")
	public void print_the_title_of_the_first_result_and_the_distance() throws Throwable {
		
		Thread.sleep(5000);
		
		System.out.print("The first search result is  "
		+ '\n' + driver.findElement(By.xpath("//div[@class='location'][1]")).getText());
		Common.SS(driver,"First_Search"); //Taking screenshot to verify the current page with the next page
		
		    
	}

	
	@When("^User click on the first search result$")
	public void user_click_on_the_first_search_result() throws Throwable {
		
		ob.getfirst_search_result().click();
		System.out.println("" + '\n'+"==========================");
		Thread.sleep(5000);
	    
	}

	@When("^User Verify that displayed location name matches with the name of the first searched$")
	public void user_Verify_that_displayed_location_name_matches_with_the_name_of_the_first_searched() throws Throwable {
		
		
		driver.getTitle();
		if (driver.getTitle().contains("14 W 23RD ST 2ND FL")) {
			System.out.println("First searched name is mached");
		} else {
			System.out.println("Displayed location DOES NOT matches with the name of the first searched");
		}
		Thread.sleep(5000);
		Common.SS(driver,"Verifying_with_first_ScreShot"); //Taking Screenshot of the page to verify with the previous page
		System.out.println("==========================");
	}
	
	

	@When("^User Print TODAYs hours of operation from this location page$")
	public void user_Print_TODAYs_hours_of_operation_from_this_location_page() throws Throwable {
	    
		System.out.println("Today's Operating Hour is: "  
				+ '\n' + driver.findElement(By.xpath("//div[@class='hours-list-item-wrapper hours-list--currentday']")).getText());
		System.out.println("==========================");
	}

	
	
	@Then("^User cloes the browser$")
	public void user_cloes_the_browser() throws Throwable {
	    
	    driver.quit();
		
	}


}
