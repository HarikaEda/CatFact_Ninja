@facts
Feature: Facts

  Scenario: TC_01
    Given "fact" path parameters are prepared for the request
    And "max_length" query parameter is set 35 for request
    When GET request sent response is saved
    Then verify response status code is 200
    Then verifies that the random faction returning verify is less than 35 characters

  Scenario: TC_02
    Given "facts" path parameters are prepared for the request
    And "max_length" query parameter is set 45 for request
    And "limit" query parameter is set 7 for request
    When GET request sent response is saved
    Then verify response status code is 200
    Then verify it is verified that there are 7 objects in the returned data
    Then verify that each fact is less than 45 characters