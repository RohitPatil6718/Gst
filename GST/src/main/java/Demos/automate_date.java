package Demos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automate_date {
	 WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String month = "May 2023";
		String day = "30";
		System.setProperty("webdriver.chrome.driver","/home/minoiltu0051/eclipse-workspace/GST/Resources/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		Thread.sleep(2);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker"));
		
		
		Thread.sleep(2);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		while(true) {
			
		
		String text =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
			if(text.equals(month)) {
				
				break;
			}
		
			else {
				
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
				Thread.sleep(1000);
			}
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'day')]")).click();
		Thread.sleep(5000);

		
		driver.quit();
	}

	

}














WebElement drp_InvType = driver.findElement(By.xpath("//span[@title='Regular B2B']"));
drp_InvType.click();

Select sel = new Select(drp_InvType);
List<WebElement> list = sel.getOptions();

System.out.println("\"No of elements present in inv catagory drp down are \",+list.size()");

for (int i = 0; i<=list.size();i++) {
	
	String text = list.get(i).getText();
	
	if (text.equals("Regular B2B")) {
		
		sel.selectByVisibleText("Regular B2B");
		
		break;
		
--------------------------------------------------------------------------------------------------------		
		
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
			
			driver.findElement(By.xpath("//div[contains(text(),'day')]")).click();




































