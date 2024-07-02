package com.newtours.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	
	public static WebDriver driver;
	
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement Username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	@FindBy(xpath="//input[@name='submit']")
	WebElement submit;
	
	@FindBy(xpath="//a[text()='SIGN-OFF']")
	WebElement Signoff;
	
	
	public void setUsername(String user) {
		
		Username.sendKeys(user);
	}
	
public void setPassword(String pword) {
		
	Password.sendKeys(pword);
	}

public void submitlink() {
	
	submit.click();
	}

public void signofflink() {
	
	Signoff.click();
	}
	

   public Loginpage(WebDriver d) {
	   
	   this.driver=driver;
	   
	   driver=d;
	   PageFactory.initElements(d,this);
	   
	   
   }

}
