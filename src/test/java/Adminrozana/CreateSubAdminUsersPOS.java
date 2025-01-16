package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateSubAdminUsersPOS {
	@Test
	public void createSubAdminUsersPOS() throws InterruptedException {
		 Logger logger = Logger.getLogger(CreateSubAdminUsersPOS.class.getName());
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
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8033");
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
			driver.findElement(By.xpath("(//span[@class='menu-title'])[55]")).click();
			driver.findElement(By.xpath("//a[text()='Add New POS User']")).click();
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test1");
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9977777788");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testp@gmail.com");
			WebElement Sortinghub=driver.findElement(By.xpath("//select[@id='sorting_hub']"));
			Select select=new Select(Sortinghub);
			select.selectByVisibleText("ROHTAK SORTING HUB");
			driver.findElement(By.xpath("//input[@name='address']")).sendKeys("test");
			WebElement State=driver.findElement(By.xpath("//select[@name='state_id']"));
			Select select1=new Select(State);
			select1.selectByVisibleText("Haryana");
			WebElement District=driver.findElement(By.xpath("//select[@name='city_id']"));
			Select select2=new Select(District);
			select2.selectByVisibleText("Rohtak");
			WebElement Block=driver.findElement(By.xpath("//select[@name='block_id']"));
			Select select3=new Select(Block);
			select3.selectByVisibleText("Lakhan Majra");
			WebElement grampanchyt=driver.findElement(By.xpath("//select[@name='grampanchytId']"));
			Select select4=new Select(grampanchyt);
			select4.selectByVisibleText("Gharonthi");
			WebElement pincode=driver.findElement(By.xpath("//select[@name='pincode']"));
			Select select5=new Select(pincode);
			select5.selectByVisibleText("124411");
			driver.findElement(By.xpath("//button[@id='submitButton']")).click();
			//Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
           driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
		}};