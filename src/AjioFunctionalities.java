import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioFunctionalities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh Ranjan\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
        WebElement shoeEnter = driver.findElement(By.xpath("//input[@aria-owns = 'react-autowhatever-1']"));
        shoeEnter.sendKeys("Shoes");
        shoeEnter.sendKeys(Keys.ENTER);
        driver.manage().window().maximize();
        List<WebElement> weShoes=driver.findElements(By.xpath("//*[@class = 'rilrtl-lazy-img  rilrtl-lazy-img-loaded']"));
        System.out.println(weShoes.size());
       // System.out.println(weShoes.toString());
        ArrayList<Integer> prices= new ArrayList<Integer>();
        
       String[] strprices = new String[10];
        int[]  intPrices = new int[10];
        WebElement wediscount;

        for(int i=1 ; i <= weShoes.size();i++ ) {
           System.out.println(driver.findElements(By.xpath("(//*[@class = 'nameCls'])")).get(i).getText())
           ;

//            System.out.println(driver.findElements(By.xpath("(//*[@class = 'price  '])")).get(i).getText().split(" ")[1].trim());
            WebElement wePrices = driver.findElements(By.xpath("(//*[@class = 'price  '])")).get(i);

            String price= wePrices.getText().substring(1).replace(",","");
            System.out.println(price);
            boolean t = driver.findElement(By.xpath("(//*[@class = 'discount'])")).isDisplayed();
            if (t) {
               wediscount =driver.findElements(By.xpath("(//*[@class = 'discount'])")).get(i);
               String discount = wediscount.getText().split(" ")[0].replace("("," ").trim();   
               System.out.println("Discount = "+discount);
            } else {
               System.out.println("Element is not dispalyed");
            }

            prices.add(Integer.parseInt(price));

//            strprices[i-1] = wePrices.getText();
//            intPrices[i-1]= Integer.parseInt(strprices[i-1]);
//            System.out.println(intPrices[i-1]);
        }
       
    Collections.sort(prices);
	System.out.println("Max prise"+prices.get(weShoes.size()-1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
