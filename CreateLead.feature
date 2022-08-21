Feature: Creating a Lead in CRM application

Scenario Outline:
Given Clicking on the Lead button
And Opt for Create Lead
And Provide company name <companyname>
And Provide first name <firstname>
And Provide last name <lastname>
And Provide local name <localname>
And Provide department name <deptname>
And Provide description <description>
And Provide emailid <emailid>
And Provide state <state>
When Create button is clicked
Then Lead should be created and capture the page title to verify

Examples:
|companyname|firstname|lastname|localname|deptname|description|emailid|state|
|ABC1 ltd.|Rohit|Kumar|Rohit|Automation|Through Cucumber|abc1@gmail.com|Alabama|
|XYZ1 ltd.|Vikram|Kumar|VK|Automation|Through Cucumber|xyz1@gmail.com|Alabama|