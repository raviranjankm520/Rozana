package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Peerpartneredit {
	@Test
	public void peerpartneredit() throws InterruptedException {
		 Logger logger = Logger.getLogger(Peerpartneredit.class.getName());
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
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys("9934218227");
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[@tabindex='0']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//tr[@class='child']//ul[@class='dtr-details']//li[6]//span[@class='dtr-data']//div[@class='btn-group dropup']//button[@class='btn btn-primary dropdown-toggle dropdown-toggle-icon']")).click();
            driver.findElement(By.xpath("//li//span[@class='dtr-data']//div//ul//li//a[text()='Edit']")).click();
            driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ravi_Testdata");
            driver.findElement(By.xpath("//input[@placeholder='Phone']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9934218227");
            driver.findElement(By.xpath("//input[@placeholder='Address']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys("Vill+Po-KahalGao");
            WebElement Block=driver.findElement(By.xpath("//select[@id='block_id']"));
            Select select=new Select(Block);
            select.selectByVisibleText("Lakhan Majra");
            WebElement village=driver.findElement(By.xpath("//select[@id='villageId']"));
            Select select1=new Select(village);
            select1.selectByVisibleText("Chandi");
            driver.findElement(By.xpath("//input[@name='gram']")).sendKeys("Test");
            WebElement Pincode=driver.findElement(By.xpath("//select[@id='fieldofficer_id']"));
            Select select2=new Select(Pincode);
            select2.selectByVisibleText("Self");
            WebElement Fieldofficer=driver.findElement(By.xpath("//select[@id='pincode_id']"));
            Select select3=new Select(Fieldofficer);
            select3.selectByVisibleText("124513");
            driver.findElement(By.xpath("//input[@id='panNumber']")).sendKeys("BVJRQ4567C");
            driver.findElement(By.xpath("//button[text()='Update Partner']")).click();
            Thread.sleep(5000);
          //Logout
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            //Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
	}};

