Feature: Sorting Items

  Scenario Outline: Problem 4
    Given I already logged in
    And I select an item "add-to-cart-sauce-labs-onesie"
    When I clicked sorting "<Sort>"
    Then The products should automatically sorted to "<Sort>"
    When I select an item "add-to-cart-test.allthethings()-t-shirt-(red)"
    When I click Cart icon
    And I redirected to Cart Page
    And I remove one item
    And I click continue shopping buttons
    Then Should be directed to Inventory Page
    Examples:
    |Sort |
    |za |