Feature: Mobile example
  As a potential client
  I want to interact with the mobile application

  @Mobile
  Scenario: The client starts the applicacion ApiDemos accesing to Bouncing Balls
    Given The user opens the 'API Demos' application
    When The user clicks over 'Animation' menu element 
    And The user clicks over 'Bouncing Balls' menu element
    Then The user sees the application 'Animation/Bouncing Balls' open
