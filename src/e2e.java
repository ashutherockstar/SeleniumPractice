
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com"); // URL in the browser

		driver.findElement(By.xpath(
				"(//*[@class = 'css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73'])[1]"))
				.click();

		driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'AMD')]")).click();
		driver.findElement(By.xpath("//div[@class = 'css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).click();
		driver.findElement(By.xpath(
				"//div[@class = 'css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']//following::div[9]"))
				.click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[3]")).click();
		for (int i = 1; i < 5; i++)
		{
			driver.findElement(By.xpath("(//div[@data-testid= 'Adult-testID-plus-one-cta'])")).click();

		}
		driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-14lw9ot r-pm2fo r-11u4nky r-z2wwpe r-1phboty r-ou6ah9 r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'])[2]"))
				.click();
		driver.findElement(By.xpath("//div[contains(text() , 'Students')]//preceding::div[1]")).click();
		driver.findElement(By.xpath(
				"//div[@class = 'css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']"))
				.click();
	}

}
