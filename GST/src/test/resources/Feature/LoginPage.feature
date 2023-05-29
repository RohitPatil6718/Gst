Feature: Testing Gst Enterpsise software

  Scenario: Testing login functionality
    Given user is on login page
    Then user enters username
    Then user enters password
    Then user clicks on login button
    Then verify Title of page
