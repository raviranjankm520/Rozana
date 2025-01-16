package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Areapincodeedit {
	@Test
	public void areapincode() throws InterruptedException {
		 Logger logger = Logger.getLogger(Areapincode.class.getName());
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
            driver.findElement(By.xpath("//ul//li//a//span[text()='Area Pincode']")).click();
            driver.findElement(By.xpath("//a[@rel='next']")).click();
            WebElement state=driver.findElement(By.xpath("//select[@id='state']"));
            Select select=new Select(state);
            select.selectByVisibleText("Bihar");
            WebElement District=driver.findElement(By.xpath("//select[@id='district']"));
            Select select1=new Select(District);
            select1.selectByVisibleText("Vaishali");
            driver.findElement(By.xpath("//input[@placeholder='Type pincode & Enter']")).sendKeys("844116");
            driver.findElement(By.xpath("//input[@value='search']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[6]//button[@type='button']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[6]//ul//li//a[text()='Edit']")).click();
            WebElement District1=driver.findElement(By.xpath("//select[@id='district']"));
            Select select2=new Select(District1);
            select2.selectByVisibleText("Vaishali");
            driver.findElement(By.xpath("//input[@id='zone']")).clear();
            driver.findElement(By.xpath("//input[@id='zone']")).sendKeys("Bihar");
            driver.findElement(By.xpath("//button[text()='Save']")).click();
          //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();

}};

