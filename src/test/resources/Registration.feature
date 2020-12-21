#Author: YashG
@registration
Feature: registration

Scenario: Failure in registration on leaving the email empty 
Given User is on registration page
When user leaves email blank
Then display email not entered msg

Scenario: Failure in registration on leaving the mobileNo empty 
Given User is on registration page
When user leaves mobileNo blank
Then display mobile not entered msg
 
Scenario: Failure in registration on not selecting the terms 
Given User is on registration page
When user doesnot select terms
Then display terms not selected msg


Scenario: Failure in registration on not selecting the captcha 
Given User is on registration page
When user doesnot select captcha
Then display captcha not selected msg