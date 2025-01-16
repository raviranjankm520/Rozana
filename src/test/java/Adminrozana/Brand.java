package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Brand {
	@Test
	public void brand() throws InterruptedException {
		 Logger logger = Logger.getLogger(Brand.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Products']")).click();
			driver.findElement(By.xpath("//a[text()='Brand']")).click();
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("24 Mantra");
			driver.findElement(By.xpath("//input[@value='search']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-info pull-right']")).click();
			String head=driver.findElement(By.xpath("//h3[@class='panel-title']")).getText();
			System.out.println(head);
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Test Product2");
			driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Ravi Ranjan\\OneDrive\\Documents\\0qVP5hrOdGsk5d0r4nARm8h5kpi8MvOcZL8MkKbu.jpg");
			driver.findElement(By.xpath("//input[@name='meta_title']")).sendKeys("Test1");
			driver.findElement(By.xpath("//textarea[@name='meta_description']")).sendKeys("Test Purpose only");
			//driver.findElement(By.xpath("//button[@class='btn btn-purple']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
			// LogOut
			  Thread.sleep(5000); 
			  driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
			  Thread.sleep(5000);
			   
			  driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
			   
	}}


