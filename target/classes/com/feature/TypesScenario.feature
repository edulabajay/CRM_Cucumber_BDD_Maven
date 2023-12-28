

# One Feature contains one or more than one scenarios

  Feature: Login Functionality
  As a user
  I want to login to the application
  So that I can access my account

  Scenario: Successful Login
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be logged in successfully

  Scenario: Invalid Credentials
    Given the user is on the login page
    When the user enters invalid credentials
    Then an error message should be displayed

  Scenario: Forgot Password
    Given the user is on the login page
    When the user clicks on the "Forgot Password" link
    Then the user should be redirected to the password recovery page
 
 #one .Feature file contains one or more than one Feature file  
   
  Feature: Login Functionality
  As a user
  I want to login to the application
  So that I can access my account

  Scenario: Successful Login
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be logged in successfully

  Scenario: Invalid Credentials
    Given the user is on the login page
    When the user enters invalid credentials
    Then an error message should be displayed

Feature: Registration Process
  As a new user
  I want to create an account
  So that I can access the application

  Scenario: Successful Registration
    Given the user is on the registration page
    When the user enters valid registration details
    Then the user should be registered successfully

  Scenario: Existing Email Registration
    Given the user is on the registration page
    When the user enters an email that is already registered
    Then an error message should be displayed
 
 #simple testing with tags  
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

#data driven testing with tags
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
