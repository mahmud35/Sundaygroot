@regression
Feature: Ebay Search Shoes Functionality

Scenario: Search for Shoes
    Given Open Ebay Homepages
    When Search for Shoes
    Then Item list should have only Shoes related products