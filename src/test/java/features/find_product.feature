Feature: Using the application
  After I successfully sign in
  I would expected to be able to choose product for purchase.

  Scenario: Tracy wants to select a product.
  She wants to see all items.

    Given that Tracy access his account
    When she select a product Sauce Labs Backpack
    Then she should be able see Sauce Labs Backpack details

  Scenario: Marko wants to add a product to his cart
  She hasn't used her account for a long time.
  She expected account to be logged

    Given that Marko access his account
    When he add a product Sauce Labs Backpack to cart
    And he should be able to navigate to cart
    Then he should be able to see Sauce Labs Backpack in his char

