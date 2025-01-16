package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Productlanguage {
	@Test
	public void productlanguage() throws InterruptedException {
		 Logger logger = Logger.getLogger(Productlanguage.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Products']")).click();
            driver.findElement(By.xpath("//a[text()='Product Language']")).click();
            WebElement lang = driver.findElement(By.xpath("(//select[@name='lang_id'])[1]"));
            Select select=new Select(lang);
            select.selectByVisibleText("kannada");
            WebElement cat = driver.findElement(By.xpath("(//select[@name='category_id'])[1]"));
            Select select1=new Select(cat);
            select1.selectByVisibleText("Vegetables");
            driver.findElement(By.xpath("//button[text()='Download CSV']")).click();
            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/public/download/sample-product-language.xlsx']")).click();
            WebElement lang1=driver.findElement(By.xpath("//select[@id='language']"));
            Select select2=new Select(lang1);
            select2.selectByVisibleText("kannada");
            WebElement Type=driver.findElement(By.xpath("//select[@name='upload_type']"));
            Select Select3=new Select(Type);
            //Select3.selectByVisibleText("Single");
            //driver.findElement(By.xpath("//input[@placeholder='Search Product']")).sendKeys("Testing new product");
            //driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Testing new product1");
            //driver.findElement(By.xpath("//input[@name='tags[]']")).sendKeys("Test");
            Select3.selectByVisibleText("Upload File");
            WebElement uploadfile=driver.findElement(By.xpath("//input[@type='file']"));
            uploadfile.sendKeys("C:\\Users\\Ravi Ranjan\\OneDrive\\Desktop\\Test data\\product_languages.xlsx");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
}};
