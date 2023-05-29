package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddInv {
	
	WebDriver driver;
	String path = "/home/minoiltu0051/eclipse-workspace/GST/Resources/chromedriver";
	/*String HsnSac = "878dha";
	String InvNo = "dkdkah38";
	String Buyer_GSTIN = "27AAFCA1026J1ZZ";
	*/
	@Given("person getting to login page")
	public void person_getting_to_login_page() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/minoiltu0051/eclipse-workspace/GST/Resources/chromedriver");
		
		
		 
		 driver = new ChromeDriver();
		 
		 
		driver.get("https://qa-enterprise.mastersindia.co/dashboard");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
	//	Thread.sleep(2000);
	    
	}

	@Given("user enters {string} & {string}")
	public void user_enters(String username, String password) throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys(username);
		//Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
	    
	}
	@Then("hits on login button")
	public void hits_on_login_button() throws InterruptedException {
	    
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}

	@Then("user gets on home page and verify Title")
	public void user_gets_on_home_page_and_verify_title() throws InterruptedException {
		String title =driver.getTitle();
		System.out.println("Title of page is :- "+title);
			Thread.sleep(5000);
	    
	}
	
	@Then("user clicks on data import button")
	public void user_clicks_on_data_import() throws InterruptedException {
		
		driver.findElement(By.id("menu-import")).click();
		Thread.sleep(3000);
	}

	@Then("user clicks on add invoice button")
	public void user_clicks_on_add_invoice_button() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Add Invoice')]")).click();
		Thread.sleep(5000);

	}
	
	

	@Then("user selects invoice catagory from dropdown")
	public void user_selects_invoice_catagory_from_dropdown() throws InterruptedException {
		
	WebElement drp_InvCatagory =driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[3]"));
	drp_InvCatagory.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@title='Credit Note']")).click();
	//span[@class='ant-select-selection-search'])[3]

	//driver.findElement(By.xpath("//span[@title='Credit Note']")).click();
	
	
	
		/*Select sel = new Select(drp_InvCatagory);
		List <WebElement> list = sel.getOptions();
	
	System.out.println("No of elements present in inv catagory dropdown are");
	list.size();	
	for(int i=0;i<=list.size();i++) {
		
		String text = list.get(i).getText();
		
		if (text.equals("Credit Note")) {
			
	sel.selectByVisibleText("Credit Note");
			
			break;
		}
			
			
			}
*/
	
	}


	@Then("user Selects invoice type from dropdown")
	public void user_selects_invoice_type_from_dropdown() {
		
		WebElement drp_InvType = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[4]"));
		drp_InvType.click();
		
		driver.findElement(By.xpath("//div[@title='Deemed Exports']")).click();
		
	/*	Select sel = new Select(drp_InvType);
		List<WebElement> list = sel.getOptions();
		
		System.out.println("No of elements present in inv catagory drp down are ");
		System.out.println(list.size());

		
		for (int i = 0; i<=list.size();i++) {
			
			String text = list.get(i).getText();
			
			if (text.equals("Regular B2B")) {
				
				sel.selectByVisibleText("Regular B2B");
				
				break;
				
			}
			
		}
	*/    
	}

	@Then("user Enters {string}")
	public void user_enters1(String BuyerName) {
		
	WebElement enter_BuyerName = driver.findElement(By.id("customer_name"));
	enter_BuyerName.sendKeys(BuyerName);
	  
	}
	
		
	
	@Then("user enters buyers gstin ")
	public void user_Enters_BuyerGSTIN() {
		
		
		WebElement buyer_gstin= driver.findElement(By.id("buyer_gstin"));

		buyer_gstin.sendKeys("27AAFCA1026J1ZZ");
	}
	
	@Then("user Enters ")
	public void user_enters_Invoice_no() {
		WebElement invoiceNo = driver.findElement(By.id("document_number"));

		invoiceNo.sendKeys("Inv887");
	}
	
	
	@Then("user selects invoice date")
	public void user_selects_invoice_date() throws InterruptedException {
		
		String month = "May 2023";
		String day = "16";
		
		while(true) {
		String text = driver.findElement(By.id("document_date")).getText();
		
			if(text.equals(month)) {
				
				break;
			}
			
			else {
				
				driver.findElement(By.xpath("//button[@class='ant-picker-header-next-btn']")).click();
				
				Thread.sleep(3000);
			}
			
			driver.findElement(By.xpath("//div[contains(text(),"+day+")]")).click();
		
		
		}
		
		
	  
	}

	@Then("user selects supply type from dropdown")
	public void user_selects_supply_type_from_dropdown() {
		
		WebElement drp_SupplyType= driver.findElement(By.id("supply_type"));
		
		Select sel = new Select(drp_SupplyType);
		List<WebElement> list = sel.getOptions();
		
		System.out.println("No of Elements present in dropdown SupplyType are");
		
		System.out.println(list.size());
		
		for(int i = 0; i<list.size();i++) {
			String text = list.get(i).getText();
			
			if(text.equals("Normal Supply")) {
				sel.deselectByVisibleText("Normal Supply");
				
				break;
			}
			
			
		}
		
	    
	}

	@Then("user selects place of supply  from dropdown")
	public void user_selects_place_of_supply_from_dropdown() {
		
		WebElement drp_PlaceOfSupply = driver.findElement(By.id("place_of_supply"));
		drp_PlaceOfSupply.click();
		
		Select sel = new Select(drp_PlaceOfSupply);
		
		List<WebElement> list = sel.getOptions();
		System.out.println("no of elements present under dropdown drp_PlaceOfSupply are");
		System.out.println(list.size());
		
		for (int i = 0; i<=list.size();i++) {
			String text = list.get(i).getText();
			
			if(text.equals("05")) {
				
				sel.selectByVisibleText("06");
				
				break;
			}
			
			
		}
		
		
	    
	}

	@Then("user selects GSTR1 return period")
	public void user_selects_gstr1_return_period() throws InterruptedException {
		
		String year = "2021";
		String month ="May";
		
		driver.findElement(By.id("gstr1_return_period")).click();
		
		
		while(true) {
			
	String text =driver.findElement(By.xpath("//button[@class='ant-picker-year-btn']")).getText();
	
		if(text.equals(year)) {
			
			break;
		}
		else {
			
			driver.findElement(By.xpath("//button[@class='ant-picker-header-super-next-btn']")).click();
			Thread.sleep(2000);
		}
		
		} 
		driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr/td[contains(text(),"+month+"")).click();
	}

	@Then("user selects Reverse charge from dropdown")
	public void user_selects_reverse_charge_from_dropdown() {
		
		WebElement drp_RevCharge = driver.findElement(By.id("reverse_charge"));

		Select sel = new Select(drp_RevCharge);
		List<WebElement> list = sel.getOptions();
		
		System.out.println("No of elements present in drp_rev charge dropdown are");
		System.out.println(list.size());
		
		for(int i=0;i<=list.size();i++) {
			
			String text = list.get(i).getText();
			
			if (text.equals("N")) {
				sel.selectByVisibleText(("N"));
				break;
			}
		}
	    
	}

	@Then("user selects is amended or not")
	public void user_selects_is_amended_or_not() throws InterruptedException {
		
		driver.findElement(By.id("isamended")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("isamended")).click();
		Thread.sleep(2000);


	}

	@Then("user clicks on add line item button")
	public void user_clicks_on_add_line_item_button() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()=\"Add Line Item\"]")).click();
		Thread.sleep(2000);

	}

	@Then("user enters ")
	public void user_enters_HsnSac() throws InterruptedException {
		driver.findElement(By.xpath("//input[@minlength=\"8\"]")).sendKeys("8457dds");
		Thread.sleep(2000);

		
	}

	
	@Then("user enters item name ")
	public void user_enters_ItemName(String ItemName) throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/form/div[3]/div/div/div/div/div/table/tbody/tr[2]/td[3]/input")).sendKeys(ItemName);
		Thread.sleep(2000);

	}
	
	
	
	
	@Then("user enters quantity of items")
	public void user_enters_QtyOfItems(String QtyOfItem) throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/form/div[3]/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/div[2]/input")).sendKeys(QtyOfItem);
		
		Thread.sleep(2000);

		
	}
	
	
	
	@Then("user selects UQC from dropdown")
	public void user_selects_uqc_from_dropdown() throws InterruptedException {
		
		WebElement drp_UQC = driver.findElement(By.xpath("//span[@title='Kilograms']"));
		drp_UQC.click();
		
		Thread.sleep(2000);

		
		Select sel = new Select(drp_UQC);
		List<WebElement> list = sel.getOptions();
		System.out.println("No of elements present in dropdown uqc are");
		
		list.size();
		
		for(int i=0;i<=list.size();i++) {
			
			String text = list.get(i).getText();
			
			if(text.equals("Dozens")) {
				
				sel.selectByVisibleText("Dozens");
				
				break;
				
				
			}
					
		
		}
		
	   
	}
	
	
	@Then("user enters taxable amount")
	public void user_enters_taxable_Amt(String TaxableAmt ) {
		
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[2]/form/div[3]/div/div/div/div/div/table/tbody/tr[2]/td[6]/div/div[2]/input")).sendKeys(TaxableAmt);
	}

	@Then("user clicks on save changes ri8 tick")
	public void user_clicks_on_save_changes_ri8_tick() throws InterruptedException {
		
		driver.findElement(By.xpath("//img[@alt='save']")).click();
		Thread.sleep(2000);

	}

	@Then("user will click on submit button")
	public void user_will_click_on_submit_button() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(7000);

	}

	@Then("user closes browser")
	public void user_closes_browser() {
		
		driver.quit();
	    
	}

	
	
	

}
