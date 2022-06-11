import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Locator1 {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		//implicit wait - 2 seconds time out

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("http://automationpractice.com/");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name = 'search_query']")).sendKeys("Printed dress");
		
		driver.findElement(By.name("submit_search")).click();
		
		Select dropdown = new Select(driver.findElement(By.id("selectProductSort")));
		
		dropdown.selectByVisibleText("Price: Lowest first");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		
		WebElement InStock = driver.findElement(By.xpath("//ul[@class = 'product_list grid row']//li[1]"));
		
		js.executeScript("arguments[0].scrollIntoView();", InStock);
		
		WebElement DressName = driver.findElement(By.xpath("(//*[@class = 'product-name'])[13]"));
		
		String strDressName =DressName.getText();
		
		System.out.println(strDressName);
		
		actions.doubleClick(InStock).perform();
		
		Thread.sleep(2000);
		
		WebElement AddToCart = driver.findElement(By.xpath("(//span[contains(text() , 'Add to cart')])"));
		
		AddToCart.click();
			   
        Thread.sleep(2000);
        
        WebElement CloseBtn = driver.findElement(By.xpath("(//*[@title = 'Close window'])"));
        
        CloseBtn.click();    
        
        WebElement ClickonCart = driver.findElement(By.xpath("//*[@title = 'View my shopping cart']"));
        
        js.executeScript("arguments[0].scrollIntoView();", ClickonCart);
        
        ClickonCart.click();
        
        Thread.sleep(2000);
        
        WebElement AddedDressName = driver.findElement(By.xpath("(//p[@class = 'product-name'])[2]"));
        
        js.executeScript("arguments[0].scrollIntoView();", AddedDressName);
        
        String strAddedDressName = AddedDressName.getText();
        
        System.out.println(strAddedDressName);
        
        Assert.assertEquals(strDressName, strAddedDressName);
        
        System.out.println("Verified Sucessfully");
        
        driver.quit();
        }



}




