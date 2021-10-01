@regression
Feature: Ebay Men Watch outline

  Scenario Outline: Search Men Watch  with brand
    Given Open Ebay website
    When Search for "<Items>"
    And Filter by "<Brand>"
    Then list of selected "<Brand>" display
Examples: 
      | Items              |    Brand        |
      | Analog             |    Seiko        |
      | Digital            |    Casio        |  
      | Analog & Digital   |    Citizen      |