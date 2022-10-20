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