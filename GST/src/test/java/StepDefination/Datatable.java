package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Datatable {
	
	
	
	WebDriver driver;
	@Given("user navigates to login page")
	public void user_navigates_to_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/minoiltu0051/eclipse-workspace/GST/Resources/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://qa-enterprise.mastersindia.co/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		System.out.println("browser launched");
			
		Thread.sleep(2000);
	}

	@Then("user entering credentials")
	public void user_entering_credentials(DataTable dataTable) throws InterruptedException {
		
		List<List<String>> data = dataTable.cells();
		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
		Thread.sleep(2000);
	    
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
		Thread.sleep(2000);
		System.out.println("entered credentials");

	}

	@Then("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		
	  	}
	
	@Then("checks title of homepage")
	public void checks_title_of_homepage() throws InterruptedException {
		
		String title = driver.getTitle();
		System.out.println("title of page is"+title);
		Thread.sleep(7000);
		
		driver.quit();
		System.out.println("browser closed");
	    
	}
	
}
