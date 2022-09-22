Feature: Remove Items

  Scenario: Remove items from Cart
    Given I already logged in
    When User clicked cart icon
    And Directed to cart page
    And User clicked Remove Button for one of the items
    Then Item should be removed from cart