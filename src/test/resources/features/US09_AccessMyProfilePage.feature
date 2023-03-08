Feature: As a user, I want to access my profile page.


  Scenario: Verify the users view all options on my profile page
    Given user is on the homepage
    When user click the user profile
    Then verify the user see following options:
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | conversations |
