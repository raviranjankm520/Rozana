package Adminrozana;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Stockoneinvoice {
	@Test
	public void stockoneinvoice() throws InterruptedException {
		 Logger logger = Logger.getLogger(Stockoneinvoice.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Manage Orders']")).click();
            driver.findElement(By.xpath("//ul//li[4]//a//span[text()='Stockone Invoice ']")).click();
            driver.findElement(By.xpath("//a[@rel='next']")).click();
            WebElement delivery_status=driver.findElement(By.xpath("//select[@id='delivery_status']"));
            Select select=new Select(delivery_status);
            select.selectByVisibleText("Delivered");
            WebElement pay_type=driver.findElement(By.xpath("//select[@id='pay_type']"));
            Select select1=new Select(pay_type);
            select1.selectByVisibleText("Cash On Delivery");
            WebElement payment_status=driver.findElement(By.xpath("//select[@id='payment_status']"));
            Select select2=new Select(payment_status);
            select2.selectByVisibleText("Paid");
            WebElement user_view=driver.findElement(By.xpath("//select[@id='user_view']"));
            Select select3=new Select(user_view);
            select3.selectByVisibleText(" Peer Self Order");
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys("UP08IN24/6102");
            driver.findElement(By.xpath("//div[@id='reportrange']")).click();
            driver.findElement(By.xpath("//div[@class='ranges']//ul//li[3]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div//input[@name='startTime']")).sendKeys("01:05");
            driver.findElement(By.xpath("//div//input[@name='endTime']")).sendKeys("23:59");
            WebElement time_slots=driver.findElement(By.xpath("//select[@id='time_slots']"));
            Select select4=new Select(time_slots);
            select4.selectByVisibleText("12 PM");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            driver.findElement(By.xpath("//a[text()='Export']")).click();
            driver.findElement(By.xpath("//a[text()='Export Product wise']")).click();
            driver.findElement(By.xpath("//table//tr[1]/td[14]//div//button[@type='button']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[14]//div//ul//li[2]//a[text()='Full Invoice Print']")).click();
            String parent = driver.getWindowHandle();
    		Set<String> s = driver.getWindowHandles();
    		// Now iterate using Iterator
    		Iterator<String> I1 = s.iterator();
    		while (I1.hasNext()) {
    			String child_window = I1.next();
    			if (!parent.equals(child_window)) {
    				driver.switchTo().window(child_window);
    				Thread.sleep(5000);
    				driver.close();
    			}
    		}
    		// switch to the parent window
    		driver.switchTo().window(parent);
            driver.findElement(By.xpath("//table//tr[1]/td[14]//div//button[@type='button']")).click();
            driver.findElement(By.xpath("//table//tr[1]/td[14]//div//ul//li//a[text()='View']")).click();
            driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();            
            //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
            
}};