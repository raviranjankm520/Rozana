package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Outofstockproductlog {
	@Test
	public void outofstockproductlog() throws InterruptedException {
		 Logger logger = Logger.getLogger(Outofstockproductlog.class.getName());
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
			//driver.findElement(By.xpath(".//span[@class='language']/ancestor::li[@id='lang-change']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//span[text()='English']")).click();
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
			driver.findElement(By.xpath("//span[text()='Out of Stock Product Log']")).click();
			driver.findElement(By.xpath("//div[@id='reportrange']")).click();
        	driver.findElement(By.xpath("//div[@class='ranges']//ul//li[text()='Custom Range']")).click();
        	driver.findElement(By.xpath("(//div[@class=\"drp-calendar left\"]//tbody//tr//td[text()='1'])[1]")).click();
        	driver.findElement(By.xpath("(//div[@class=\"drp-calendar right\"]//tbody//tr//td[text()='3'])[1]")).click();
        	driver.findElement(By.xpath("//button[text()='Apply']")).click();
        	Thread.sleep(1000);
            WebElement state= driver.findElement(By.xpath("//select[@id='sorting_hub_id']"));
            Select select=new Select(state);
            select.selectByVisibleText(" Raebareli Sorting Hub ");
            driver.findElement(By.xpath("//input[@id='child_sku']")).sendKeys("ROZ3964-1Pcs");
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            driver.findElement(By.xpath("//div//a[text()='Export']")).click();
            //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();

}};

