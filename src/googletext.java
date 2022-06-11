import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googletext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement weString =driver.findElement(By.xpath("//*[@id ='SIvCob']"));
		String strElement = weString.getText();
		
		System.out.println(driver.findElement(By.xpath("//*[@id ='SIvCob']")).getText().split(":")[0]);
		
//		String returnedString = removeLastChar(s);
		System.out.println(removeLastChar(strElement));;

	}

	private static String removeLastChar(String s) {
		// TODO Auto-generated method stub
		return (s == null || s.length() == 0) ? null : (s.substring(0 , s.length()-1));
	}

}
