import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");
		WebElement ChkboxLabel = driver.findElement(By.xpath("//label[@for = 'bmw']"));
		String strChkLabel = ChkboxLabel.getText().trim() ;
		System.out.println(strChkLabel);
		WebElement weDropDown = driver.findElement(By.xpath("//select[@id = 'dropdown-class-example']"));
		Select dropdown = new Select(weDropDown) ; 
		dropdown.selectByVisibleText(strChkLabel);
		driver.findElement(By.xpath("//input[@id = 'name']")).sendKeys(strChkLabel);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'alertbtn']")).click();
		String stralerText = driver.switchTo().alert().getText().split(",")[0].split(" ")[1].trim();
		System.out.println(stralerText);
		Assert.assertEquals(strChkLabel, stralerText);
		
		if(stralerText.contains(strChkLabel)) {
			System.out.println("Text is Same");
		}else {
			System.out.println("Text is Not Same");
		}
		
		
		
	}

}
