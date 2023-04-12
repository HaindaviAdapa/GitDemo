Feature: Iam doing automation of Add Jobs and Add Nationality in Orange HRM application

Background: Common Steps
Given User opens chrome browser
Then User opens application URL"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: Add Jobs
Given User enters Username as "Admin" and Password as "admin123"
When  User creates Jobs record as
  |JobTitle|JobDescription|JobNote|
  |K1      |K1 desc       |K1 Note|
  |K2      |K2 desc       |K2 Note|
Then User logout
And User close browser

Scenario: Add Nationality
Given User enters Username as "Admin" and Password as "admin123"
When  User creates Nationality record as
  |K1 Text|
  |K2 Text|    
Then User logout
And User close browser





