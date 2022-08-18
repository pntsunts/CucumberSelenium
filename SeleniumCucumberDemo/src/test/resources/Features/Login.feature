Feature: Test Login functionality
  Scenario Outline: Test if a user can login
    Given User is on the Login page
    When User enters <username> and <password>
    Then User clicks login button

    Examples:
      | username | password |
      | Peter    | peter@123    |