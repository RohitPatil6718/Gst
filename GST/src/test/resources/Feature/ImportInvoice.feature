Feature: Testing Gst project

  Scenario Outline: We Testing import invoice feature
    Given user1 navigates to login page
    And user1 enters "<username>" & "password"
    And user1 clicks on login button
    Then user1 clicks on data import button
    Then user1 clicks on import button
    Then user1 will select document type from the dropdown
    Then user1 clicks on choose file button
    Then user1 clicks on submit button
    And closes the browser

    Examples: 
      | username                       | password |
      | anshitmehrotra@mastersindia.co | Test@123 |
