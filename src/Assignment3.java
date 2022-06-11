import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, 5);
		driver.findElement(By.cssSelector("input[name = 'username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[name = 'password']")).sendKeys("learning");
//		
		driver.findElement(By.xpath("//span[contains(text(),' User')]//following::span[1]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id = 'okayBtn']")));
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id = 'okayBtn']")).click();

		WebElement wedropDown = driver.findElement(By.xpath("(//*[@data-style = 'btn-info'])"));
		Select dropdown =new Select(wedropDown);
		dropdown.selectByValue("stud");
		driver.findElement(By.xpath("(//*[@id= 'terms'])")).click();
		driver.findElement(By.xpath("//*[@id = 'signInBtn']")).click();
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class = 'card-footer'])[1]")));
		Thread.sleep(3000);
		WebElement weScroll = driver.findElement(By.xpath("(//*[@class = 'card-footer'])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", weScroll);
//		String[] itemstobeadded = { "Cucumber", "Brocolli", "Beetroot" };
		List <WebElement> itemsadded = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<itemsadded .size();i++)

		{

			itemsadded.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();
		
		
		
		
		
		
		
		
	}

}
