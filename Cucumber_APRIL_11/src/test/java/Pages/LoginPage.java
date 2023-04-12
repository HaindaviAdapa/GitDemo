package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
public void passdriver(WebDriver driver1)	{
	
	this.driver=driver1;
	PageFactory.initElements(driver,this);
	
}

@FindBy(xpath="//input[@name='username']")
WebElement UserName;

@FindBy(xpath="//input[@name='password']")
WebElement PassWord;

@FindBy(xpath="//button[@type='submit']")
WebElement Submit;



public void Login(String Username,String Password) {
	
	UserName.sendKeys(Username);
	PassWord.sendKeys(Password);
	Submit.click();
	  
	
	
	
}
}
