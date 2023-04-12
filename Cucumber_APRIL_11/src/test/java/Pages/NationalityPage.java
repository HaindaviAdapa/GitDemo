package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NationalityPage {
	
WebDriver driver;

public void passdriver(WebDriver driver1) {
	
	this.driver=driver1;
	PageFactory.initElements(driver,this);
	
}

@FindBy(xpath="//span[text()='Admin']")
WebElement admin;

@FindBy(xpath="//a[text()='Nationalities']")
WebElement nationalities;

@FindBy(xpath="//i[@class='oxd-icon bi-plus oxd-button-icon']")
WebElement Addbutton;

@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
WebElement nationalitytext;

@FindBy(xpath="//button[@type='submit']")
WebElement Submit;






public void NavigateNationalityPage() {
	
	
	admin.click(); //Admin
	nationalities.click();//Nationalities
	  
	
	
}

public void AddNationality(String NationalityText) throws InterruptedException {
	
	Addbutton.click();
	nationalitytext.sendKeys(NationalityText);
		
		Thread.sleep(5000);
		Submit.click();

	
	
	
	
}


}
