package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginAndLogout {
		@Test
		public void loginandlogout() throws InterruptedException {
			 Logger logger = Logger.getLogger(LoginAndLogout.class.getName());
			// set the path of
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravi Ranjan\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//URL
			driver.get("https://dev.rozana.in/login");
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
						// LogOut
						  Thread.sleep(5000); 
						  driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
						  Thread.sleep(5000);
						   
						  driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
						   
				}}
