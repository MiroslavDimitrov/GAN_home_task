Feature: GAN

  @Test
  Scenario: Create a new user
    Given the suer is on the home page
    When user clicks on the Join now button
    Then user verifies that he is on the homepage
    And the user fills in details in the About you section
    And the user fills in details in the Address details section
