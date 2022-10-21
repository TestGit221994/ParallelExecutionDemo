Feature: Validate Login Functionality

  Background:
    Given initialise browser

  @Smoke @Test
  Scenario: Validate email label
    When User click on login button
    Then Verify email label

  @Smoke
  Scenario: Validate password label
    When User click on login button
    Then Verify password label

