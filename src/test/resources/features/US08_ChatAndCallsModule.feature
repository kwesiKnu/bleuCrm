Feature:  As a user, I should be able to access the Chat and Calls module.


  Scenario: Verify the users view all options in the Chat and Calls module
    Given  the user is on the homepage
    When user clicks the Chat and Calls module
    Then verify the user sees the following options:
      | Message       |
      | Notifications |
      | Settings      |
      | Active Stream |
