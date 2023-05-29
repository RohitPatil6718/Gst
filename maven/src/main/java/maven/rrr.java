package maven;
package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class rrr {

	public static void main(String[] args) {
		
		
			String path = "/home/minoiltu0051/eclipse-workspace/GST/Resources/Valid_b2b_invoice import.xlsx";
			String username ="anshitmehrotra@mastersindia.co";
			String password = "Test@123";		
			WebDriver driver;
			
			@Given("user1 navigates to login page")
			public void gstuser_get_to_login_page() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","/home/minoiltu0051/eclipse-workspace/GST/Resources/chromedriver");
				
				
				 
				 driver = new ChromeDriver();
				 
				 
				driver.get("https://qa-enterprise.mastersindia.co/dashboard");
				driver.manage().window().maximize();
				System.out.println("browser lanuched");
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
					
				
				Thread.sleep(2000);
			}

			@Then("user1 enters username & pass")
			public void gst_user_enter_valid_username_passwd() throws InterruptedException {
			   
				
				driver.findElement(By.id("username")).sendKeys(username);
				//Thread.sleep(2000);
				
				driver.findElement(By.id("password")).sendKeys(password);
				Thread.sleep(2000);
			    
			}
		


	}

}
