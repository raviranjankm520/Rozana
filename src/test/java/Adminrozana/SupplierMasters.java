package Adminrozana;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SupplierMasters {
	@Test
	public void managedistributors() throws InterruptedException {
		 Logger logger = Logger.getLogger(Managedistributors.class.getName());
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
			driver.findElement(By.xpath("//span[text()='Manage Distributors']")).click();
            driver.findElement(By.xpath("//ul//li//a//span[text()='Supplier Masters']")).click();
            driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-info']")).click();
            driver.findElement(By.xpath("//input[@placeholder='Type GST or name , email ']")).sendKeys("09AAECF1722F1ZY");
            driver.findElement(By.xpath("//input[@value='search']")).click();
            driver.findElement(By.xpath("//a[text()='NEW SUPPLIER']")).click();
            driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test supplier");
            driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9608434452");
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ravisuplier@gmail.com");
            driver.findElement(By.xpath("//input[@name='gstinno']")).sendKeys("09AAECF1722F1ZY");
            driver.findElement(By.xpath("//input[@id='panNumber']")).sendKeys("BFGYU5678C");
            driver.findElement(By.xpath("//input[@name='supplier_contact_name']")).sendKeys("Ravi");
            driver.findElement(By.xpath("//input[@name='supplier_contact_phone']")).sendKeys("9608434452");
            driver.findElement(By.xpath("//input[@name='supplier_contact_email']")).sendKeys("ravisuplier@gmail.com");
            driver.findElement(By.xpath("//input[@name='country']")).clear();
            driver.findElement(By.xpath("//input[@name='country']")).sendKeys("India");
            WebElement state=driver.findElement(By.xpath("//select[@name='state']"));
            Select select=new Select(state);
            select.selectByVisibleText("Delhi");
            driver.findElement(By.xpath("//input[@name='city']")).sendKeys("New Delhi");
            driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("124501");
            WebElement supplier=driver.findElement(By.xpath("//select[@name='supplier_type']"));
            Select select2=new Select(supplier);
            select2.selectByVisibleText("Internal ");
            WebElement tax=driver.findElement(By.xpath("//select[@name='tax_type']"));
            Select select3=new Select(tax);
            select3.selectByVisibleText("Intra State");
            WebElement status=driver.findElement(By.xpath("//select[@name='status']"));
            Select select4=new Select(status);
            select4.selectByVisibleText("Inactive ");
            WebElement QC=driver.findElement(By.xpath("//select[@name='qc_required']"));
            Select select5=new Select(QC);
            select5.selectByVisibleText("Yes ");
            driver.findElement(By.xpath("//input[@name='po_expiry_duration'] ")).sendKeys("6Months");
            driver.findElement(By.xpath("//input[@name='bank_name']")).sendKeys("IDFC");
            driver.findElement(By.xpath("//input[@name='ifsc_code']")).sendKeys("IDFCN0282447");
            driver.findElement(By.xpath("//input[@name='branch_name'] ")).sendKeys("Mayur Vihar Phase-2");
            driver.findElement(By.xpath("//input[@name='account_number']")).sendKeys("IDFC0000000067");
            driver.findElement(By.xpath("//input[@name='account_holder_name']")).sendKeys("Test");
            WebElement internal=driver.findElement(By.xpath("//select[@name='internal_supplier_type']"));
            Select select6=new Select(internal);
            select6.selectByVisibleText("Special Approval ");
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//button[@class='close'])[1]")).click();
            WebElement suppliercategory =driver.findElement(By.xpath("//select[@name='supplier_category']"));
            Select select7=new Select(suppliercategory);
            select7.selectByVisibleText("D ");
            WebElement payment=driver.findElement(By.xpath("//select[@name='payment_terms']"));
            Select select8=new Select(payment);
            select8.selectByVisibleText(" Payment on Delivery (POD)");
            driver.findElement(By.xpath("//input[@name='secondary_email']")).sendKeys("ravisuplier1@gmail.com");
            driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Test123");
            WebElement file=driver.findElement(By.xpath("//select[@name='file_type']"));
            Select select9=new Select(file);
            select9.selectByVisibleText("VEF Form ");
            driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\Ravi Ranjan\\OneDrive\\Desktop\\Test data\\pin-codes-samlple-file.xlsx");
            driver.findElement(By.xpath("//button[text()='Add Supplier']")).click();
            //Logout
          Thread.sleep(5000);
            driver.findElement(By.xpath("//i[@class='demo-pli-male']/ancestor::li[@id='dropdown-user']")).click();
          Thread.sleep(5000);
           driver.findElement(By.xpath("//a[@href='https://dev.rozana.in/logout']")).click();
	}};
