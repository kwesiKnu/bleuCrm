Feature:  As a user, I want to see mobile app options to download.

  @kwesi
  Scenario: Verify users can see mobile app options
    Given user is on the homepage
    Then verify the user can see following mobile app options:
      | APP STORE   |
      | GOOGLE PLAY |