package com.newtours.Testfiles;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.newtours.Base.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginwithmultiplesetsofdata {
	
	
	public static WebDriver driver;
	
	@BeforeTest
	
	public void openBrowser() {
		
		driver=new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
	}
	
	@AfterTest
	
	public void tearDown() {
		
		driver.quit();
	}
	
	@Test
	
	public void Login() throws IOException {
		
		Loginpage Lpage=new Loginpage(driver);
	
	FileInputStream fis=new FileInputStream("C:\\Users\\PriyankAnusha\\eclipse-workspace\\POM\\excelData\\TestData.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int rowcount=sheet.getLastRowNum();  // Row count
	int coloumncount=sheet.getRow(1).getLastCellNum();//cell count
	
	for(int i=1;i<=rowcount;i++) {
		
		XSSFRow celldata=sheet.getRow(i);
		String user=celldata.getCell(0).getStringCellValue();
		String pword=celldata.getCell(1).getStringCellValue();
		
		
		Lpage.setUsername(user);
		Lpage.setPassword(pword);
		Lpage.submitlink();
		Lpage.signofflink();
		
		Actions actions=new Actions(driver);
		
			actions.contextClick().build().perform();	
	}
	
	
		
	}
	

}
