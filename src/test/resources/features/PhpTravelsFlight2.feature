#@flightFeature
#Feature: Php Travels flight feature
#
#  Background: User is logged in
##    Given User opens the "PhpTravels" application
##    And User reached to "Home" page
##    And User logins the application as "User1"
#    Given User logs into application "PhpTravels" as "user1"
#
#
#
#  @flightSearch
#  Scenario: Verify that user is able to search flights
#    Given User navigates to "FLIGHTS" tab
#    And User selects the "ONE WAY" radio button
#    And User selects the flight type as "Economy"
#    And User sets the "FROM" as ""
#    And User sets the "TO" as ""
#    And User sets the departure date as ""
#    And User sets the passenger count as below
#      | Adults | Child | Infants |
#      | 2      | 1     | 0       |
#    And User clicks the "Search" button
#    And Verify that search result should be displayed
#
#
#  @flightBooking4
#  Scenario: Verify correct booking details should be displayed on booking page4
#    Given User navigates to "FLIGHTS" tab
#    And User search flight with details as below
#      | Return | Seat Type | Source | Destination | Date       | Adults | Child | Infants |
#      | FALSE  | Economy   | LHE    | DXB         | 2021-01-15 | 2      | 1     | 0       |
#    And User reached to "Booking" page
#    Then Verify that user details for "User1" are displayed
#    And Verify that booking summary should be displayed as below
#      | Return | Seat Type | Source | Destination | Date       | Adults | Child | Infants |
#      | FALSE  | Economy   | LHE    | DXB         | 2021-01-15 | 2      | 1     | 0       |
#
#  @flightBooking5
#  Scenario: Verify correct booking details should be displayed on booking page5
#    Given User navigates to "FLIGHTS" tab
#    And User search flight with details as below
#      | Return | Seat Type | Source | Destination | Date       | Adults | Child | Infants |
#      | FALSE  | Economy   | LHE    | DXB         | 2021-01-15 | 2      | 1     | 0       |
#    And User reached to "Booking" page
#    Then Verify that user details for "User1" are displayed
#    And Verify that booking summary should be displayed as below
#      | Return | Seat Type | Source | Destination | Date       | Adults | Child | Infants |
#      | FALSE  | Economy   | LHE    | DXB         | 2021-01-15 | 2      | 1     | 0       |