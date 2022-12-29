@NesineAutomation
@AccountScenarios
Feature: Nesine Account Scenarios

  Background:
    Given The User Starts Nesine App
    And The User Skips Learning Screen
    When The User Clicks "Login" Button In Main Page
    Then The User Should Arrive "Login" Page
    And The User Fills Username As "akkaya040"
    And The User Fills Password As "123456Aa"
    When The User Clicks Login Button In Login Page
    Then The User Should See UserId In Main Page

  @AddingRandomPromotionCode @Negative
  Scenario: Adding Random Promotion Code
    When The User Clicks "Account" Button In Main Page
    Then The User Should Arrive "Account" Page
    When The User Clicks "Promotions" Button In Account Page
    Then The User Should Arrive "Promotions" Page
    And The User Fills Random Promotion Code
    And The User Fills Captcha Code
#    When The User Clicks Load Button
#    Then The User Should See Code Error Message
    And The User Clicks Close Button In Promotions Page
    Then The User Should Arrive "Account" Page

  @ControlAccountInformations
  Scenario: Control Account Information
    And The User Stores UserId In Main Page
    When The User Clicks "Account" Button In Main Page
    Then The User Should Arrive "Account" Page
    When The User Clicks "Personal Info" Button In Account Page
    Then The User Should Arrive "Personal Info" Page
    And The User Confirms Stored UserId
