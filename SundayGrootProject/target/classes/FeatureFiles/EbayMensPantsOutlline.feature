@regression
Feature: Man Pants outline
Senario:Senario outline: men pants with brand
Given open Ebay website
When Search for "<Items>"
And Fiter by "<Brand>" 
Then list selected "<Brand>" display


Examples:
        |Items  |Brand |
        |Joggar |nike  |
        |Jeans  |Levis |    
        |Short  |gucci |
          
        