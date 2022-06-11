import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class autoSuggestiveDropDownAndSorting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("//*[@class =\"nav navbar-nav\" ]/ul/li[2]/a")).click();
		WebElement dropDowns = driver.findElement(By.xpath("(//*[@name = 'category_id'])"));
		Select allOptions = new Select(dropDowns);
		List<WebElement> listDrpDown = allOptions.getOptions();
		ArrayList originalList = new ArrayList();
		ArrayList tempList = new ArrayList();
		for(WebElement l:listDrpDown) {
			originalList.add(l.getText());
			tempList.add(l.getText());
		}
		System.out.println(originalList);
		System.out.println("Before Sorting" +tempList);
		Collections.sort(tempList);
		System.out.println(originalList);
		System.out.println("After Sorting" +tempList);
		if(originalList.equals(tempList)) {
			System.out.println("Sorted");
		}else {
			System.out.println("Not Sorted");
		}
		
//		--------------------------------------
		WebElement weEnterPlace = driver.findElement(By.id("autocomplete"));
		weEnterPlace.clear();
		weEnterPlace.sendKeys("Toronto");
		String text;
		do {
			weEnterPlace.sendKeys(Keys.ARROW_DOWN);
			text = weEnterPlace.getAttribute("value");
			if(text.equals("Toronto, OH, USA")) {
//				weEnterPlace.clear();
				weEnterPlace.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(3000);
		}while(!text.isEmpty());
//		List<WebElement> weSearchPlace = driver.findElements(By.xpath("//*[@class = 'pac-item']"));
//		System.out.println(weSearchPlace.size());
//		for(int i = 1 ; i <=  weSearchPlace.size(); i++) {
//			WebElement weGetPlace = driver.findElement(By.xpath("(//*[@class = 'pac-item'])["+i+"]"));
//			String strPlaceName = weGetPlace.getText();
//			if(strPlaceName.equals("Toronto, OH, USA")) {
//				 driver.findElement(By.id("autocomplete")).sendKeys(strPlaceName);
//				 break;
//			}
//		}
		

		
		
		
		
		
//		driver.quit();
		
		
		
		
		
		
	
		
//		for(WebElement t : dropDowns) {
//			System.out.println(t.getText());
//		}
//		Collections.sort((List<T>) dropDowns);
		
	}

}
