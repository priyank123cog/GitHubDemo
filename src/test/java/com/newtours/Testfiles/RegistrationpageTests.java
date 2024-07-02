package com.newtours.Testfiles;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.newtours.Base.Registrationpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationpageTests {
	
	public static WebDriver driver;
	
	@BeforeTest
	
	public void Beforetest() {
		
		Logger logger=Logger.getLogger("RegistrationpageTests");
		DOMConfigurator.configure("build.xml");
		logger.info("Browser opened");
		WebDriverManager.chromedriver().setup();
		
	  	driver=new ChromeDriver();
	  	
		driver.manage().window().maximize();
		logger.info("Entering the URL");
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
	
		
	}
	@AfterTest
	public void tearDown() {
		
		//driver.quit();
	}
	
	@Test
	
	public void Registration() {
		
		Registrationpage Rgpage=new Registrationpage(driver);
		Rgpage.setfirstName("priyank");
		Rgpage.setLastName("Chunduru");
		Rgpage.setAddress("Hyderabad");
		Rgpage.setCity("Telangana");
		Rgpage.setCountry("India");
		Rgpage.setcpassword("Bhanu@#9912");
		Rgpage.setEmail("bhanu.oct14@gmail.com");
		Rgpage.setpassword("Bhanu@#9912");
		Rgpage.setphone("9912444729");
		Rgpage.setpostalcode("500072");
		Rgpage.setstate("Tel");
		Rgpage.setuserName("bhanu");
		Rgpage.submitlink();
		
				
	
	
	//validation
	
	if(driver.getPageSource().contains("Thank you for registering")) {
		
		System.out.println("your registered successfully");
	}
	else
	{
		System.out.println("your registration failed");
	
	}

	
	
	 
}

}
