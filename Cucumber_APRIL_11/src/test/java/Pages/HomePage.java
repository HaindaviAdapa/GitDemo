package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;



public void passdriver(WebDriver driver1) {
	
	
	this.driver=driver1;
	PageFactory.initElements(driver,this);
	
}


@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
WebElement Admin;

@FindBy(xpath="//a[text()='Logout']")
WebElement logout;



public void Logout() {
	
	Admin.click();
	logout.click();  
		
	
	
}	
	
}
