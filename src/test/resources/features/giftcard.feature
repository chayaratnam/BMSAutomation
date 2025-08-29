Feature: Gift Card Module

Scenario: Check invalid gift card balance
  Given user is on BookMyShow homepage
  When user opens Gift Card section
  And user clicks Check Gift Card Balance
  And user enters card number "098765"
  And user submits
  Then user should see an error message
