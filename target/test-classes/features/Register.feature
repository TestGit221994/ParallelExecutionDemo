#@Epic("E001")
#@Feature(" Feature : Register")
#@Story(" Story : Register")
Feature: Validate Register Functionality

  Background:
    Given initialise browser

  @Smoke
  Scenario: Validate register label
    When User click on register button
    Then Verify register label

  @Smoke
  Scenario: Validate your personal details label
    When User click on register button
    Then Verify your personal details label

  @Smoke
  Scenario: Verify that User should get error message when user trying to register without enter first name field.
    When User click on register button
    And User select gender
    And User enter last name
    And User select birthdate
    And User enter email
    And User company name
    And User enter password
    And User enter confirm password
    And User click on submit button
    Then Verify error message when user trying to register without enter first name field

  @Smoke
  Scenario: Verify that User should get error message when user trying to register without enter last name field.
    When User click on register button
    And User select gender
    And User enter first name
    And User select birthdate
    And User enter email
    And User company name
    And User enter password
    And User enter confirm password
    And User click on submit button
    Then Verify error message when user trying to register without enter last name field

  @Smoke
  Scenario: Verify that User should get error message when user trying to register without enter Email field.
    When User click on register button
    And User select gender
    And User enter first name
    And User enter last name
    And User select birthdate
    And User company name
    And User enter password
    And User enter confirm password
    And User click on submit button
    Then Verify error message when user trying to register without enter email field

  @Smoke
  Scenario: Verify that User should get error message when user trying to register without enter Password field.
    When User click on register button
    And User select gender
    And User enter first name
    And User enter last name
    And User select birthdate
    And User enter email
    And User company name
    And User click on submit button
    Then Verify error message when user trying to register without enter password field

  @Smoke
  Scenario: Verify that User should get error message when password and confirm password not matched.
    When User click on register button
    And User select gender
    And User enter first name
    And User enter last name
    And User select birthdate
    And User enter email
    And User company name
    And User enter password
    And User enter invalid confirm password
    And User click on submit button
    Then Verify error message when password and confirm password not matched.

  @Smoke
  Scenario: Verify that User should get error message when password is incorrect.
    When User click on register button
    And User select gender
    And User enter first name
    And User enter last name
    And User select birthdate
    And User enter email
    And User company name
    And User enter invalid password
    And User click on submit button
    Then Verify error message when password is incorrect.

  @Smoke
  Scenario: Verify that User should get success message of registration.
    When User click on register button
    And User select gender
    And User enter first name
    And User enter last name
    And User select birthdate
    And User enter email
    And User company name
    And User enter password
    And User enter confirm password
    And User click on submit button
    Then Verify User should get success message of registration
