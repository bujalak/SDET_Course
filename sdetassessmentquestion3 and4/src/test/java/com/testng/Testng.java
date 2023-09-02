package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Testng {

	 
		
		WebDriver driver;
  
		
		@Test
		
		@BeforeMethod
		
		public void setup() {
			WebDriverManager.edgedriver().setup();
			
		 driver = new EdgeDriver();
			
			driver.get("https://www.redbus.in/");
			
			
		}
		
		@AfterMethod
		
		public void close() {
			driver.quit();
			
		}

	}


