@wip
Feature: searching for a flight on kayak


  Scenario: searching for and selecting cheapest flight for next weekend.
    Given user on the kayak
    When user search for a trip between two cities of your choice for the next weekend
    And users go to the offer page
    And select cheapest ticket
    Then verify that the offer is the same as the one listed in kayak
