
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropDownValues {
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title = 'Search for products, brands and more']")).sendKeys("mobiles");
		Thread.sleep(5000);
		List<WebElement> eleList = driver.findElements(By.xpath("//*[contains(@class , 'lrtEPN _17d0yO')]"));
		for (WebElement ele : eleList){
			System.out.println(ele.getText());
		}



	}
}
