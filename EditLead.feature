Feature: Editing an existing lead

Scenario Outline:
Given click the lead link
And click the find lead option
And provide the search criteria to fetch the leads <firstname>
And click the find leads button to search based upon he given search criteria
And click on the lead to be editted from the searched leads
And verify the page title to vlaidate the screen
And click edit to make change for the selected lead
And change the company name to a new name <newcompanyname>
When click update
Then the lead is updated with new company name <newcompanyname>

Examples:
|firstname|newcompanyname|
|Rohit|New New ABC ltd.|
