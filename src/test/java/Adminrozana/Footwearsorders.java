package Adminrozana;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Footwearsorders {
	@Test
	public void footwearsorders() throws InterruptedException, AWTException {
		 Logger logger = Logger.getLogger(Footwearsorders.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Manage Orders']")).click();
            driver.findElement(By.xpath("//ul//li//a//span[text()='Footwear Orders ']")).click();
            driver.findElement(By.xpath("//a[text()='Footwear Orders']")).click();
            driver.findElement(By.xpath("//a[@rel='next']")).click();
            WebElement delivery_status=driver.findElement(By.xpath("//select[@id='delivery_status']"));
            Select select1=new Select(delivery_status);
            select1.selectByVisibleText("Pending");
            WebElement stockone=driver.findElement(By.xpath("//select[@id='stockone_status']"));
            Select select=new Select(stockone);
            select.selectByVisibleText("Pending");
            WebElement pay_type=driver.findElement(By.xpath("//select[@id='pay_type']"));
            Select select2=new Select(pay_type);
            select2.selectByVisibleText("Cash On Delivery");
            WebElement payment_type=driver.findElement(By.xpath("//select[@id='payment_type']"));
            Select select3=new Select(payment_type);
            select3.selectByVisibleText("Un-Paid");
            WebElement edit_view=driver.findElement(By.xpath("//select[@id='edit_view']"));  
            Select select4=new Select(edit_view);
            select4.selectByVisibleText("Edited/Viewed");
            WebElement user_view=driver.findElement(By.xpath("//select[@id='user_view']"));
            Select select5=new Select(user_view);
            select5.selectByVisibleText(" Peer Self Order");
            driver.findElement(By.xpath("//input[@name='startTime']")).sendKeys("01:05");
            driver.findElement(By.xpath("//input[@name='endTime']")).sendKeys("23:59");
            driver.findElement(By.xpath("//div[@id='reportrange']")).click();
            driver.findElement(By.xpath("//div[@class='ranges']//ul//li[2]")).click();
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ORD57361706831702");
            driver.findElement(By.xpath("//button[@type='submit']")).click(); 
            
            driver.findElement(By.xpath("//a[text()='Export Product wise']")).click();
            driver.findElement(By.xpath("//a[text()='Export']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[13]//div//button[@type='button']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[13]//div//ul//li[2]//a[text()='Full Invoice Print']")).click();            		
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//button[@class='close'])[2]")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[13]//div//button[@type='button']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[13]//div//ul//li[1]//a[text()='View']")).click();
            driver.findElement(By.xpath("//div[@class='col-sm-6 text-xs-center']//button[text()='Update address']")).click();
            driver.findElement(By.xpath("//div//a[@class='invoicePrintModal']")).click();
          //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();

}};
