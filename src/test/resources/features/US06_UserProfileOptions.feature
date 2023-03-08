Feature: As a user, I should be able to see all the options under the user profile.


  Scenario: Verify the users view all options under the profile
    Given user is on the homepage
    When user click the profile name
    Then verify the user sees following  options:
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Logout                  |

