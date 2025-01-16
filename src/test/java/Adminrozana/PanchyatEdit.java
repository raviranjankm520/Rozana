package Adminrozana;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PanchyatEdit {
	@Test
	public void panchayat() throws InterruptedException {
		 Logger logger = Logger.getLogger(Panchayat.class.getName());
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
            driver.findElement(By.xpath("//ul//li//a//span[text()='Panchayat']")).click();
            driver.findElement(By.xpath("//a[@rel='next']")).click();
            WebElement state=driver.findElement(By.xpath("//select[@name='state_id']"));
            Select select=new Select(state);
            select.selectByVisibleText("Uttar Pradesh");
            WebElement city=driver.findElement(By.xpath("//select[@name='city_id']"));
            Select select1=new Select(city);
            select1.selectByVisibleText("Unnao");
            WebElement block=driver.findElement(By.xpath("//select[@name='block_id']")); 
            Select select2=new Select(block);
            select2.selectByVisibleText("SUMERPUR");
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys("testing");
            driver.findElement(By.xpath("//input[@value='search']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[5]//span[@class='slider round']")).click();
            driver.findElement(By.xpath("//input[@name='mobilenum']")).sendKeys("9608434452");
            String parent = driver.getWindowHandle();
    		Set<String> s = driver.getWindowHandles();
    		// Now iterate using Iterator
    		Iterator<String> I1 = s.iterator();
    		while (I1.hasNext()) {
    			String child_window = I1.next();
    			if (!parent.equals(child_window)) {
    				driver.switchTo().window(child_window);
    				Thread.sleep(5000);
    			//	driver.close();
    			}
    		}
    		// switch to the parent window
    		//driver.switchTo().window(parent);
            driver.findElement(By.xpath("//input[@name='otp']")).sendKeys("84344");
}}
