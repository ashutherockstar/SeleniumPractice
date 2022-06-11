import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AssertionPractice {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser

//			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//			Assert.assertFalse(true);
			for(int i =0 ; i< 2; i++) {
		    Assert.assertFalse(driver.findElement(By.cssSelector("input[value ='option1']")).isSelected());
			Thread.sleep(3000);

			driver.findElement(By.cssSelector("input[value ='option1']")).click();

			Assert.assertTrue(driver.findElement(By.cssSelector("input[value ='option1']")).isSelected());
			
			}
			
			
			
			List<WebElement> dropdowns = driver.findElements(By.cssSelector("input[type = 'checkbox']"));
			int count  = 0;
			for(int j = 0 ; j < dropdowns.size() ; j++) {
				count = count + 1;
			}
			System.out.println("No. of Dropdown = "+ count);

			
			
			
			

//			Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		}

	}


