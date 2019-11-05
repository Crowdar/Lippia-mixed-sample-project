Feature: Login
  As a nubi user
  I want to perform a login
  To verify the behavior

  Scenario Outline: Login 
    Given I want to go to test web page main page
    When I perform login with username: '<username>' and password: '<password>'
    Then I verify the main logued user page is displayed

    Examples: 
      | username 												 | password |
      | martin.marussi+3@wolox.com.ar    | Nubi2020 |
