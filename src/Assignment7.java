import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement Scroll = driver.findElement(By.cssSelector("table[name = 'courses']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Scroll);
		List <WebElement> weRowSize = driver.findElements(By.xpath("//table[@name = 'courses']//tr"));
		System.out.println("The Row Size = "+weRowSize.size());
		List <WebElement> weColSize = driver.findElements(By.xpath("//table[@name = 'courses']//tr[1]/th"));
		System.out.println("The Column Size = "+weColSize.size());
		for(int i = 1 ; i < weRowSize.size() - 1 ; i++) {
			String rowContent = driver.findElements(By.xpath("//table[@name = 'courses']//tr")).get(i).getText();
			if(i == 3) {
				System.out.println(driver.findElements(By.xpath("//table[@name = 'courses']//tr")).get(i).getText());
				break;
			}
		}
		
		
	}

}
