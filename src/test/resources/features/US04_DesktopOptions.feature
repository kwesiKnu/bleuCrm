Feature: As a user, I should be able to see desktop options to download.


  Scenario: Verify users can see desktop app options
    Given  the user is on the homepage
    Then verify the users see flowing desktop options:
      | MAC OS  |
      | WINDOWS |
      | LINUX   |
