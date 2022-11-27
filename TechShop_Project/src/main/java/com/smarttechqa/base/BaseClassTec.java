package com.smarttechqa.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.smarttechqa.utilities.UtilitiesTec;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClassTec  {

	public static WebDriver driver;
	public static void setUp() throws IOException {
		//System.setProperty("webdriver.chrome.driver", "./Application /chromedriver"); 
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// use for the all dom page to wait. it is part of selenium challenge
        driver.get("https://www.smarttechqa.com/");
        
        
        /* 
       // login scenario
      UtilitiesTec.getExplicitWait( driver.findElement(By.xpath("//a[@href='/login']")), 5);
        driver.findElement(By.xpath("//a[@href='/login']")).click();
		//driver.findElement(By.id("email")).sendKeys("testuser@gmail.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testuser@email.com");
		UtilitiesTec.getHighLighter(driver.findElement(By.xpath("//*[@id='email']")));
		UtilitiesTec.takeScreenShot();
		//driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123456");
		UtilitiesTec.getExplicitWait(driver.findElement(By.xpath("//*[@class='btn btn-primary']")), 5);
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		System.out.println(driver.getTitle()); 
		//Thread.sleep(5000);
		//driver.quit(); 
		
		 
		UtilitiesTec.getExplicitWait(driver.findElement(By.xpath("//a[@href='/cart']")), 5);
		driver.findElement(By.xpath("//a[@href='/cart']")).click();
		//driver.findElement(By.linkText("Go Back")).click(); //this will take me back to the home page from the cart page
		driver.findElement(By.partialLinkText("Go")).click();//same as line 48
		
		
		driver.findElement(By.name("q")).sendKeys("iphone"); //Sends keys to the searchbox
		//driver.findElement(By.cssSelector(".p-2 btn btn-outline-success")).click();
		//Thread.sleep(5000);
		UtilitiesTec.getExplicitWait(driver.findElement(By.xpath("//*[text()='Search']")), 5);
		
		
		driver.navigate().back(); //This takes to the previous page.
		driver.navigate().refresh();//this refesh the page 
		//driver.navigate().to("https://www.smarttechqa.com");//same thjing as line 19
		
		driver.quit(); 
		
		*/
	
	}
	
	
	
	
	
	
      public static void main(String[] args) throws IOException  {
		
		BaseClassTec.setUp();
	
      }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
