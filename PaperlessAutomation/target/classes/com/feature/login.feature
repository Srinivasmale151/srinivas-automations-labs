Feature: login functionality

  Scenario Outline: login with username and password
    Given User visit the fit factory application
    And User enter "<Username>" and "<Password>"
    And User click on sign in button
    Then User logged into fit factory home page successfully.

    Examples: 
      | Username | Password |
      | Admin     | admin123 |
