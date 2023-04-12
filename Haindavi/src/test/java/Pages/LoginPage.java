package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By Username=By.xpath("//input[@name='username']");
	By Password=By.name("password");
	By SubmitButton=By.xpath("//button[@type='submit']");
	

	public void Passdriver(WebDriver driver1) {
		
		this.driver=driver1;
		
	}
  public void Login(String UserName,String PassWord) {
	  
	  driver.findElement(Username).sendKeys(UserName);
		driver.findElement(Password).sendKeys(PassWord);
		driver.findElement(SubmitButton).click();

	  
	  
	  
	  
	  
  }
}
