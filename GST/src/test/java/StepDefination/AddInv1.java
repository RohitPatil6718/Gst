package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddInv1 {
	
	WebDriver driver;
	
	@Given("all user navigates to login page")
	public void all_user_navigates_to_login_page() {
		
		System.setProperty("webdriver.chrome.driver","/home/minoiltu0051/eclipse-workspace/GST/Resources/chromedriver");
		
		
		 
		 driver = new ChromeDriver();
		 
		 
		driver.get("https://qa-enterprise.mastersindia.co/dashboard");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
	//	Thread.sleep(2000);
	    
	}

	@Then("user enters valid anshitmehrotra@mastersindia.co & Test@{int}")
	public void user_enters_valid_anshitmehrotra_mastersindia_co_test(Integer int1) {
	    
	}

	@Then("all clicks on login button")
	public void all_clicks_on_login_button() {
	   
	}

	@Then("all user gets on home page and verify Title")
	public void all_user_gets_on_home_page_and_verify_title() {
	    
	}

	@Then("all user clicks on data import button")
	public void all_user_clicks_on_data_import_button() {
	   
	}

	@Then("all user clicks on add invoice button")
	public void all_user_clicks_on_add_invoice_button() {
	   
	}

	@Then("all user selects invoice catagory from dropdown")
	public void all_user_selects_invoice_catagory_from_dropdown() {
	    
	}

	@Then("all user Selects invoice type from dropdown")
	public void all_user_selects_invoice_type_from_dropdown() {
	    
	}

	@Then("he user Enters Arundhati")
	public void he_user_enters_arundhati() {
	    
	}

	@Then("he user Enters 27AAFCA1026J1ZZ")
	public void he_user_enters_27aafca1026j1zz() {
	   
	}

	@Then("he user Enters 3857dj")
	public void he_user_enters_3857dj() {
	   
	}

	@Then("all user selects invoice date")
	public void all_user_selects_invoice_date() {
	    
	}

	@Then("all user selects supply type from dropdown")
	public void all_user_selects_supply_type_from_dropdown() {
	   
	}

	@Then("all user selects place of supply  from dropdown")
	public void all_user_selects_place_of_supply_from_dropdown() {
	   
	}

	@Then("all user selects GSTR1 return period")
	public void all_user_selects_gstr1_return_period() {
	  
	}

	@Then("all user selects Reverse charge from dropdown")
	public void all_user_selects_reverse_charge_from_dropdown() {
	    
	}

	@Then("all user selects is amended or not")
	public void all_user_selects_is_amended_or_not() {
	    
	}

	@Then("all user clicks on add line item button")
	public void all_user_clicks_on_add_line_item_button() {
	   
	}

	@Then("he user enters 3848dka")
	public void he_user_enters_3848dka() {
	    
	}

	@Then("he user enters Chairs")
	public void he_user_enters_chairs() {
	   
	}

	@Then("he user enters {int}")
	public void he_user_enters(Integer int1) {
	   
	}

	@Then("all user selects UQC from dropdown")
	public void all_user_selects_uqc_from_dropdown() {
	   
	}

	@Then("he user Enters {int}")
	public void he_user_enterss(Integer int1) {
	  
	}

	@Then("all user clicks on save changes ri8 tick")
	public void all_user_clicks_on_save_changes_ri8_tick() {
	    
	}

	@Then("all user will click on submit button")
	public void all_user_will_click_on_submit_button() {
	   
	}

	@Then("all user closes browser")
	public void all_user_closes_browser() {
	    
	}

}
