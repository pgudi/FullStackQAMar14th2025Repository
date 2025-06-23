@Execute
Feature: Validate Login and Logout functionality

  Scenario Outline: Verify Login Functionality
    Given I launch the Chrome Browser
    And I navigate the Application URL
    When I enter "<username>" in username text field
    And I enter "<password>" in password text field
    And I click on SignIn button
    Then I find the Home Page
    And I minimize the flyout window
    Given I find the Logout Link in Home Page
    When I click on Logout Link
    Then I find the Login Page
    And I close Chrome Browser

    Examples:
      | username | password |
      | admin    | manager  |




