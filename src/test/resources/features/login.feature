Feature: Login Module

  Scenario: Login with valid mobile number
    Given user is on BookMyShow homepage
    When user clicks Sign in
    And user enters mobile number "7569463977"
    Then user should see OTP screen

  Scenario: Login with invalid mobile number
    Given user is on BookMyShow homepage
    When user clicks Sign in
    And user enters mobile number "987654"
    Then user should see error message