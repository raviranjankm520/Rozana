package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreatePartner {
	@Test
	public void createPartner() throws InterruptedException {
		 Logger logger = Logger.getLogger(CreatePartner.class.getName());
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
            driver.findElement(By.xpath("//ul//li//a//span[text()='Create Partner']")).click();
            driver.findElement(By.xpath("//h3//div[@class='box-inline pad-rgt pull-right']//input[@value='partner']")).click();
            driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ravi Ranjan");
            driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8878787890");
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ravi124@gmail.com");
            driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Test-1,UP-Test");
            WebElement state=driver.findElement(By.xpath("//select[@name='state_id']"));
            Select select=new Select(state);
            select.selectByVisibleText("Karnataka");
            WebElement city=driver.findElement(By.xpath("//select[@name='city_id']"));
            Select select1=new Select(city);
            select1.selectByVisibleText("Bangalore Rural");
            WebElement block=driver.findElement(By.xpath("//select[@name='block_id']"));
            Select select2=new Select(block);
            select2.selectByVisibleText("Dodballapura");
            driver.findElement(By.xpath("//input[@name='gram']")).sendKeys("Test");
            WebElement pincode=driver.findElement(By.xpath("//select[@name='pincode']"));
            Select select3=new Select(pincode);
            select3.selectByVisibleText("560060");
            WebElement fieldofficer=driver.findElement(By.xpath("//select[@name='fieldofficer_id']"));
            Select select4=new Select(fieldofficer);
            select4.selectByVisibleText("Self");
            driver.findElement(By.xpath("//input[@name='pannumber']")).sendKeys("BGHYU6756C");
            driver.findElement(By.xpath("//button[text()='Add Partner']")).click();
          //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
	}};

