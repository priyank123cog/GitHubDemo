package com.newtours.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practicejavamouse {

	public WebDriver driver;
		@SuppressWarnings("deprecation")
		@BeforeMethod 
		
		public void openSite()
		{
			WebDriver driver=new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		
		@AfterMethod
		
		public void tearDownclasss()
		{
			
			driver.quit();
		}
		
		@Test 
		
		public void Login()
		{		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//li[1]")).click();
		
		WebElement UserManagement = driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']//li[1]"));
		
		
		//Actions actions=new Actions(driver);
		
	
		}
}
