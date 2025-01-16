package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logs {
	@Test
	public void logs() throws InterruptedException {
		 Logger logger = Logger.getLogger(Logs.class.getName());
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
			Thread.sleep(2000);
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
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul//li//a//span[text()='Logs']")).click();
			Thread.sleep(2000);
			// Order Log
			driver.findElement(By.xpath("//span[text()='Order Log']")).click();
			//Order Booking
			driver.findElement(By.xpath("//a[text()='Order Booking']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='reportrange']")).click();
			driver.findElement(By.xpath("//div[@class='ranges']//ul//li[text()='Last 7 Days']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Type Order code or name & hit Enter']")).sendKeys("ORD70960655890661");
			driver.findElement(By.xpath("//button[text()='Search']")).click();
			driver.findElement(By.xpath("//input[@name='date_from_export']")).sendKeys("01-12-2023");
			driver.findElement(By.xpath("//input[@name='date_to_export']")).sendKeys("01-02-2024");
			driver.findElement(By.xpath("//input[@id='exportpeer']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@value='Export Archived Order']")).click();
			Thread.sleep(1000);
			//Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
}};
