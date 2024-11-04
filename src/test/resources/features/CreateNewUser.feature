Feature: As a new user I want to make a new registration
  so I can be able to play online.

  @Test
  Scenario: Create a new user
    Given the suer is on the registration page
    When user clicks on the Join now button
    Then user verifies that he is on the homepage
    When the user fills in details in the About you section
    And the user fills in details in the Address details section
    And the user clicks on the Join button
    Then the user verify the unmarked terms and conditions
