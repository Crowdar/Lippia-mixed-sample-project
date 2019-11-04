Feature: Login on test web page
  Como un usuario de test web page
  Quiero efectuar el login
  Para ver la pagina principal

  @Example
  Scenario Outline: Login on test web page
    Given I want to go to test web page main page
    When I complete the username field as '<username>'
    And I complete the password field with '<password>'
    And I perform a click on sigin button
    Then I verify the main logued user page is displayed

    Examples: 
      | username 												 | password |
      | martin.marussi+3@wolox.com.ar    | Nubi2020 |
