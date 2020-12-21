#Author: snehashis
@Addingnewtask


Feature: Addingnewtask

Scenario: check that the customer is able to add new task for the company
Given User is on the home page
When user clicks on the task
And clicks the new button
Then an appropriate task tab is open

Scenario: check that the title field is not blank
Given user is on the task tab
When user gives a title for the task
And clicks the save button
Then the title is saved

Scenario: check that the title field is not blank
Given user is on the task tab
When user doesnot enter the title for the task
And clciks the save button
Then displays appropriate message

Scenario: to check that on clicking the cancel button all datas are removed from the form
Given user is on the task tab form
When user gives a wrong title
And clicks the cancel button
Then the form is removed

Scenario: to check that the deal mentioned in the task form is present in the deal drop down box
Given user has enter the deal in the task form
When user clicks on the deal button
Then the deal is present in the deal dropdown box



