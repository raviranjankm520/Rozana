package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdminLogs {
	@Test
	public void adminLogs() throws InterruptedException {
		 Logger logger = Logger.getLogger(AdminLogs.class.getName());
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
			// Admin Logs
			driver.findElement(By.xpath("//span[text()='Admin Logs']")).click();
			driver.findElement(By.xpath("//div[@id='reportrange']")).click();
			driver.findElement(By.xpath("//div[@class='ranges']//ul//li[text()='Last 7 Days']")).click();
			WebElement sorting_hub_id=driver.findElement(By.xpath("//select[@id='sorting_hub_id']"));
			Select select=new Select(sorting_hub_id);
			select.selectByVisibleText("Raebareli Sorting Hub");
			WebElement module_name_id=driver.findElement(By.xpath("//select[@id='module_name_id']"));
			Select select1=new Select(module_name_id);
			select1.selectByVisibleText("ProductList");
			WebElement action_name_id=driver.findElement(By.xpath("//select[@id='action_name_id']"));
			Select select2=new Select(action_name_id);
			select2.selectByVisibleText("store");
			driver.findElement(By.xpath("//input[@name='search']")).sendKeys("ORD38283089887677C");
			driver.findElement(By.xpath("//button[@id='submitButton']")).click();
			driver.findElement(By.xpath("//button[@id='exportButton']")).click();
			//Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
}};
