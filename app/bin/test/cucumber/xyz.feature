@Login
Feature: testing

  Background:
    Given precondition

  @Test1
  Scenario Outline : Verify login functionality
    Given Step 1 "<username>" and "<password>"
    Examples:-
      | username | password |
      | abc      | 12345    |
      | xyz      | 12345    |

  @Test2
  Scenario: Verify login functionality(negative)

    Given Step 1
    And step 2
      | username | password
      | xyz      | &&*()0))

    When step 3
    Then step 4
    But step 5