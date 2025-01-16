package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cashback {
	@Test
	public void stockreport() throws InterruptedException {
		 Logger logger = Logger.getLogger(Stockreport.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Manage Peer Partners']")).click();
			driver.findElement(By.xpath("//ul//li//span[text()='Cashback']")).click();
			driver.findElement(By.xpath("//div[@id='reportrange']")).click();
			driver.findElement(By.xpath("//div[@class='ranges']//ul//li[text()='Custom Range']")).click();
			driver.findElement(By.xpath("(//div[@class=\"drp-calendar left\"]//tbody//tr//td[text()='1'])[1]")).click();
        	driver.findElement(By.xpath("(//tbody//tr//td[text()='28'])[4]")).click();
        	driver.findElement(By.xpath("//button[text()='Apply']")).click();
        	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Ravi");
        	driver.findElement(By.xpath("//input[@name='submit_search']")).click();
        	driver.findElement(By.xpath("//input[@name='submit_export']")).click();
        	driver.findElement(By.xpath("//a[text()='Create  Cashback']")).click();
        	driver.findElement(By.xpath("//a[text()='Download Demo File']")).click();
        	driver.findElement(By.xpath("//input[@name='bulk_file']")).sendKeys("C:\\Users\\Ravi Ranjan\\OneDrive\\Desktop\\Test data\\Cashback Log.xlsx");
        	driver.findElement(By.xpath("//button[@id=\"uploadFormSubmit\"]")).click();
}}
