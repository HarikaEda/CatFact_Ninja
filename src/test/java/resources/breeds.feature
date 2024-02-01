@breeds
Feature: Breeds

  Scenario: TC_01
    Given "breeds" path parameters are prepared for the request
    And "limit" query parameter is set 5 for request
    When GET request sent response is saved
    Then verify response status code is 200
    Then verify the "breed" phenomenon of the "Aegean" key value of the object in the 1 index

  Scenario: TC_02
    Given "breeds" path parameters are prepared for the request
    And "limit" query parameter is set 2 for request
    When GET request sent response is saved
    Then verify response status code is 200
    Then verify it is verified that there are 2 objects in the returned data
