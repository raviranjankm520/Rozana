package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Refundlist {
	@Test
	public void refundlist() throws InterruptedException {
		 Logger logger = Logger.getLogger(Refundlist.class.getName());
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
			driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("ROZ#2020");
			driver.findElement(By.xpath(".//button[@type='button']")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("3842");
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
			driver.findElement(By.xpath("//span[text()='Manage Orders']")).click();
			driver.findElement(By.xpath("//ul//li//a//span[text()='Refund List ']")).click();
			driver.findElement(By.xpath("//div[@id='reportrange']")).click();
			driver.findElement(By.xpath("//div[@class='ranges']//ul//li[text()='Custom Range']")).click();
			driver.findElement(By.xpath("//thead//tr//th[@class='prev available']//span")).click();
			//driver.findElement(By.xpath("//div[@class='drp-buttons']//button[text()='Cancel']")).click();
			driver.findElement(By.xpath("//div[@class='drp-buttons']//button[text()='Apply']")).click();
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ORD10428474737376");
			driver.findElement(By.xpath("//input[@name='submit_search']")).click();
			driver.findElement(By.xpath("//input[@name='submit_export']")).click();
			driver.findElement(By.xpath("//div//a[text()='Create New Refund']")).click();
			driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9608434452");
			driver.findElement(By.xpath("//a[@id='otp_request']")).click();
			driver.findElement(By.xpath("//input[@name='otp']")).sendKeys("1234");
			driver.findElement(By.xpath("//div[@class='col-lg-7']//a[2]")).click();
			driver.findElement(By.xpath("//select[@name='refund_type']")).click();
		    WebElement refund_type=driver.findElement(By.xpath("//select[@id='refund_type']"));
		    Select select=new Select(refund_type);
		    select.selectByVisibleText("product");
		    driver.findElement(By.xpath("//input[@id='invoice_no']")).sendKeys("INV/23-24/430");
		    WebElement ticket_no=driver.findElement(By.xpath("//select[@id='ticket_no']"));
		    Select select1=new Select(ticket_no);
		    select1.selectByVisibleText("CTN166680");
		    driver.findElement(By.xpath("//div//textarea[@id='description']")).sendKeys("Test");
		    driver.findElement(By.xpath("//input[@id='photos']")).sendKeys("C:\\Users\\Ravi Ranjan\\OneDrive\\Documents\\0ClfTldTChFUi4kcPp7G1YHsn3c9FWoaN2nH1BSV (1).jpg");
		    driver.findElement(By.xpath("//input[@id='video']")).sendKeys("C:\\Users\\Ravi Ranjan\\OneDrive\\Desktop\\Test data\\colourful widow tetra #tetrafish #tanksetup #aquascaping #fishnfins2021 #shorts #shortsvideo.mp4");
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			//Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
			
}};
