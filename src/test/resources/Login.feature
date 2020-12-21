#Author : YashG
@Login
Feature: login
Scenario: Successful login with valid data
Given user is on login page
When user enters valid email, valid password
Then navigate to homepage

Scenario: UnSuccessful login due to wrong email and correct password 
Given user is on login page
When user enters incorrect email and correct password
Then display login failed message

Scenario: UnSuccessful login due to correct email and wrong password 
Given user is on login page
When user enters correct email and incorrect password
Then display login failed message

Scenario: UnSuccessful login due to wrong email and wrong password 
Given user is on login page
When user enters incorrect email and incorrect password
Then display login failed message


Scenario: Prompt user to enter the data when he leaves the login fields empty
Given user is on login page
When user doesnot enter either username or password
Then display appropriate message

