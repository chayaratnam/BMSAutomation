Feature: City Search Module

Scenario: Search and select a valid city
  Given user is on BookMyShow homepage
  When user searches for city "Chennai"
  And user selects the city icon
  Then city should be selected successfully

Scenario: Search for an invalid/non-existing city
  Given user is on BookMyShow homepage
  When user searches for city "InvalidCity"
  Then an error message should be displayed
