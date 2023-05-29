/*package Demos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;

public class AutoDateMasters {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","/home/minoiltu0051/eclipse-workspace/GST/Resources/chromedriver");
		
		 driver = new ChromeDriver();
		 
		driver.get("https://qa-enterprise.mastersindia.co/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("username")).sendKeys("anshitmehrotra@mastersindia.co");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menu-import")).click();
		Thread.sleep(2000);
	}
		@Then("user clicks on data import button")
		public void user_clicks_on_data_import() throws InterruptedException {
			
			driver.findElement(By.id("menu-import")).click();
			Thread.sleep(2000);
		
		
		
		}
		@Then("user clicks on add invoice button")
		public void user_clicks_on_add_invoice_button() {
			driver.findElement(By.xpath("//span[text()='Add Invoice']")).click();
		}
		@Then("user selects invoice catagory from dropdown")
		public void user_selects_invoice_catagory_from_dropdown() {
			
		WebElement drp_InvCatagory =driver.findElement(By.cssSelector("div.ant-drawer.ant-drawer-right.app-drawer.add-invoice.css-1sj0ui6.ant-drawer-open div.ant-drawer-content-wrapper:nth-child(3) div.ant-drawer-content.AppDrawer__StyledDrawer-sc-1sjuco0-0.dVxUHr div.ant-drawer-wrapper-body div.ant-drawer-body form.ant-form.ant-form-horizontal.css-1sj0ui6.DrawerForm__StyledForm-sc-1fmq65n-0.faZKjg div.indexstyled__StyledFlexWrapper-sc-1e32pne-0.eziBxe:nth-child(1) div.ant-row.css-1sj0ui6 div.ant-col.ant-col-xs-24.ant-col-sm-12.ant-col-lg-12.ant-col-xl-8.css-1sj0ui6:nth-child(1) div.ant-form-item.css-1sj0ui6.ant-form-item-has-success div.ant-row.ant-form-item-row.css-1sj0ui6 div.ant-col.ant-form-item-control.css-1sj0ui6 div.ant-form-item-control-input div.ant-form-item-control-input-content div.indexstyled__AppFormControlWrapper-sc-1fp87oj-0.fUXgcq.global-select div.indexstyled__InputContainer-sc-1fp87oj-2.hrlrgh div.ant-select.ant-select-in-form-item.ant-select-status-success.css-1sj0ui6.ant-select-single.ant-select-show-arrow div.ant-select-selector > span.ant-select-selection-item"));
		drp_InvCatagory.click();
		
		
			Select sel = new Select(drp_InvCatagory);
			List <WebElement> list = sel.getOptions();
		
		System.out.println("\"No of elements present in inv catagory dropdown are\",list.size()");
		
		for(int i=0;i<=list.size();i++) {
			
			String text = list.get(i).getText();
			
			if (text.equals("Credit Note")) {
				
				sel.selectByVisibleText("Credit Note");
				
				break;
			}
		
				
		/*driver.findElement(By.xpath("//span[contains(text(),'Add Invoice')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("document_date")).click();
		
		Thread.sleep(7000);
		driver.close();
		
		
		
		
		}
*/
}
	
}
}
