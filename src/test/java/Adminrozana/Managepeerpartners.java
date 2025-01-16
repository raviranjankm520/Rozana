package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Managepeerpartners {
	@Test
	public void managepeerpartners() throws InterruptedException {
		 Logger logger = Logger.getLogger(Managepeerpartners.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Manage Peer Partners']")).click();
            driver.findElement(By.xpath("//ul//li//a//span[text()='Partner list']")).click();
            driver.findElement(By.xpath("//h3//a[@class='btn btn-rounded btn-info']")).click();
            driver.findElement(By.xpath("//a[@rel='next']")).click();
            WebElement Partner =driver.findElement(By.xpath("//select[@name='partner_type']"));
            Select select=new Select(Partner);
            select.selectByVisibleText("Footwear Partner");
            WebElement Status=driver.findElement(By.xpath("//select[@name='approved_status']"));	
            Select select1=new Select(Status);
            select1.selectByVisibleText(" Approved");
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys("9934218227");
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            driver.findElement(By.xpath("//input[@name='start_date']")).sendKeys("28-01-2024");
            driver.findElement(By.xpath("//input[@name='end_date']")).sendKeys("30-01-2024");
            driver.findElement(By.xpath("//input[@id='exportpeer']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[6]//span[@class='slider round']")).click();
            driver.findElement(By.xpath("//input[@name='reason']")).sendKeys("test_data");
            //Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[5]//a[@title='Want to Change? Click Here!']")).click();
            driver.findElement(By.xpath("//input[@name='custom_code']")).clear();
            driver.findElement(By.xpath("//input[@name='custom_code']")).sendKeys("SAN5609");
            driver.findElement(By.xpath("//input[@name='submit']")).click();
            //Thread.sleep(2000);
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[7]//a[@title='Want to Change Type? Click Here!']")).click();
            Thread.sleep(200);
           // WebElement value=driver.findElement(By.xpath("//select[@id='categorySelect']"));
           // Select select2=new Select(value);
            //select2.selectByVisibleText("Footwears");
            //driver.findElement(By.xpath("//table//tbody//tr[1]//td[7]//input[@name='submit']")).click();
            //Thread.sleep(5000);
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[8]//span[@class='slider round']")).click();
            //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
}};
