package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loginPage {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		

		 
		System.setProperty("webdriver.chrome.driver","/home/minoiltu0051/eclipse-workspace/GST/Resources/chromedriver");

	driver = new ChromeDriver();
	driver.get("https://qa-enterprise.mastersindia.co/login");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
	Thread.sleep(2000);
	    
	}

	@Then("user enters username")
	public void user_enters_username() throws InterruptedException {
		
	driver.findElement(By.id("username")).sendKeys("anshitmehrotra@mastersindia.co");
	Thread.sleep(2000);

	}

	@Then("user enters password")
	public void user_enters_password() throws InterruptedException {
	driver.findElement(By.id("password")).sendKeys("Test@123");
	Thread.sleep(2000);

	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);

	}

	@Then("verify Title of page")
	public void verify_title_of_page() throws InterruptedException {
	String title =driver.getTitle();
	System.out.println("Title of page is :- "+title);
		Thread.sleep(7000);
		
		driver.quit();
	}

	

}
