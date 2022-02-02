Feature: Using the application
  In order to be able to purchase products
  I need to be able to login

  Scenario: Tracy wants to use the application.
  She isn`t sure about accessing her account.

    Given that Tracy has decided to access his account
    When she try to login to the application
    Then she should be able to access his account

  Scenario: Peter locked his account.
  She hasn't used her account for a long time.
  She expected account to be locked

    Given that Peter has decided to access his account
    When he try to login using locked account
    Then he should not be able to access his account

