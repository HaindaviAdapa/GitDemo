package GlueCode;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.NationalityPage;
import Pages.SkillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;
	
	
	@Given("launch chrome browser")
	public void launch_chrome_browser() {
	    
	System.setProperty("webdriver.chrome.driver","c:\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	}
	@Then("Open application URL {string}")
	public void open_application_url(String TestURL) {
	    
	driver.get(TestURL);
	
	}
	@Given("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String Username, String Password) {
	    
		LoginPage L1= new LoginPage();
		L1.passdriver(driver);
		L1.Login(Username, Password);
	
	}
	@Then("User navigates to Skills Page")
	public void user_navigates_to_skills_page() {
		
		SkillsPage S1= new SkillsPage();
		S1.passdriver(driver);
		S1.NavigateToSkillsPage();
		
	}
	@When("User create Skill record as")
	public void user_create_skill_record_as(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
	
		List<List<String>>SkillData=dataTable.cells();
		
		System.out.println("Number of rows:"+SkillData.size());
		
		for(int i=0;i<SkillData.size();i++) {
			
			System.out.println(SkillData.get(i).get(0));
			
			String SkillName=SkillData.get(i).get(0);
			
			String SkillDescription=SkillData.get(i).get(0);
			
			System.out.println("_______________________"); {
				
				
				
				SkillsPage S2= new SkillsPage();
				S2.passdriver(driver);
				S2.AddSkills(SkillName,SkillDescription);
			}
			}
	
	}
	@Then("User navigates to Nationality Page")
	public void user_navigates_to_nationality_page() {
		
		NationalityPage N1= new NationalityPage();
		N1.passdriver(driver);
		N1.NavigateNationalityPage();
	   
	
	
	}
	@When("User create Nationality record as")
	public void user_create_nationality_record_as(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	   
	List<Map<String,String>>NationalityData=dataTable.asMaps(String.class,String.class);
	
	System.out.println("Number of rows:"+NationalityData.size());
	
	for(int i=0;i<NationalityData.size();i++) {
		
    System.out.println(NationalityData.get(i).get("NationalityText"));
	
    String NationalityText=NationalityData.get(i).get("NationalityText");
    
    System.out.println("______________________"); {
    	
    	NationalityPage N2= new NationalityPage();
    	N2.passdriver(driver);
    	N2.AddNationality(NationalityText);
    	
    }
		
	}
		
	}

	@Then("User logout")
	public void user_logout() {
		
		HomePage H1= new HomePage();
		H1.passdriver(driver);
		H1.Logout();
	   }
	@Then("User close browser")
	public void user_close_browser() {
	    
	driver.close();
	
	
	}
	
	
	
	
	
}
