Feature: Validate Login Functionality

  Background:
    Given initialise browser

  @Smokelt
  Scenario: Validate email label
    When User click on login button
    Then Verify email label

  @Smokelt
  Scenario: Validate password label
    When User click on login button
    Then Verify password label

  @Smokel
  Scenario: Verify that user should get error message when user login without username.
    When User click on login button
    And User enter password on login page
    And User click on login button on login page
    Then Validate user should get error message when user login without username

  @Smokel
  Scenario: Verify that user should get error message when user login without password.
    When User click on login button
    And User enter username
    And User click on login button on login page
    Then Validate user should get error message when user login without password

  @Smokel
  Scenario: Verify that user should get error message when user enter invalid username.
    When User click on login button
    And User enter invalid username
    And User enter password on login page
    And User click on login button on login page
    Then Validate user should get error message when user enter invalid username

  @Smokel
  Scenario: Verify that user should get error message when user enter invalid password.
    When User click on login button
    And User enter username
    And User enter invalid password on login page
    And User click on login button on login page
    Then Validate user should get error message when user enter invalid password

  @Smokel
  Scenario: Verify page navigation flow for forgot password button
    When User click on login button
    And User click on forgot password button
    Then Validate user should be navigate to forgot password page

  @Smokel
  Scenario: Verify page navigation flow for register password button
    When User click on login button
    And User click on register button on login page
    Then Validate user should be navigate to register page

  @Smokel
  Scenario: Verify login information on login page
    When User click on login button
    Then Validate login information on login page

  @Smokel
  Scenario: Verify page title on login page
    When User click on login button
    Then Validate page title on login page

  @Smokel
  Scenario: Verify login should be successful with valid credentials
    When User click on login button
    And User enter username
    And User enter password
    And User click on login button on login page
    Then Verify user should be login successfully








