Feature: To validate the face book
Scenario: To Validate Login page
Given user enter the username and password
When user enter the valid the crdentials
    |   bala       |   java       |    
Then user verify successfully



Scenario: To Validate Login page for invalid user
Given user enter the username and password
When user enter the valid the crdentials
    |   aruna       |   aruna0425       |    
Then user verify successfully
