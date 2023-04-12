Feature: Iam doing automation functionality of Add skills and Add Nationality in OrangeHRM.


Background: Common Steps

Given launch chrome browser
Then Open application URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


@Smoke
Scenario: Add Skills
Given User enters Username as "Admin" and Password as "admin123"
Then User navigates to Skills Page
When User create Skill record as 
|Skill108|Skill108 desc|
|Skill109|Skill109 desc|
|Skill110|Skill110 desc|
Then User logout
And User close browser

@Sanity @Smoke
Scenario: Add Nationality
Given User enters Username as "Admin" and Password as "admin123"
Then User navigates to Nationality Page
When User create Nationality record as 
|NationalityText|
|Nationality108 |
|Nationality109 |
|Nationality110 |
Then User logout
And User close browser





