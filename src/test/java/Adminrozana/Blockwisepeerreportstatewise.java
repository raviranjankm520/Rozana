package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Blockwisepeerreportstatewise {
	@Test
	public void blockwisepeerreportstatewise() throws InterruptedException {
		 Logger logger = Logger.getLogger(Blockwisepeerreportstatewise.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Reports']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ul//li//a[text()='Block wise Peer Reports']")).click();
			WebElement  report_type=driver.findElement(By.xpath("//select[@id='report_type']"));
			Select select=new Select(report_type);
			select.selectByVisibleText("Peer wise");
			driver.findElement(By.xpath("//input[@onclick='sort(1)']")).click();
			WebElement state=driver.findElement(By.xpath("//select[@id='state']"));
			Select select1=new Select(state);
			select1.selectByVisibleText("Uttar Pradesh");
			WebElement district=driver.findElement(By.xpath("//select[@id='district']"));
			Select select0=new Select(district);
			select0.selectByVisibleText("Rae Bareli");
			WebElement block=driver.findElement(By.xpath("//select[@id='block']"));
			Select select2=new Select(block);
			select2.selectByVisibleText("Gaura");
			driver.findElement(By.xpath("//input[@name='start_date']")).sendKeys("01-12-2023");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@name='end_date']")).sendKeys("04-12-2023");
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			Thread.sleep(5000);
			WebElement  option=driver.findElement(By.xpath("//select[@name='example_length']"));
			Select select3=new Select(option);
			select3.selectByVisibleText("30");
			driver.findElement(By.xpath("//span[text()='Excel']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='CSV']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul//li//a[text()='Next']")).click();
			driver.findElement(By.xpath("//input[@type='search']")).click();
			//Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
}};

