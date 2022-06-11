import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		//implicit wait - 2 seconds time out

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("http://automationpractice.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@title = 'Log in to your customer account']")).click();
		
		WebElement CreateAnAccount = driver.findElement(By.xpath("//*[@class  = 'btn btn-default button button-medium exclusive']//span"));
		
		js.executeScript("arguments[0].scrollIntoView();", CreateAnAccount);
		
		driver.findElement(By.xpath("//*[@id  = 'email_create']")).sendKeys("ashu300997@gmail.com");
		
		CreateAnAccount.click();
		
		driver.findElement(By.xpath("//*[@id = 'id_gender1']")).click();
		driver.findElement(By.xpath("//*[@name ='customer_firstname' ]")).sendKeys("Peter");
		driver.findElement(By.xpath("//*[@name ='customer_lastname' ]")).sendKeys("Hamsberg");
		driver.findElement(By.xpath("//*[@name ='passwd' ]")).sendKeys("Peter@123");
		Select day = new Select(driver.findElement(By.xpath("//*[@id = 'days']")));
		day.selectByValue("28");
		Select month = new Select(driver.findElement(By.xpath("//*[@id = 'months']")));
		month.selectByValue("9");
		Select year = new Select(driver.findElement(By.xpath("//*[@id = 'years']")));
		year.selectByValue("1997");
		WebElement Address = driver.findElement(By.xpath("//*[text() = 'Your address']"));
		js.executeScript("arguments[0].scrollIntoView();", Address);
		driver.findElement(By.xpath("//*[@name ='company' ]")).sendKeys("TCS");
		driver.findElement(By.xpath("//*[@name ='address1' ]")).sendKeys("4381 W Flamingo Rd");
		driver.findElement(By.xpath("//*[@name ='address2' ]")).sendKeys("Las Vegas , North Carolina-89103");
		driver.findElement(By.xpath("//*[@name ='city' ]")).sendKeys("Las Vegas");
		Select State = new Select(driver.findElement(By.xpath("//*[@id = 'id_state']")));
		State.selectByVisibleText("North Carolina");
		WebElement PostalCode = driver.findElement(By.xpath("//*[@name  = 'postcode']"));
		js.executeScript("arguments[0].scrollIntoView();", PostalCode);
		PostalCode.sendKeys("89103");
		driver.findElement(By.xpath("//*[@name ='phone_mobile']")).sendKeys("(702) 944-3295");
		driver.findElement(By.xpath("//*[@name ='alias']")).clear();
		driver.findElement(By.xpath("//*[@name ='alias']")).sendKeys("2919 Deans Lane,Iuka");
		driver.findElement(By.xpath("//button[@name = 'submitAccount']//span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class ='logout']")).click();
		driver.findElement(By.xpath("//*[@title = 'Log in to your customer account']")).click();
		WebElement Emailid = driver.findElement(By.xpath("//*[@id ='email']"));
		js.executeScript("arguments[0].scrollIntoView();", Emailid);
		Emailid.sendKeys("ashuranjan300997@gmail.com");
		driver.findElement(By.xpath("//*[@id ='passwd']")).sendKeys("Peter@123");
		WebElement SignIn  = driver.findElement(By.xpath("//button[@id ='SubmitLogin']//span"));
		SignIn.click();
		System.out.println("Login Sucessfull");
		driver.quit();
        }
}
