package Adminrozana;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Postshipsyorders {
	@Test
	public void postshipsyorders() throws InterruptedException {
		 Logger logger = Logger.getLogger(Postshipsyorders.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Manage Orders']")).click();
            driver.findElement(By.xpath("//ul//li//a//span[text()='Post Shipsy Orders ']")).click();
            driver.findElement(By.xpath("//h3//a[text()='Orders']")).click();
            driver.findElement(By.xpath("//input[@name='startTime']")).sendKeys("01:05");
            driver.findElement(By.xpath("//input[@name='endTime']")).sendKeys("23:59");
            driver.findElement(By.xpath("//div[@id='reportrange']")).click();
            driver.findElement(By.xpath("//div[@class='ranges']//ul//li[text()='Custom Range']")).click();
            driver.findElement(By.xpath("//table//thead//tr[1]//th[@class='prev available']//span")).click();
            driver.findElement(By.xpath("//table//thead//tr[1]//th[@class='prev available']//span")).click();
            driver.findElement(By.xpath("//table//thead//tr[1]//th[@class='prev available']//span")).click();
            driver.findElement(By.xpath("//table//thead//tr[1]//th[@class='prev available']//span")).click();
            driver.findElement(By.xpath("(//table//tbody//tr//td[text()='1'])[1]")).click();
            driver.findElement(By.xpath("(//table//tbody//tr//td[text()='9'])[1]")).click();
            //driver.findElement(By.xpath("//div[@class='drp-buttons']//button[text()='Cancel']")).click();
			driver.findElement(By.xpath("//div[@class='drp-buttons']//button[text()='Apply']")).click();
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ORD38728958296854");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[9]//div//button[@type='button']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[9]//div//ul//li[2]//a[text()='Full Invoice Print']")).click();
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
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[9]//div//button[@type='button']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[9]//div//ul//li//a[text()='View']")).click();
            driver.findElement(By.xpath("//a[text()='Download Invoice']")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("(//button[@class='close'])[5]")).click();
            //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
}};
