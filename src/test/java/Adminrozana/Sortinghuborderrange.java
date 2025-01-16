package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sortinghuborderrange {
	@Test
	public void sortinghuborderrange() throws InterruptedException {
		 Logger logger = Logger.getLogger(Sortinghuborderrange.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Manage Sorting Hubs']")).click();
            driver.findElement(By.xpath("//ul//li//a//span[text()='Sorting hub Order Range']")).click();
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ROHTAK SORTING HUB");
            driver.findElement(By.xpath("//input[@class='form-control btn btn-rounded btn-info']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[7]//a[text()='Edit Range']")).click();
            driver.findElement(By.xpath("(//input[@placeholder='Max order customer range'])[1]")).clear();
            driver.findElement(By.xpath("(//input[@placeholder='Max order customer range'])[1]")).sendKeys("100000");
            driver.findElement(By.xpath("(//input[@name='min_range_customer'])[1]")).clear();
            driver.findElement(By.xpath("(//input[@name='min_range_customer'])[1]")).sendKeys("500");
            driver.findElement(By.xpath("(//input[@name='max_range'])[1]")).clear();
            driver.findElement(By.xpath("(//input[@name='max_range'])[1]")).sendKeys("100000");
            driver.findElement(By.xpath("(//input[@name='min_range'])[1]")).clear();
            driver.findElement(By.xpath("(//input[@name='min_range'])[1]")).sendKeys("500");
            driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).click();
            //driver.findElement(By.xpath("(//input[@value='Reset'])[1]")).click();
          //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
}};
