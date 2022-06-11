import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String text="Rahul";

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		WebElement wetext = driver.findElement(By.xpath("(//*[@id= 'SIvCob']/text())[1]"));
		String strText = wetext.getText();
		System.out.println(strText);
		System.out.println(wetext);
		
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());



		driver.switchTo().alert().dismiss();
	}

}
