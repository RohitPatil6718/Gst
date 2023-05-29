package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Demo1 {
WebDriver driver;
	
	
	@Given("he lands there")
	public void he_lands_there() {
		System.setProperty("webdriver.chrome.driver","/home/minoiltu0051/eclipse-workspace/GST/Resources/chromedriver");
		
		
		 
		 driver = new ChromeDriver();
		 
		 
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
	  
	}

	@Then("they enters username & pass")
	public void they_enters_username_pass() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("student");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
	   
	}

	@Then("They clicks on login btn")
	public void they_clicks_on_login_btn() {
		
		driver.findElement(By.id("submit")).click();
	    
	}


}
