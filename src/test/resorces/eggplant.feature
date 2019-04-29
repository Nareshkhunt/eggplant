@eggplant
Feature: wikipedia search item
  As a user
  I want to search for a product
  So that i can verify the seach functionalty
  Scenario: search for schipperke
    Given User is on Home Page of www.wikipedia.org
    When User type "schipperke" in search box
    Then the product description should be displayed
