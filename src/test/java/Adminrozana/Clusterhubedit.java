package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Clusterhubedit {
	@Test
	public void clusterhubedit() throws InterruptedException {
		 Logger logger = Logger.getLogger(Clusterhubedit.class.getName());
		// set the path of
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravi Ranjan\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			//URL
			driver.get("https://newdb-staging.rozana.in/login");
			logger.info(driver.getTitle());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			// UserName/Password
			driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("admin@rozana.com");
			driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("Ruhani@#123");
			driver.findElement(By.xpath(".//button[@type='button']")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1988");
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
			driver.findElement(By.xpath("//span[text()='Manage Cluster Hubs']")).click();
            driver.findElement(By.xpath("//span[text()='Clusters List']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[7]//div[@class='btn-group dropdown']")).click();
            driver.findElement(By.xpath("//table//tbody//tr[1]//td[7]//ul//li//a[text()='Edit']")).click();
            driver.findElement(By.xpath("//input[@name='cluster_name']")).sendKeys("Test Rural cluster");
            //driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rural@gmail.com");
            WebElement state= driver.findElement(By.xpath("//select[@name='state_id[]']"));
            Select select=new Select(state);
            select.selectByVisibleText("Karnataka");
            Thread.sleep(500);
            WebElement city=driver.findElement(By.xpath("//select[@name='city_ids[]']"));
            Select select1=new Select(city);
            select1.selectByVisibleText("Davanagere");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            //driver.findElement(By.xpath("//button[@type='reset']")).click();
          //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//a[@href='https://newdb-staging.rozana.in/logout']")).click();

}};
