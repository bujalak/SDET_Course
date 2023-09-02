package makemytripassesment;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//Store the web element
		WebElement iframe = driver.findElement(By.cssSelector("#webklipper-publisher-widget-container-notification-frame"));
		//Switch to the frame
		driver.switchTo().frame(iframe);
		driver.findElement(By.className("close")).click();
		
        //driver.switchTo().alert().dismiss();
	
		// Return to the top level
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//driver.findElement(By.className("imageSlideContainer")).click();
		  
		
		WebElement roundTripRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-cy=\"roundTrip\"]")));
        roundTripRadio.click();
        
        // Enter From and To locations
        WebElement fromLocation = driver.findElement(By.id("fromCity"));
        WebElement toLocation = driver.findElement(By.id("toCity"));
        
        fromLocation.sendKeys("HYD");
        Thread.sleep(2000);
        java.util.List<WebElement> drop=driver.findElements(By.xpath("//li[@role=\"option\"] //div[@class=\"pushRight font14 lightGreyText latoBold\"]"));

      
            for(int i=0; i<drop.size(); i++) {

            	if(drop.get(i).getText().contains("HYD")) {
            		drop.get(i).click();
            	    System.out.println("clicked");
                    break;
            	}
            }
        
        
        
        
        toLocation.sendKeys("MAA");
        java.util.List<WebElement> drop1=driver.findElements(By.xpath("//li[@role=\"option\"] //div[@class=\"pushRight font14 lightGreyText latoBold\"]"));

        
        for(int i=0; i<drop1.size(); i++) {

        	if(drop1.get(i).getText().contains("MAA")) {
        		drop1.get(i).click();
        	    System.out.println("clicked");
                break;
        	}
        }
        driver.findElement(By.xpath("//span[text()='Departure']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@aria-label,\"Thu Sep 21 2023\")]"))).click();

        Thread.sleep(3000);

        //Select RETURN Date (31 August 2023)
        driver.findElement(By.xpath("//span[text()='Return']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@aria-label,\"Sat Sep 23 2023\")]"))).click();
        driver.findElement(By.xpath("//a[text()='Search']")).click();


	}
}
