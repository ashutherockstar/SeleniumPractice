import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowhandleandGetwindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//a[text()  = 'OrangeHRM, Inc']")).click();
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> it = windowID.iterator();
		String parentid = it.next();
		String Childid = it.next();
		Thread.sleep(3000);
		
//		driver.switchTo().window(parentid);
//		System.out.println(driver.getTitle());
//		Thread.sleep(3000);
//		driver.switchTo().window(Childid);
//		System.out.println(driver.getTitle());
//		driver.getTitle();
		for(String win : windowID) {
//			driver.switchTo().window(win);
			String getTitle = driver.switchTo().window(win).getTitle();
			if(getTitle.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS") ) {
				driver.close();
			}
		}
		
		
		
	}

}
