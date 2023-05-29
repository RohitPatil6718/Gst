Feature: Testing Gst project

  Scenario Outline: Testing Credentials & Add invoice feature
    Given person getting to login page
    And user enters "<username>" & "<password>"
    Then hit login button
    Then user gets on home page and verify Title
    And user clicks on add invoice button
    Then user selects invoice catagory from dropdown
    Then user Selects invoice type from dropdown
    Then user Enters "<BuyerName>"
    Then user Enters "<BuyerGSTIN>"
    Then user Enters "<InvNO>"
    Then user selects invoice date
    Then user selects supply type from dropdown
    Then user selects place of supply  from dropdown
    Then user selects GSTR1 return period
    Then user selects Reverse charge from dropdown
    Then user selects is amended or not
    Then user clicks on add line item button
    Then user enters "<HSN/SAC>"
    Then user enters "<ItemName>"
    Then user enters "<QtyOfItem>"
    Then user selects UQC from dropdown
    Then user Enters "<TaxableAmt>"
    Then user clicks on save changes ri8 tick
    Then user will click on submit button
    Then user closes browser

    Examples: 
      | username                       | password | BuyerName | BuyerGSTIN      | InvNo  | HSN/SAC | ItemName | QtyOfItem | TaxableAmt |
      | anshitmehrotra@mastersindia.co | Test@123 | Arundhati | 27AAFCA1026J1ZZ | Inv887 | 488DyC  | Chairs   |       100 |      10000 |
