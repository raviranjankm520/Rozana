package Adminrozana;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clusterwiseorderreport {
	@Test
	public void clusterwiseorderreport() throws InterruptedException {
		 Logger logger = Logger.getLogger(Clusterwiseorderreport.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Manage Cluster Hubs']")).click();
            driver.findElement(By.xpath("//span[text()='Clusterwise Order Report']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div//ul//li//a[text()='State']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("(//tbody//tr//td//a[@class='btn btn-primary alink'])[2]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div//table//tbody//tr//td//a[text()='Barabanki']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div//table//tbody//tr//td//a[text()='Trivediganj']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("(//div//table//tbody//tr//td//a[@data-searchby='panchayat'])[2]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div//table//tbody//tr//td//a[text()='Trivediganj']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div[@class='reportrange']")).click();
        	driver.findElement(By.xpath("//div[@class='ranges']//ul//li[text()='Custom Range']")).click();
        	driver.findElement(By.xpath("(//div[@class=\"drp-calendar left\"]//tbody//tr//td[text()='1'])[1]")).click();
        	driver.findElement(By.xpath("(//div[@class=\"drp-calendar right\"]//tbody//tr//td[text()='3'])[1]")).click();
        	driver.findElement(By.xpath("//button[text()='Apply']")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//input[@value='Export']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Dev Narayan Jaysawal");
            Thread.sleep(500);
            // Scroll through the search results
            JavascriptExecutor js = (JavascriptExecutor) driver;
            Thread.sleep(5000);
            WebElement div = driver.findElement(By.cssSelector(".typed-search-box"));
            List<WebElement> listItems = driver.findElements(By.cssSelector(".typed-search-box .search-content li"));
            
            for (WebElement row : listItems) {
                int itemHeight = row.getSize().getHeight();
                js.executeScript("arguments[0].scrollBy(0, arguments[1]);", div, itemHeight);
                Thread.sleep(70);
            }
            System.out.println("Scrolling up");
            for (WebElement row : listItems) {
                int itemHeight = row.getSize().getHeight();
                js.executeScript("arguments[0].scrollBy(0, arguments[1]);", div, -itemHeight);
                Thread.sleep(70);
            }
            driver.findElement(By.xpath("//ul[@id=\"search-content\"]//li//a[@data-searchid=\"1405\"]")).click();
            Thread.sleep(5000);
            WebElement top = driver.findElement(By.xpath(".//li[@id='dropdown-user']"));
		    js.executeScript("arguments[0].scrollIntoView();",top);
			// LogOut
			  Thread.sleep(5000); 
			  driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();

}}