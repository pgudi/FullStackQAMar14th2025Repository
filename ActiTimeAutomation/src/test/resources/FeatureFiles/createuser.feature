@Execute
Feature: Validate Create User functionality

  Scenario Outline: Verify Create User Functionality
    Given I launch the Chrome Browser
    And I navigate the Application URL
    When I enter "<username>" in username text field
    And I enter "<password>" in password text field
    And I click on SignIn button
    Then I find the Home Page
    And I minimize the flyout window
    When I click on User Menu
    And I click on Add User button
    When I enter firstname in firstname text field
    And I enter lastname in lastname text field
    And I enter email in email text field
    And I enter username in username text field of userpage
    And I enter password in password text field of userpage
    And I enter password in retypepassword text field of userpage
    And I click on create user button in userpage
    Then I find the created user in the user list page
    When I click on newly created user
    And I click on Delete User button
    And I click on OK button in Alert Window
    Given I find the Logout Link in Home Page
    When I click on Logout Link
    Then I find the Login Page
    And I close Chrome Browser

    Examples:
      | username | password |
      | admin    | manager  |