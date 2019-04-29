@login
Feature: Login
  Description: This feature is to test the login functionality
Background:
  Given User is on Home Page
  Scenario: Successful Login with Valid Credentials
    When User enters Username and Password
    And Clicks Go button
    Then User should logged in gmail acount

  Scenario: successful logout
    When User enters Username and Password
    And Clicks Go button
    Then User should logged in gmail acount
    When User Click LogOut button
    Then User should successful Logged out from gmail acount
