
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectChkBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		List<WebElement> noofDays = driver.findElements(By.xpath("//*[@type = 'checkbox' and @class = 'form-check-input']"));
		System.out.println(noofDays.size());
//		for(int i = 0 ; i < noofDays.size() ; i++) {
//			noofDays.get(i).click();
//			Thread.sleep(2000);
//		}
		
//		for(WebElement day : noofDays) {
//			day.click();
//			Thread.sleep(2000);
//		}
//		for(int i = 0 ; i < noofDays.size() ; i++) {
//			String strday = noofDays.get(i).getAttribute("id").trim();
//			if(strday.contains("thursday") || strday.contains("friday") || strday.contains("monday")  ) {
//				noofDays.get(i).click();
//			}
//		}
		
//		for(int i = noofDays.size()-1 ; i >noofDays.size()-3   ; i--) {
//			noofDays.get(i).click();
//	}
		for(int i = 0 ; i < noofDays.size()- 5    ; i++) {
			noofDays.get(i).click();
	}
	}

}
