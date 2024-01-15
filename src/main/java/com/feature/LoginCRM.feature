Feature: Free CRM Login Feature Test

  #Scenario: Free CRM Login Test Scenario
  
  #Given User should be on login page
  #When Title of login page is Free CRM
  #Then User enters username and password
  #Then User clcik on login button
  #And User should be on home page
  #Then close the browser
  
  
  
  Scenario Outline: Free CRM Login Test Scenario
    Given User should be on login page
    When Title of login page is Free CRM
    Then User enters "<username>" and "<password>"
    Then User clcik on login button
    And User should be on home page
    Then close the browser

    Examples: 
      | username                    | password  |
      | naveek                      | test@123  |
      | ajaybalajikadam69@gmail.com | edulab321 |

      
      