package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class staffedit {
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
			driver.findElement(By.xpath("//span[text()='Staffs']")).click();
			driver.findElement(By.xpath("//ul//li//a[text()='All staffs']")).click();
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Ravi Ranjan Mishra");
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[6]//div//button[@data-toggle='dropdown']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[6]//ul//li//a[text()='Edit']")).click();
			driver.findElement(By.xpath("//input[@id='name']")).clear();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Test Purpose");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
			WebElement role_id=driver.findElement(By.xpath("//select[@name='role_id']"));
			Select Select=new Select(role_id);
			Select.selectByVisibleText("Sub Admin");
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//table//tbody//tr[1]//td[6]//div//button[@data-toggle='dropdown']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[6]//ul//li//a[text()='Delete']")).click();
			driver.findElement(By.xpath("(//div[@class=\"modal-footer\"]//button[text()='Cancel'])[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//table//tbody//tr[1]//td[6]//div//button[@data-toggle='dropdown']")).click();
			driver.findElement(By.xpath("//table//tbody//tr[1]//td[6]//ul//li//a[text()='Delete']")).click();
			driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//a[text()='Delete']")).click();
			//Logout
	          Thread.sleep(5000);
	            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
	          Thread.sleep(5000);
	           driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
}};
