Feature: Add to cart

  Scenario: Problem 3
    Given I already logged in
    When I select an item "add-to-cart-sauce-labs-onesie"
    Then Item should be added
    When I click Cart icon
    And I redirected to Cart Page
    And I click Checkout button
    And I redirected to Checkout page one
    And I input first name "fauzan"
    And I input last name "fauzan77"
    And I input zip 99999
    And I click continue button
    And I redirected to Checkout page two
    Then I click finish button
    And I redirected to Checkout complete page