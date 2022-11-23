package com.smarttechqa.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClassTec {


	public static void setUp(){

		//my git hub token:            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

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");  ===>for window PC
	//	System.setProperty("webdriver.chrome.driver", "./Application /chromedriver");  //===>for Mac
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.smarttechqa.com/login");
		
		
		//driver.findElement(By.id("email")).sendKeys("testuser@gmail.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testuser@email.com");
		
		//driver.findElement(By.id("password")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		
		System.out.println(driver.getTitle()); 
		
		//driver.quit();
		
	
	
	
	}
	
	
	public static void main(String[] args) {
		BaseClassTec.setUp();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}