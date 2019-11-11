Feature: Unlink the first bank account
  Como un usuario de test web page
  Quiero efectuar la desvinculación de una cuenta
  Para no tenerla mas configurada

  @Example
  Scenario Outline: Unlink the first bank account
    Given I want to go to test web page main page
    When I complete the username field as '<username>'
    And I complete the password field with '<password>'
    And I perform a click on sigin button
    Then I verify the main logued user page is displayed
    Given I must be on the user main page
    When I want to unlink the first bank account
    And I accept the unlink related bank account modal
    And I accept the unlink related bank account success modal
    Then I verify the main logued user page is displayed
    And I verify the bank account is not linked
    
 
    Examples: 
      | username 												 | password |
      | martin.marussi+3@wolox.com.ar    | Nubi2020 |