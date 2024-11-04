Feature: Through the creation of a new user, I need to check the password creation requirements.

  Scenario Outline: Invalid password
    Given the user is on the login page
    When the user clicks on the Join button
    Then user verifies that he is on the homepage
    When the user fills in details in the About you section
    And the user fills in details in the Address details section
    And the user fills in all fields in the Security section except password
    And the user types in <passwordValue> in the password fields
    And the confirms the password with the same <passwordValue> value
    And the user clicks on the Join button
    Then the user can see an error message for invalid password

    Examples:
      | passwordValue |
      | Pass@         |
      | 012345        |
      | p1            |
      | password      |
      | @#$%^&        |
      | 123@#         |

    Scenario Outline: Valid password
      Given the user is on the login page
      When the user clicks on the Join button
      Then user verifies that he is on the homepage
      When the user fills in details in the About you section
      And the user fills in details in the Address details section
      And the user fills in all fields in the Security section except password
      And the user types in <passwordValue> in the password fields
      And the confirms the password with the same <passwordValue> value
      And the user clicks on the Join button
      Then the user can see taht he successfully has created a new user

      Examples:
        | passwordValue |
        | 12#$Pw        |