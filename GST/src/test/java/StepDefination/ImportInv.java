package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ImportInv {
	
	String path = "/home/minoiltu0051/eclipse-workspace/GST/Resources/Valid_b2b_invoice import.xlsx";
	String username ="anshitmehrotra@mastersindia.co";
	String password = "Test@123";		
	WebDriver driver;
	
	@Given("user1 navigates to login page")
	public void user1_navigates_to_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/minoiltu0051/eclipse-workspace/GST/Resources/chromedriver");
		
		
		 
		 driver = new ChromeDriver();
		 
		 
		driver.get("https://qa-enterprise.mastersindia.co/dashboard");
		driver.manage().window().maximize();
		System.out.println("browser lanuched");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
		
		Thread.sleep(2000);
	}

	@Given("user1 enters username & pass")
	public void user1_enters(String username, String password) throws InterruptedException {
	   
		
		driver.findElement(By.id("username")).sendKeys(username);
		//Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
	    
	}

	@Given("user1 clicks on login button")
	public void user1_clicks_on_login_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	   
	}

	@Then("user1 clicks on data import button")
	public void user1_clicks_on_data_import_button() throws InterruptedException {
		Thread.sleep(2000);
	}

	@Then("user1 clicks on import button")
	public void user1_clicks_on_import_button() throws InterruptedException {
		
		driver.findElement(By.id("menu-import")).click();
		Thread.sleep(3000);
	    
	}

	@Then("user1 will select document type from the dropdown")
	public void user1_will_select_document_type_from_the_dropdown() throws InterruptedException {
		
		WebElement DocType =driver.findElement(By.id("id=\"invoice_type\""));
		Select sel = new Select(DocType);
		List <WebElement> list = sel.getOptions();
	
	System.out.println("No of elements present in inv catagory dropdown are");
	list.size();	
	
	Thread.sleep(2000);
	
	for(int i=0;i<=list.size();i++) {
		
		String text = list.get(i).getText();
		
		if (text.equals("B2B/B2CL/B2CS/Revised")) {
			
	sel.selectByVisibleText("B2B/B2CL/B2CS/Revised");
			
			break;
		}
			
			
			}
	    
	}

	@Then("user1 clicks on choose file button")
	public void user1_clicks_on_choose_file_button() throws InterruptedException {
		
		WebElement choose_file = driver.findElement(By.xpath("//span[text()='Choose File']"));
		choose_file.sendKeys(path);
		Thread.sleep(2000);
	}

	@Then("user1 clicks on submit button")
	public void user1_clicks_on_submit_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(2000);
	}

	@Then("closes the browser")
	public void closes_the_browser() throws InterruptedException {
	    driver.quit();
	    Thread.sleep(2000);
	}


}
