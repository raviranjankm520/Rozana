package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Complainticketsupport {
	@Test
	public void complainticketsupport() throws InterruptedException {
		 Logger logger = Logger.getLogger(Complainticketsupport.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Complain Ticket support']")).click();
			driver.findElement(By.xpath("//ul//li//a[text()='Pre Delivery Complaint & Query']")).click();
            driver.findElement(By.xpath("//div[@id='reportrange']")).click();
            driver.findElement(By.xpath("//div[@class='ranges']//ul//li[4]")).click();
            driver.findElement(By.xpath("//div//table//thead//tr//th[@class='prev available']")).click();
			driver.findElement(By.xpath("(//table//tbody//tr//td[text()='1'])[2]")).click();
			driver.findElement(By.xpath("(//table//tbody//tr//td[text()='31'])[3]")).click();
			//driver.findElement(By.xpath("(//button[text()='Cancel'])[5]")).click();
			driver.findElement(By.xpath("//button[text()='Apply']")).click();
			WebElement complain_status=driver.findElement(By.xpath("//select[@name='complain_status']"));
			Select select=new Select(complain_status);
			select.selectByVisibleText("Closed");
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("CTN770881");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//a[text()='Download Complaint']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//table//tbody//tr[1]//td[2]//a//span)[1]")).click();
			WebElement callcenter_status=driver.findElement(By.xpath("//table//tbody//tr[1]//td[3]//Select[@name='callcenter_status']"));
			Select Select1=new Select(callcenter_status);
			Select1.selectByVisibleText("Closed");
			driver.findElement(By.xpath("//input[@name='chats']")).sendKeys(".");
			driver.findElement(By.xpath("//input[@value='Send']")).click();
			//Logout
	          Thread.sleep(5000);
	            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
	          Thread.sleep(5000);
	           driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
}};
