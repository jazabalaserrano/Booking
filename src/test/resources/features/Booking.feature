@Booking
Feature: Avianca Test Booking
  As an Avianca operator, I would like to search for a flight.

  @SearchFlight
  Scenario Outline: Search Flight
    Given As an Avianca operator, I would like to search for a flight. <row>
      | ExcelRoute                                      | sheet            |
      | src/test/resources/datadriven/SearchFlight.xlsx | IndividuallyFrom |
    When enter the data in the Avianca main page.
    Then I successfully chose the flight that I wanted.

    Examples: 
      | row |
      |   1 |
      |   2 |
    
