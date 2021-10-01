@regression
Feature: Ebay Search Shirts Functionality

Scenario: Search for Shirts
    Given Open Ebay Homepages
    When Search for Shirts
    Then Item list should have only Shirts related products