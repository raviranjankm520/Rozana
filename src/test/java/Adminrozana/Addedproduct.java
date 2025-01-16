package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Addedproduct {
	@Test
	public void addedproduct() throws InterruptedException {
		 Logger logger = Logger.getLogger(Addedproduct.class.getName());
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
            driver.findElement(By.xpath("//a[text()='Added Products']")).click();
            driver.findElement(By.xpath("//a[@rel='next']")).click();
            driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Test");
            driver.findElement(By.xpath("//input[@class='form-control btn btn-rounded btn-info']")).click();
            driver.findElement(By.xpath("//a[text()='Add New Product']")).click();
            driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test product");
            driver.findElement(By.xpath("//b[@role='presentation']")).click();
            driver.findElement(By.xpath("//ul[@class='select2-results__options']/li[18]")).click();
            //driver.findElement(By.xpath("//b[@role='presentation']")).click();
            //driver.findElement(By.xpath("//ul[@role='tree']//li[10]")).click();
            WebElement subsubcat = driver.findElement(By.xpath("//select[@id='subsubcategory_id']"));
            Select select1 = new Select(subsubcat);
    		select1.selectByVisibleText("Garbage Bags");
    		WebElement brand = driver.findElement(By.xpath("//select[@id='brand_id']"));
    		Select select2=new Select(brand);
			select2.selectByVisibleText("Real");
			driver.findElement(By.xpath("//div[@class='bootstrap-tagsinput']//input[@type='text']")).sendKeys("test");
			driver.findElement(By.xpath("//input[@placeholder='HSN Code']")).sendKeys("Tes123");
			driver.findElement(By.xpath("//input[@placeholder='Tax']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Tax']")).sendKeys("10");
			WebElement tax=driver.findElement(By.xpath("//select[@name='tax_type']"));
			Select select3=new Select(tax);
			select3.selectByVisibleText("Percent");
			driver.findElement(By.xpath("//input[@name='photos[]']")).sendKeys("C:\\Users\\Ravi Ranjan\\OneDrive\\Documents\\0ClfTldTChFUi4kcPp7G1YHsn3c9FWoaN2nH1BSV (1).jpg");
			driver.findElement(By.xpath("//input[@name='thumbnail_img']")).sendKeys("C:\\Users\\Ravi Ranjan\\OneDrive\\Documents\\0ClfTldTChFUi4kcPp7G1YHsn3c9FWoaN2nH1BSV (1).jpg");
            driver.findElement(By.xpath("//div//ul[@class='jodit_toolbar']//li[@class='jodit_toolbar_btn jodit_toolbar_btn-bold']")).click();
            driver.findElement(By.xpath("//div[@spellcheck=\"true\"]")).sendKeys("Testing Purpose Product");
			driver.findElement(By.xpath("//input[@name='meta_title']")).sendKeys("test");
			driver.findElement(By.xpath("//textarea[@name='meta_description']")).sendKeys("Test Purpose Product");
            driver.findElement(By.xpath("//input[@name='meta_img']")).sendKeys("C:\\Users\\Ravi Ranjan\\OneDrive\\Documents\\0ClfTldTChFUi4kcPp7G1YHsn3c9FWoaN2nH1BSV.jpg");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
            //Logout
            Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();


}};
