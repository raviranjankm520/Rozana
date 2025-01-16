package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Pushnotification {
	@Test
	public void pushnotification() throws InterruptedException {
		 Logger logger = Logger.getLogger(Pushnotification.class.getName());
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
			driver.findElement(By.xpath("//ul//li//a//span[text()='Push Notification']")).click();
            driver.findElement(By.xpath("//a[text()='Push Notification Send User List']")).click();
            driver.findElement(By.xpath("//a[@rel='next']")).click();
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys("1253624125");
            driver.findElement(By.xpath("//input[@value='search']")).click();
            driver.findElement(By.xpath("//a[text()='Push Notification']")).click();
            driver.findElement(By.xpath("//a[text()='Add New image for Push Notification']")).click();
            driver.findElement(By.xpath("//a[text()='Add New image']")).click();
            WebElement uploadfile=driver.findElement(By.xpath("//input[@accept='image/*']"));
            uploadfile.sendKeys("C:\\Users\\Ravi Ranjan\\OneDrive\\Documents\\0ClfTldTChFUi4kcPp7G1YHsn3c9FWoaN2nH1BSV (1).jpg");
			driver.findElement(By.xpath("//button[text()='Add Media']")).click();
			driver.findElement(By.xpath("//a[text()='Add New image']")).click();
			driver.findElement(By.xpath("//a[text()='Image URL']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//table//tbody//tr[1]//td[4]//a[text()='Delete']")).click();
			driver.findElement(By.xpath("//a[text()='Push Notification']")).click();
			WebElement sorting_hub_id=driver.findElement(By.xpath("(//select[@id='element1'])[1]"));
			Select select=new Select(sorting_hub_id);
			select.selectByVisibleText(" ROHTAK SORTING HUB");
			WebElement  notificationtype=driver.findElement(By.xpath("(//select[@name='notificationtype'])[1]"));
            Select select1=new Select(notificationtype);
            select1.selectByVisibleText(" Category");
            WebElement category_id=driver.findElement(By.xpath("//select[@id='category_id']"));
            Select select2=new Select(category_id);
            select2.selectByVisibleText(" Grocery & Staple");
            driver.findElement(By.xpath("//input[@placeholder='Image Url']")).sendKeys("uploads/products/thumbnail/rnThFb76Q74gkREaNTN9PlDMvga6AuCC1RW8ZNh0.jpg");
            WebElement Users=driver.findElement(By.xpath("(//select[@id='element1'])[2]")); 
            Select select3=new Select(Users);
            select3.selectByVisibleText(" Peer App Users ");
            driver.findElement(By.xpath("//input[@name='title']")).sendKeys("We are Back");
            driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("We are Back! Enjoy ordering.");
            //driver.findElement(By.xpath("//input[@value=' Send Push Notification']")).click();
            driver.findElement(By.xpath("//a[text()='   Show more ']")).click();
            driver.findElement(By.xpath("//a[text()='Push Notification']")).click();
            WebElement sorting_hub=driver.findElement(By.xpath("(//select[@id='element1'])[1]"));
			Select select4=new Select(sorting_hub);
			select4.selectByVisibleText(" ROHTAK SORTING HUB");
			WebElement  notificationtype1=driver.findElement(By.xpath("(//select[@name='notificationtype'])[1]"));
            Select select5=new Select(notificationtype1);
            select5.selectByVisibleText(" Products ");
            WebElement products=driver.findElement(By.xpath("//select[@id='products']"));
            Select select6=new Select(products);
            select6.selectByVisibleText(" Arhar Dal (Chilka) FC - 30kg");
            WebElement Users1=driver.findElement(By.xpath("(//select[@id='element1'])[2]")); 
            Select select7=new Select(Users1);
            select7.selectByVisibleText(" Peer App Users ");
            driver.findElement(By.xpath("//input[@name='title']")).sendKeys("We are Back");
            driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("We are Back! Enjoy ordering.");
            //driver.findElement(By.xpath("//input[@value=' Send Push Notification']")).click();
            driver.findElement(By.xpath("//a[text()='   Show more ']")).click();
            driver.findElement(By.xpath("//a[text()='Push Notification']")).click();
            WebElement sorting_hub1=driver.findElement(By.xpath("(//select[@id='element1'])[1]"));
			Select select8=new Select(sorting_hub1);
			select8.selectByVisibleText(" ROHTAK SORTING HUB");
			WebElement  notificationtype2=driver.findElement(By.xpath("(//select[@name='notificationtype'])[1]"));
            Select select9=new Select(notificationtype2);
            select9.selectByVisibleText("Maintenance ");
            WebElement Users2=driver.findElement(By.xpath("(//select[@id='element1'])[2]")); 
            Select select10=new Select(Users2);
            select10.selectByVisibleText(" Peer App Users ");
            driver.findElement(By.xpath("//input[@name='title']")).sendKeys("We are Back");
            driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("We are Back! Enjoy ordering.");
            //driver.findElement(By.xpath("//input[@value=' Send Push Notification']")).click();
            driver.findElement(By.xpath("//a[text()='   Show more ']")).click();
			//Logout
	          Thread.sleep(5000);
	            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
	          Thread.sleep(5000);
	           driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
}};
