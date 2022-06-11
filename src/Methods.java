
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Methods {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		//implicit wait - 2 seconds time out

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		
		WebElement countryTable = driver.findElement(By.xpath("//table[@id = 'countries']"));
		
		js.executeScript("arguments[0].scrollIntoView();", countryTable);
		
		List<WebElement> rowNum = driver.findElements(By.xpath("/html/body/div/div/div/main/article/div/div/table/tbody/tr"));
		System.out.println(rowNum.size());
		List<WebElement> ColNum = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td"));
		System.out.println(ColNum.size());
		boolean status = false;
		int count = 2 ;    
		int sum = -1;
		for(int i=2; i<=rowNum.size(); i++){
			
			WebElement CountryName = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td[2]"));
			String value = CountryName.getText();
			if(value.contains("India")) {
				status = true;
				break;	
			}
			count++;
			}
		
		System.out.println("Row No. Of Country India = "+ count);
		
		for(int j=2;j<=rowNum.size();j++) {
			WebElement CountryLanguage =  driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+j+"]/td[5]"));		
			String Language = CountryLanguage.getText();
			if(Language.contains("English")) {
				sum = sum + 1;
			}
			
		}
		System.out.println("No. Of Countries Speak Primary Language as English = "+ sum);
		
		for(int k=2;k<=rowNum.size();k++) {
			WebElement CountryCurrency =  driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+k+"]/td[4]"));		
			String Currency = CountryCurrency.getText();
			WebElement NameofCountry = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+k+"]/td[2]"));
			String Country = NameofCountry.getText();
			if(Currency.contains("Euro")) {
				System.out.println("Country Having Currency As Euro = " + Country);
			}
			
		}
		System.out.println("All Details are extracted correctly");
		driver.quit();
        }
}
