Feature: Query Postcode Details
  As a deliverer
  I want to check that the post code I am given is correct
  To ensure I deliver my goods to the right place

  Scenario Outline: Valid postcodes should return a success status
    Given a postcode <postcode>
    When I check the validity of the postcode
    Then the response status should be <status>

    Examples:
      | postcode | status | Meaning   |
      | SW1P4JA  | 200    | Success   |
      | INVALID  | 404    | Not Found |
