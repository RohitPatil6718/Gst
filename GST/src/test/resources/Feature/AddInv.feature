Feature: Testing Gst project

Background:
Given User Navigates to login page


  Scenario Outline: Testing Credentials & Add invoice feature
    
    And user enters "<username>" & "<password>"
    Then hits on Sign In button
    Then user gets on home page and verify Title
    And user clicks on data import button
    And user clicks on add invoice button
    Then user selects invoice catagory from dropdown
    Then user Selects invoice type from dropdown
    Then user Enters "<SupplierName>"
    Then user Enters "<SupplierGSTIN>"
    Then user Enters "<InvoiceNo>"
    Then user selects invoice date
    Then user selects supply type from dropdown
    Then user selects place of supply  from dropdown
    Then user selects GSTR2	 return period
    Then user selects Reverse charge from dropdown
    Then user clicks on add line item button
    Then user enters "<HsnSac>"
    Then user enters "<ItemName>"
    Then user enters "<QtyOfItem>"
    Then user selects UQC from dropdown
    Then user Enters "<TaxableAmt>"
    Then user clicks on save changes ri8 tick
    Then user will click on submit button
    Then user closes browser

    Examples: 
      | username                       | password |  |SupplierName|SupplierGSTIN|InvoiceNo|HsnSac|ItemName|QtyOfItem|TaxableAmt|
	      | anshitmehrotra@mastersindia.co | Test@123 | Arundhati |27AAFCA1026J1ZZ|87ABk|877HDFS|Chairs|10|130000|
     