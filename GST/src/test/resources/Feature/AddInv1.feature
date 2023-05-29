Feature: Testing Gst proj

  Background: 
    Given all user navigates to login page

  Scenario Outline: All users Login with valid credentials
    Then user enters valid "<email>" & "<password>"
    And all clicks on login button
    Then all user gets on home page and verify Title
    And all user clicks on data import button
    And all user clicks on add invoice button
    Then all user selects invoice catagory from dropdown
    Then all user Selects invoice type from dropdown
    Then he user Enters "<BuyerName>"
    Then All user Enters "<BuyerGSTIN>"
    Then All user Enters "<InvoiceNo>"
    Then all user selects invoice date
    Then all user selects supply type from dropdown
    Then all user selects place of supply  from dropdown
    Then all user selects GSTR1 return period
    Then all user selects Reverse charge from dropdown
    Then all user selects is amended or not
    Then all user clicks on add line item button
    Then he user enters "<HsnSac>"
    Then he user enters "<ItemName>"
    Then he user enters "<QuantityOfItem>"
    Then all user selects UQC from dropdown
    Then he user Enters "<Taxable amt>"
    Then all user clicks on save changes ri8 tick
    Then all user will click on submit button
    Then all user closes browser

    Examples: 
      | email                          | password | BuyerName | BuyerGSTIN      | InvoiceNo | HsnSac  | ItemName | QuantityOfItem | Taxable amt |
      | anshitmehrotra@mastersindia.co | Test@123 | Arundhati | 27AAFCA1026J1ZZ | 3857dj    | 3848dka | Chairs   |            100 |     1000000 |
