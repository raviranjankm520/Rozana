package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditCommunityVolunteer {
	@Test
	public void editCommunityVolunteer() throws InterruptedException {
		 Logger logger = Logger.getLogger(EditCommunityVolunteer.class.getName());
		// set the path of
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravi Ranjan\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			//URL
			driver.get("https://dev.rozana.in/admin");
			logger.info(driver.getTitle());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			// UserName/Password
			driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("ravi@amithi.com");
			driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("12345678");
			driver.findElement(By.xpath(".//button[@type='button']")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("0209");
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
			driver.findElement(By.xpath("//span[text()='Community Volunteer']")).click();
			driver.findElement(By.xpath("//a[text()='Users List']")).click();
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Ravip@gmail.com");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//div//tr[1]//td[11]//button[@type='button']")).click();
			driver.findElement(By.xpath("(//ul//li//a[text()='Edit'])[1]")).click();
			driver.findElement(By.xpath("//input[@id='name']")).clear();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ravi");
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ravip1@gmail.com");
			driver.findElement(By.xpath("//input[@id='mobile']")).clear();
			driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8080808091");
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			//Logout
	          Thread.sleep(5000);
	            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
	          Thread.sleep(5000);
	          driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
}};
