package com.newtours.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {
	
	public static WebDriver driver;
	
	
		
	
	/*
	 * By firstName = By.xpath("//input[@name='firstName']"); By LastName =
	 * By.xpath("//input[@name='lastName']"); By phone =
	 * By.xpath("//input[@name='phone']"); By Email =
	 * By.xpath("//input[@name='userName']"); By Address =
	 * By.xpath("//input[@name='address1']"); By city =
	 * By.xpath("//input[@name='city']"); By State =
	 * By.xpath("//input[@name='state']"); By postalcode =
	 * By.xpath("//input[@name='postalCode']"); By Country =
	 * By.xpath("//select[@name='country']"); By userName =
	 * By.xpath("//input[@id='email']"); By password =
	 * By.xpath("//input[@name='password']"); By cPassword =
	 * By.xpath("//input[@name='confirmPassword']"); By
	 * submit=By.xpath("//input[@name='submit']");
	 */
	 
	 
	 @FindBy(xpath=("//input[@name='firstName']"))
	 WebElement firstName;
	 @FindBy(xpath="//input[@name='phone']")
	 WebElement phone;
	 @FindBy(xpath="//input[@name='lastName']")    //people use this pattern
	 WebElement lastName;
	 @FindBy(xpath="//input[@name='userName']")
	 WebElement Email;
	 @FindBy(xpath="//input[@name='address1']")
	 WebElement Address;
	 @FindBy(xpath="//input[@name='city']")
	 WebElement City;
	 @FindBy(xpath="//input[@name='state']")
	 WebElement state;
	 @FindBy(xpath="//input[@name='postalCode']")
	 WebElement postalcode;
	 @FindBy(xpath="//select[@name='country']")
	 WebElement Country;
	 @FindBy(xpath="//input[@id='email']")
	 WebElement userName;
	 @FindBy(xpath="//input[@name='password']")
	 WebElement password;
	 @FindBy(xpath="//input[@name='confirmPassword']")
	 WebElement cpassword;
	 @FindBy(xpath="//input[@name='submit']")
	 WebElement submit;
	 
	 
	 
	 
	  public Registrationpage(WebDriver d){
		 this.driver=driver;  //created constructor for the class 
		 driver=d;
		 PageFactory.initElements(d, this);
		  }
	 
	 public void setfirstName(String fName) {
		 
		 firstName.sendKeys(fName);
		 
		  }
  public void setLastName(String LName) {
		 
	lastName.sendKeys(LName);
		 
		  }
  public void setphone(String phnumber) {
		 
	  phone.sendKeys(phnumber);
			 
			  }
  public void setEmail(String mail) {
		 
	  Email.sendKeys(mail);
			 
			  }
  public void setAddress(String Addres) {
		 
	  Address.sendKeys(Addres);
			 
			  }
  public void setCity(String citee) {
		 
	  City.sendKeys(citee);
			 
			  }
  public void setstate(String sta) {
		 
	  state.sendKeys(sta);
			 
			  }
  public void setpostalcode(String code) {
		 
	  postalcode.sendKeys(code);
			 
			  }
  public void setCountry(String cuntry) {
		 
	  Country.sendKeys(cuntry);
			 
			  }
  public void setuserName(String user) {
		 
	  userName.sendKeys(user);
			 
			  }
  public void setpassword(String pawd) {
		 
	  password.sendKeys(pawd);
			 
			  }
  public void setcpassword(String cpass) {
		 
	  cpassword.sendKeys(cpass);
			 
			  }
  public void submitlink() {
		 
	  submit.click();
			 
			  }
	
}