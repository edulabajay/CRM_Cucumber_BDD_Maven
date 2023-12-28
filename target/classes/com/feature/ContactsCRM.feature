Feature: Free CRM Create New Contacts

  #Scenario: Scenario for create new contacts
  #Given User should be on login page
  #When Title of login page is Free CRM
  #Then User enters username and password
  #Then User clcik on login button
  #And User should be on home page
  #Then user redirect to new conatct page
  #Then user will click on create conatct button
  #Then user enters first name and middle name and last name and company name
  #Then user click on save button
  Scenario Outline: Free CRM Login Test Scenario
    Given User should be on login page
    When Title of login page is Free CRM
    Then User enters "<username>" and "<password>"
    Then User clcik on login button
    And User should be on home page
    Then user redirect to new conatct page
    Then user will click on create conatct button
    Then user enters "<first name>" and "<middle name>" and "<last name>" and "<company name>"
    Then user click on save button
    Then close the browser

    Examples: 
      | username                    | password  | first name | middle name | last name | company name    |
      | ajaybalajikadam69@gmail.com | edulab321 | Pritsh     | edulab      | kamle     | edulab exchange |
      | ajaybalajikadam69@gmail.com | edulab321 | ganesh     | ravsab      | madne     | edulab exchange |
      | test@gmail.com              | edulab321 | kaka       | edulab      | divekar   | edulab exchange |
