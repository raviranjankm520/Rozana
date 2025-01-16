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

public class CancelIncreasedStockReport {
	@Test
	public void cancelIncreasedStockReport() throws InterruptedException {
		 Logger logger = Logger.getLogger(CancelIncreasedStockReport.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Reports']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ul//li//a[text()='Cancel Increased Stock Report']")).click();
			driver.findElement(By.xpath("//h3[@class='panel-title pull-left pad-no']")).click();
			driver.findElement(By.xpath("//div[@id='reportrange']")).click();
			driver.findElement(By.xpath("//div//ul//li[text()='Last 2 Days']")).click();
			
			Thread.sleep(5000);
        	driver.findElement(By.xpath("//select[@name='sorting_hub_id']/following-sibling::span[1]")).click();
        	 // Scroll through the search results
            JavascriptExecutor js = (JavascriptExecutor) driver;
            Thread.sleep(5000);
            WebElement div = driver.findElement(By.cssSelector(".select2-results__options"));
            List<WebElement> listItems = driver.findElements(By.cssSelector(".select2-results__options li"));
                for (WebElement row : listItems) {
                int itemHeight = row.getSize().getHeight();
                js.executeScript("arguments[0].scrollBy(0, arguments[1]);", div, itemHeight);
                Thread.sleep(70);
            }
            System.out.println("Scrolling up");
            
            int countNum=1;
            for (WebElement row : listItems) {
                System.out.println("Current countNum: " + countNum);
                int itemHeight = row.getSize().getHeight();
                js.executeScript("arguments[0].scrollBy(0, arguments[1]);", div, -itemHeight);
                Thread.sleep(70);
                
                if (countNum ==10) {
                    System.out.println("IF condition met, clicking row...");
                    row.click();
                    break;
                }
                
                countNum++;
            }
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Sting Red Energy Drink - 250 ml");
            driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
            driver.findElement(By.xpath("//a[text()='Export']")).click();
            //Logout
             Thread.sleep(5000);
             driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
}}
