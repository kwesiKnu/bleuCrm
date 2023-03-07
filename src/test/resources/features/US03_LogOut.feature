Feature:  As a user, I should be able to logout.


  Scenario: Verify the Users log out from the app
    Given  the user is on the homepage
    When user click the user profile name
    And user select the “Log Out” option
    Then verify the user back to the login page
