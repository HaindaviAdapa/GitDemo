package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillsPage {
	
	WebDriver driver;
		
	public void passdriver(WebDriver driver1)	{
		
		this.driver=driver1;
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(xpath="(//a[@class='oxd-main-menu-item'])[1]")
	WebElement Admin;
	
	@FindBy(xpath="//span[text()='Qualifications ']")
	WebElement qualification;
	
	@FindBy(xpath="//a[text()='Skills']")
	WebElement skill;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-plus oxd-button-icon']")
	WebElement Addbutton;
	

	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement skillName;
	
	@FindBy(xpath="//textarea[ @placeholder='Type description here']")
	WebElement skillDescription;
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement savebutton;
	

	public void NavigateToSkillsPage() {
		
		Admin.click();
		qualification.click();
		skill.click();
		
		
	}
	
public void AddSkills(String SkillName,String SkillDescription) throws InterruptedException {
		
	Addbutton.click();
	skillName.sendKeys(SkillName);
	skillDescription.sendKeys(SkillDescription);
	
	Thread.sleep(5000);
	savebutton.click();
  
}
	}
	



