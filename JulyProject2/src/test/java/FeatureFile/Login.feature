Feature: Adactine Ticket Booking

  @regression_run
  Scenario: Adactin Login
    Given User is Launch the application
    When User is enter the username in username field
    And User is enter the password in password field
    Then User is enter the Submit Button

  Scenario: Search Hotel Details
    Given User is enter the Location
    And  User is enter the username in username field
