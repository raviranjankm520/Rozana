package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Managesortinghub {
	@Test
	public void managesortinghub() throws InterruptedException {
		 Logger logger = Logger.getLogger(Managesortinghub.class.getName());
		// set the path of
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravi Ranjan\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			//URL
			driver.get("https://dev.rozana.in/login");
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
			//driver.findElement(By.xpath(".//span[@class='language']/ancestor::li[@id='lang-change']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//span[text()='English']")).click();
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
            driver.findElement(By.xpath("//ul//li//a//span[text()='Sorting hub List']")).click();
            driver.findElement(By.xpath("//a[@rel='next']")).click();
            driver.findElement(By.xpath("//input[@placeholder='Type name & Email']")).sendKeys("testsortinghub@gmail.com");
            driver.findElement(By.xpath("//input[@value='search']")).click();
            driver.findElement(By.xpath("//a[text()='Add New Sorting Hub']")).click();
            WebElement Stax=driver.findElement(By.xpath("//select[@name='tax_state']"));
            Select select=new Select(Stax);
            select.selectByVisibleText("Bihar");
            driver.findElement(By.xpath("//input[@placeholder='Sorting Name']")).sendKeys("Rural");
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rural1@gmail.com");
            WebElement cluster=driver.findElement(By.xpath("//select[@name='cluster_hub']"));
            Select select1=new Select(cluster);
            select1.selectByVisibleText("testcluster");
            WebElement State=driver.findElement(By.xpath("//select[@name='state_id']"));
            Select select2=new Select(State);
            select2.selectByVisibleText("Bihar");
            WebElement City=driver.findElement(By.xpath("//select[@name='city_id']"));
            Select select3=new Select(City);
            select3.selectByVisibleText("Patna");
            driver.findElement(By.xpath("//textarea[@id='pincodes']")).sendKeys("804452");
            driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("2222244444");
            driver.findElement(By.xpath("//input[@name='customer_care']")).sendKeys("01206901401");
            driver.findElement(By.xpath("//input[@name='cin_no']")).sendKeys("U52399UP2020PTC132214");
            driver.findElement(By.xpath("//input[@name='gstn_no']")).sendKeys("09AAECF1722F1ZY");
            driver.findElement(By.xpath("//input[@name='fcaai_no']")).sendKeys("123123123");
            driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Dariyapur Chauraha, MunshiGanj, Patna");
            //driver.findElement(By.xpath("//textarea[@name='delivery_days']")).sendKeys("7");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();

}};
