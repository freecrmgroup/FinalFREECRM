#Author : Himalayg
@AddingNewContacts

Feature: AddingNewContacts

Scenario: Successfully add contact with all valid data
Given user is on contacts tab
When user enters all valid data
Then Contact should be saved

Scenario: Alert when last name not provided
Given user is on contacts tab
When user leaves last name field blank
Then display alert message