import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name = driver.findElement(By.xpath("(//input[@name = 'name'])[1]"));
		name.sendKeys("Ashutosh Ranjan");
		driver.findElement(By.xpath("(//input[@name = 'email'])[1]")).sendKeys("ashutoshranjansingh458@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'exampleInputPassword1']")).sendKeys("AshutoshRanjan123");
		driver.findElement(By.id("exampleInputPassword1")).click();
		WebElement Gender = driver.findElement(By.id("exampleFormControlSelect1"));
		Select G = new Select(Gender);
		G.selectByVisibleText("Male");
		driver.findElement(By.cssSelector("input[value = 'option2']")).click();
		driver.findElement(By.name("bday")).sendKeys("12/25/1997");
		driver.findElement(By.cssSelector("input[value = 'Submit']")).click();
		Thread.sleep(2000);
		
		WebElement Sucessmsg = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Sucessmsg);
		String success = Sucessmsg.getText();
		System.out.println(success);
		
		
		
		
	}

}
