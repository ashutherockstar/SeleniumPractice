import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class countNbrofBrokenlinks {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List <WebElement> brokenLinks = driver.findElements(By.tagName("a"));
		int brokrnLinks = 0;
		for(WebElement ele : brokenLinks) {
			String url = ele.getAttribute("href");
			if(url == null || url.isEmpty()) {
				System.out.println("Url Is Empty");
				continue;
			}
			URL link = new URL(url);
			try {
				HttpURLConnection conn = (HttpURLConnection) link.openConnection();
				conn.connect();
				if(conn.getResponseCode() > 400) {
					System.out.println(conn.getResponseCode() + "is a" + url + "broken");
					brokrnLinks++;
				}else {
					System.out.println(conn.getResponseCode() + "is a" + url + "not broken");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("no of Broken Links" + brokrnLinks );
		driver.quit();
	}

}
