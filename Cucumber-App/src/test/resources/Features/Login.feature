Feature: Login
  Scenario: Successful login with valid credentials
    Given User launch Chrome driver
    When User open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User Enters Email as "admin@yourstore.com" and Password as "admin"
    And User clicks Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User clicks logs out
    Then Page Title should be "Your store. Login"
    And Close Browser
