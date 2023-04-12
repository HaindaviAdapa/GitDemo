package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NationalityPage {

	WebDriver driver;
	By Admin=By.xpath("//span[text()='Admin']");
	By Nationalities=By.xpath("//a[text()='Nationalities']");
	By AddButton=By.xpath("(//button[@type='button'])[2]");
	By Nationalitytext=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By Savebutton=By.xpath("//button[@type='submit']");
	
	
	
	
	public void passdriver(WebDriver driver1) {
		
		
		this.driver=driver1;
		
	}
	public void AddNationality(String NationalityText) throws InterruptedException {
		
		driver.findElement(Admin).click(); //Admin
		  driver.findElement(Nationalities).click();//Nationalities
		  driver.findElement(AddButton).click(); //Addbuttonn
		  driver.findElement(Nationalitytext).sendKeys(NationalityText);
			
			Thread.sleep(5000);
			  driver.findElement(Savebutton).click();

		
		
		
		
	}
	
	
	
	
}




