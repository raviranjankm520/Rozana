package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Blockedit {
	@Test
	public void blockedit() throws InterruptedException {
		 Logger logger = Logger.getLogger(Blockedit.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Manage Sorting Hubs']")).click();
            driver.findElement(By.xpath("//ul//li//a//span[text()='Blocks']")).click();
            driver.findElement(By.xpath("//a[@rel='next']")).click();
            WebElement State=driver.findElement(By.xpath("//select[@name='state_id']"));
            Select select=new Select(State);
            select.selectByVisibleText("Bihar");
            WebElement District =driver.findElement(By.xpath("//select[@name='district_id']"));
            Select select1=new Select(District);
            select1.selectByVisibleText("Patna");
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Mashaurahi.");
            driver.findElement(By.xpath("//input[@value='search']")).click();
            driver.findElement(By.xpath("//tr[1]//td[5]//span[@class='slider round']")).click();
            driver.findElement(By.xpath("//tr[1]//td[6]//button[@data-toggle='dropdown']")).click();
            driver.findElement(By.xpath("//tr[1]//td[6]//ul//li//a[text()='Edit']")).click();
            driver.findElement(By.xpath("//input[@id='block_name']")).clear();
            driver.findElement(By.xpath("//input[@id='block_name']")).sendKeys("Mashaurahi");
            driver.findElement(By.xpath("//button[text()='Save']")).click();
          //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();

}};

