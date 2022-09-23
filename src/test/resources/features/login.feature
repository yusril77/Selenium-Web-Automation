Feature: Login

  Scenario: Successfully logged in
    Given I already on log in page
    When I input username "standard_user"
    And I input password "secret_sauce"
    And I click login button
    Then Should be directed to Inventory Page