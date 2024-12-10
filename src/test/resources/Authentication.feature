# Created by gpandey at 10/12/2024
Feature: Authentication
  This feature file contains test related to authentication

  Scenario: Verify user lands on email entry screen when email login option is selected
    Given higi app is launched
    And user clicks on get started button
    And user clicks on already have an account link
    When user selects email login option
    Then user validates email entry screen