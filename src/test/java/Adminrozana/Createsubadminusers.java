package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Createsubadminusers {
	@Test
	public void createsubadminusers() throws InterruptedException {
		 Logger logger = Logger.getLogger(Createsubadminusers.class.getName());
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
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8033");
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
			driver.findElement(By.xpath("(//span[@class='menu-title'])[55]")).click();
			WebElement  role=driver.findElement(By.xpath("//select[@name='role']"));
			Select select=new Select(role);
			select.selectByVisibleText("Field Officer");
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ravi.r12@gmail.com");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//a[text()='Add New User']")).click();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ravi Test User");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("raviamethi2@gmail.com");
			driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("5500778899");
			WebElement role_id=driver.findElement(By.xpath("//select[@name='role_id']"));
			Select select1=new Select(role_id);
			select1.selectByVisibleText("Field Officer ");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
			WebElement  sorting_hub=driver.findElement(By.xpath("//select[@id='sorting_hub']"));
			Select select2=new Select(sorting_hub);
			select2.selectByVisibleText("Amethi 2 ");
			WebElement city_id=driver.findElement(By.xpath("//select[@id='city_id']"));
			Select select3=new Select(city_id);
			select3.selectByVisibleText("Amethi");
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[text()='Add New Call Center User']")).click();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ravi Test User");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ravicalltest@gmail.com");
			driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("2020303040");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
			WebElement role_id1=driver.findElement(By.xpath("//select[@name='role_id']"));
			Select select4=new Select(role_id1);
			select4.selectByVisibleText("Call Center");
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			//Logout
	          Thread.sleep(5000);
	            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
	          Thread.sleep(5000);
	           driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
}};