package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobsPage {
	
	
WebDriver driver;
By Admin=By.xpath("//span[text()='Admin']");
By Job=By.xpath("//span[text()='Job ']");
By Jobtitles=By.xpath("//a[text()='Job Titles']");
By Addbutton=By.xpath("(//button[@type='button'])[2]");
By Jobtitle=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
By Jobdescription=By.xpath("//textarea[@placeholder='Type description here']");
By Jobnote=By.xpath("//textarea[@placeholder='Add note']");
By Submitbutton=By.xpath("//button[@type='submit']");



public void passdriver(WebDriver driver1) {
	
	this.driver=driver1;
	
}



public void AddJobs(String JobTitle,String JobDescription,String JobNote) throws InterruptedException {
	
	driver.findElement(Admin).click(); //Admin
	driver.findElement(Job).click(); //Jobs
	driver.findElement(Jobtitles).click(); //Job Titles
	
	Thread.sleep(5000); 
	driver.findElement(Addbutton).click(); //Add button
	
	
	driver.findElement(Jobtitle).sendKeys(JobTitle);
	driver.findElement(Jobdescription).sendKeys(JobDescription);
	driver.findElement(Jobnote).sendKeys(JobNote);
	
	
	Thread.sleep(5000); //execution will be passed for 5 seconds
		
	driver.findElement(Submitbutton).click();  //Save

	
	
}
	
}
