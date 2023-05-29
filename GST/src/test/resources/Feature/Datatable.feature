Feature: Testing Gst Software

  Scenario: checking login functionality
    Given user navigates to login page
    Then user entering credentials
      | anshitmehrotra@mastersindia.co | Test@123 |
    And clicks on login button
    And checks title of homepage
