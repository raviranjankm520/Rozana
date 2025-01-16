package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Manageordersreports {
	@Test
	public void manageordersreports() throws InterruptedException {
		 Logger logger = Logger.getLogger(Manageordersreports.class.getName());
		// set the path of
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravi Ranjan\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			//URL
			driver.get("https://dev.rozana.in/admin");
			logger.info(driver.getTitle());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			// UserName/Password
			driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("admin@rozana.com");
			driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("ROZ#2021");
			driver.findElement(By.xpath(".//button[@type='button']")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("5494");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			// Language Changes
			driver.findElement(By.xpath(".//span[@class='language']/ancestor::li[@id='lang-change']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='English']")).click();
			driver.findElement(By.xpath("//i[@class='demo-pli-bell']")).click();
			driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
			String ord=driver.findElement(By.xpath("(//h2[@class='no-margin ng-binding'])[1]")).getText();
			System.out.println(ord);
			String ord1=driver.findElement(By.xpath("(//h2[@class='no-margin ng-binding'])[2]")).getText();
			System.out.println(ord1);
			String ord2=driver.findElement(By.xpath("(//h2[@class='no-margin ng-binding'])[3]")).getText();
			System.out.println(ord2);
			String ord3=driver.findElement(By.xpath("(//h2[@class='no-margin ng-binding'])[4]")).getText();
			System.out.println(ord3);
			driver.findElement(By.xpath("//span[text()='Reports']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ul//li//a//span[text()='Manage Orders Reports']")).click();
			driver.findElement(By.xpath("//ul//li//a//span[text()='Orders']")).click();
            WebElement sorting_hub_id=driver.findElement(By.xpath("//select[@id='sorting_hub_id']"));
            Select select=new Select(sorting_hub_id);
            select.selectByVisibleText("Raebareli Sorting Hub");
            WebElement delivery_status=driver.findElement(By.xpath("//select[@id='delivery_status']"));
            Select select1=new Select(delivery_status);
            select1.selectByVisibleText("Delivered");
            WebElement pay_status=driver.findElement(By.xpath("//select[@id='pay_status']"));
            Select select2=new Select(pay_status);
            select2.selectByVisibleText("Cash On Delivery");
            WebElement  payment_mode=driver.findElement(By.xpath("//select[@id='payment_mode']"));
            Select select3=new Select(payment_mode);
            select3.selectByVisibleText("Paid");
            driver.findElement(By.xpath("//div[@id='reportrange']")).click();
			driver.findElement(By.xpath("//div[@class='ranges']//ul//li[text()='Custom Range']")).click();
			driver.findElement(By.xpath("//div//table[@class='table-condensed']//thead//tr//th//span")).click();
			driver.findElement(By.xpath("(//table//tbody//tr//td[text()='1'])[3]")).click();
			driver.findElement(By.xpath("(//table//tbody//tr//td[text()='19'])[2]")).click();
			//driver.findElement(By.xpath("(//button[text()='Cancel'])[3]")).click();
			driver.findElement(By.xpath("//button[text()='Apply']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='exportOrders']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='exportArchivedProductWiseOrders']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='exportProductWiseOrders']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='exportArchivedCancelledOrders']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='exportArchivedCancelledOrders']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='exportCancelledOrders']")).click();
			Thread.sleep(2000);
			//Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
			
			driver.findElement(By.xpath("//input[@id='exportAssignedOrders']")).click();
            
	}};
