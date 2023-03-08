Feature: As a user, I want to access the Drive page.


  Scenario: Verify the users view all modules in the Drive page.
    Given  the user is on the homepage
    When user clicks the Drive module
    Then verify the user sees following options:
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |
      | Drive Cleanup              |
