Feature: Login and logout functionality New

  Scenario: Verify Login functionality
    Given I launch chrome Browser
    And I navigate the Application URL
    And I find the login page
    When I enter username in username text field
    And I enter password in password text field
    And I click on Login button
    Then I find the Home Page
    And I minimize the flyout window
    Given I find the Home Page
    When I click on logout link
    Then I find the login page
    And I close the application