Feature: Test Login functionality
  Scenario Outline: Test if a user can login
    Given User is on the Login page
    When User enters <username> and <password>
    And User clicks login button
    Then User Logs out

    Examples:
      | username | password |
      | Peter    | 12345    |