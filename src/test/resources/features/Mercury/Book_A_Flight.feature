@regressiontest 
Feature:  User should able to login to Application

@current
Scenario: User is able to login to  Application  
  Given User go to the Application "http://newtours.demoaut.com/"
  When User logs in as username "mercury" and password "mercury"
  Then Verify the page has been loaded successfully















