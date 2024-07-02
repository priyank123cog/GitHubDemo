package Selenium.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowser {
	
	public WebDriver driver;
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		WebElement Gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Gmail.click();

	}

}

   //tagname[@attribute='value']
