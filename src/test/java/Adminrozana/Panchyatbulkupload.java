package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Panchyatbulkupload {
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
            //driver.findElement(By.xpath("//a[@rel='next']")).click();
            driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-info pull-right']")).click();
            driver.findElement(By.xpath("(//a[@class=\"btn btn-primary\"])[1]")).click();
            driver.findElement(By.xpath("(//a[@class=\"btn btn-primary\"])[2]")).click();
            driver.findElement(By.xpath("(//a[@class=\"btn btn-primary\"])[3]")).click();
            WebElement Type=driver.findElement(By.xpath("//select[@id=\"upload_type\"]"));
            Select select=new Select(Type);
            select.selectByVisibleText("Upload File");
            driver.findElement(By.xpath("//input[@id=\"getmobile\"]")).sendKeys("9608434452");
            driver.findElement(By.xpath("//button[@id=\"submit_btn\"]")).click();
            driver.findElement(By.xpath("//input[@placeholder=\"OTP\"]")).sendKeys("559");
            driver.findElement(By.xpath("//button[@id=\"submit_btn\"]")).click();
            driver.findElement(By.xpath("//input[@id=\"upload_file\"]")).sendKeys("C:\\Users\\Ravi Ranjan\\OneDrive\\Desktop\\Test data");
            driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
            //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();


}
}