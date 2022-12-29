@NesineAutomation
@LoginScenarios
Feature: Nesine Login Scenarios

  Background:
    Given The User Starts Nesine App
    And The User Skips Learning Screen
    When The User Clicks "Login" Button In Main Page
    Then The User Should Arrive "Login" Page

  @ValidLogin @Positive
  Scenario: Successful User Login
    Given The User Starts Nesine App
    And The User Fills Username As "akkaya040"
    And The User Fills Password As "123456Aa"
    When The User Clicks Login Button In Login Page
    Then The User Should See UserId In Main Page
    When The User Clicks "Account" Button In Main Page
    Then The User Should Arrive "Account" Page
    And The User Clicks "Logout" Button In Account Page
    When The User Confirms Logout Message Popup
    Then The User Should Arrive "Main" Page

  @InvalidLogin @Negative
  Scenario: Unsuccessful User Login
    And The User Fills Username As "TestTest"
    And The User Fills Password As "TestTest"
    When The User Clicks Login Button In Login Page
    Then The User Should See Error Message Popup
    When The User Confirms Error Message Popup
    Then The User Should Arrive "Login" Page
